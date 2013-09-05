
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CollaborationGroup object.
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
@Table(name="CollaborationGroup")
@Entity(name="CollaborationGroup")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CollaborationGroup extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0F9";


    protected int memberCount;
    protected CollaborationTypeEnum collaborationType;
    protected String description;
    protected User createdBy;
    protected User lastModifiedBy;
    protected String fullPhotoUrl;
    protected String smallPhotoUrl;
    protected java.util.Calendar lastFeedModifiedDate;
    protected String informationTitle;
    protected String informationBody;
    protected boolean hasPrivateFieldsAccess;
    

    public int getMemberCount() {
        return this.memberCount;
    }
    
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
    
    @Enumerated(value=EnumType.STRING)
    public CollaborationTypeEnum getCollaborationType() {
        return this.collaborationType;
    }
    
    @Basic(optional=false)
    public void setCollaborationType(CollaborationTypeEnum collaborationType) {
        this.collaborationType = collaborationType;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LastModifiedById")
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public String getFullPhotoUrl() {
        return this.fullPhotoUrl;
    }
    
    public void setFullPhotoUrl(String fullPhotoUrl) {
        this.fullPhotoUrl = fullPhotoUrl;
    }
    
    public String getSmallPhotoUrl() {
        return this.smallPhotoUrl;
    }
    
    public void setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
    }
    
    public java.util.Calendar getLastFeedModifiedDate() {
        return this.lastFeedModifiedDate;
    }
    
    @Basic(optional=false)
    public void setLastFeedModifiedDate(java.util.Calendar lastFeedModifiedDate) {
        this.lastFeedModifiedDate = lastFeedModifiedDate;
    }
    
    public String getInformationTitle() {
        return this.informationTitle;
    }
    
    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle;
    }
    
    public String getInformationBody() {
        return this.informationBody;
    }
    
    public void setInformationBody(String informationBody) {
        this.informationBody = informationBody;
    }
    
    public boolean getHasPrivateFieldsAccess() {
        return this.hasPrivateFieldsAccess;
    }
    
    public void setHasPrivateFieldsAccess(boolean hasPrivateFieldsAccess) {
        this.hasPrivateFieldsAccess = hasPrivateFieldsAccess;
    }
    
    



    /**
     * Java model for the CollaborationType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum CollaborationTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PUBLIC(true,false,"Public","Public"),
        PRIVATE(true,false,"Private","Private"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private CollaborationTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static CollaborationTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (CollaborationTypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    










}