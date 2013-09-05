
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CollaborationGroupMember object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
 *     Read   : true
 *     Update : true
 *     Delete : true
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="CollaborationGroupMember")
@Entity(name="CollaborationGroupMember")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CollaborationGroupMember extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0FB";


    protected CollaborationGroup collaborationGroup;
    protected User memberId;
    protected NotificationFrequencyEnum notificationFrequency;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CollaborationGroupId")
    public CollaborationGroup getCollaborationGroup() {
        return this.collaborationGroup;
    }
    
    @Basic(optional=false)
    public void setCollaborationGroup(CollaborationGroup collaborationGroup) {
        this.collaborationGroup = collaborationGroup;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getMemberId() {
        return this.memberId;
    }
    
    @Basic(optional=false)
    public void setMemberId(User memberId) {
        this.memberId = memberId;
    }
    
    @Enumerated(value=EnumType.STRING)
    public NotificationFrequencyEnum getNotificationFrequency() {
        return this.notificationFrequency;
    }
    
    public void setNotificationFrequency(NotificationFrequencyEnum notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CreatedById")
    public User getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
    
    @Version
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LastModifiedById")
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    




    /**
     * Java model for the NotificationFrequency picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum NotificationFrequencyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        EMAIL_ON_EACH_POST(true,false,"Email on Each Post","P"),
        DAILY_DIGESTS(true,false,"Daily Digests","D"),
        WEEKLY_DIGESTS(true,false,"Weekly Digests","W"),
        NEVER(true,true,"Never","N"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private NotificationFrequencyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean isActive() { return this.isActive; }

        @Override
        public boolean isDefaultValue() { return this.isDefaultValue; }

        @Override
        public String label() { return this.label; }

        @Override
        public String value() { return this.value; }

        public static NotificationFrequencyEnum fromValue(String value) {
            if (value == null) return null;

            for (NotificationFrequencyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    






}