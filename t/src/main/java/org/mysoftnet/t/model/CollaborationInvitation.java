
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CollaborationInvitation object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
 *     Read   : true
 *     Update : false
 *     Delete : true
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="CollaborationInvitation")
@Entity(name="CollaborationInvitation")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CollaborationInvitation extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0H1";


    protected CollaborationInvitation parentId;
    // sharedEntityId possible references:
    // CollaborationGroup
    // User
    protected String sharedEntityId;
    protected User inviterId;
    protected String invitedUserEmail;
    protected String invitedUserEmailNormalized;
    protected StatusEnum status;
    protected String optionalMessage;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public CollaborationInvitation getParentId() {
        return this.parentId;
    }
    
    public void setParentId(CollaborationInvitation parentId) {
        this.parentId = parentId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getSharedEntityId() {
        return this.sharedEntityId;
    }
    
    @Basic(optional=false)
    public void setSharedEntityId(String sharedEntityId) {
        this.sharedEntityId = sharedEntityId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getInviterId() {
        return this.inviterId;
    }
    
    @Basic(optional=false)
    public void setInviterId(User inviterId) {
        this.inviterId = inviterId;
    }
    
    public String getInvitedUserEmail() {
        return this.invitedUserEmail;
    }
    
    @Basic(optional=false)
    public void setInvitedUserEmail(String invitedUserEmail) {
        this.invitedUserEmail = invitedUserEmail;
    }
    
    public String getInvitedUserEmailNormalized() {
        return this.invitedUserEmailNormalized;
    }
    
    @Basic(optional=false)
    public void setInvitedUserEmailNormalized(String invitedUserEmailNormalized) {
        this.invitedUserEmailNormalized = invitedUserEmailNormalized;
    }
    
    @Enumerated(value=EnumType.STRING)
    public StatusEnum getStatus() {
        return this.status;
    }
    
    @Basic(optional=false)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    
    public String getOptionalMessage() {
        return this.optionalMessage;
    }
    
    public void setOptionalMessage(String optionalMessage) {
        this.optionalMessage = optionalMessage;
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

        SENT(true,false,null,"Sent"),
        ACCEPTED(true,false,null,"Accepted"),
        CANCELED(true,false,null,"Canceled"),
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