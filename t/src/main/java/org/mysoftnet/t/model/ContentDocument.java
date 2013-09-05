
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContentDocument object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
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
@Table(name="ContentDocument")
@Entity(name="ContentDocument")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContentDocument extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "069";


    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected User lastModifiedBy;
    protected java.util.Calendar lastModifiedDate;
    protected boolean isDeleted;
    protected User owner;
    protected java.util.Calendar systemModstamp;
    protected String title;
    protected PublishStatusEnum publishStatus;
    protected ContentVersion latestPublishedVersion;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CreatedById")
    public User getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
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
    
    @Version
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="OwnerId")
    public User getOwner() {
        return this.owner;
    }
    
    @Basic(optional=false)
    public void setOwner(User owner) {
        this.owner = owner;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Basic(optional=false)
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Enumerated(value=EnumType.STRING)
    public PublishStatusEnum getPublishStatus() {
        return this.publishStatus;
    }
    
    @Basic(optional=false)
    public void setPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LatestPublishedVersionId")
    public ContentVersion getLatestPublishedVersion() {
        return this.latestPublishedVersion;
    }
    
    public void setLatestPublishedVersion(ContentVersion latestPublishedVersion) {
        this.latestPublishedVersion = latestPublishedVersion;
    }
    
    










    /**
     * Java model for the PublishStatus picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum PublishStatusEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        UPLOAD_INTERRUPTED(true,true,"Upload Interrupted","U"),
        PUBLIC(true,false,"Public","P"),
        PERSONAL_LIBRARY(true,false,"Personal Library","R"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private PublishStatusEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static PublishStatusEnum fromValue(String value) {
            if (value == null) return null;

            for (PublishStatusEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    


}