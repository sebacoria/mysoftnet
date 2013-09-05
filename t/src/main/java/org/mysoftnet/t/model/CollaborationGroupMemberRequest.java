
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CollaborationGroupMemberRequest object.
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
@Table(name="CollaborationGroupMemberRequest")
@Entity(name="CollaborationGroupMemberRequest")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CollaborationGroupMemberRequest extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0I5";


    protected CollaborationGroup collaborationGroup;
    protected User requesterId;
    protected String responseMessage;
    protected StatusEnum status;
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
    public User getRequesterId() {
        return this.requesterId;
    }
    
    @Basic(optional=false)
    public void setRequesterId(User requesterId) {
        this.requesterId = requesterId;
    }
    
    public String getResponseMessage() {
        return this.responseMessage;
    }
    
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    
    @Enumerated(value=EnumType.STRING)
    public StatusEnum getStatus() {
        return this.status;
    }
    
    @Basic(optional=false)
    public void setStatus(StatusEnum status) {
        this.status = status;
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
     * Java model for the Status picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum StatusEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PENDING(true,false,null,"Pending"),
        ACCEPTED(true,false,null,"Accepted"),
        DECLINED(true,false,null,"Declined"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private StatusEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static StatusEnum fromValue(String value) {
            if (value == null) return null;

            for (StatusEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    






}