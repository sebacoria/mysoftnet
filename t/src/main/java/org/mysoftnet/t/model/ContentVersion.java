
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContentVersion object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
 *     Read   : true
 *     Update : true
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="ContentVersion")
@Entity(name="ContentVersion")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContentVersion extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "068";


    protected ContentDocument contentDocument;
    protected boolean isLatest;
    protected java.net.URL contentUrl;
    protected String versionNumber;
    protected String title;
    protected String description;
    protected String reasonForChange;
    protected String pathOnClient;
    protected int ratingCount;
    protected boolean isDeleted;
    protected java.util.Calendar contentModifiedDate;
    protected User contentModifiedById;
    protected int positiveRatingCount;
    protected int negativeRatingCount;
    protected int featuredContentBoost;
    protected java.util.Date featuredContentDate;
    protected User owner;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected User lastModifiedBy;
    protected java.util.Calendar lastModifiedDate;
    protected java.util.Calendar systemModstamp;
    protected String tagCsv;
    protected String fileType;
    protected PublishStatusEnum publishStatus;
    protected String versionData;
    protected int contentSize;
    // firstPublishLocationId possible references:
    // CircuitPersonAssigment__c
    // Circuit__c
    // CollaborationGroup
    // CongregationPersonAssigment__c
    // Congregation__c
    // ContactInformation__c
    // MapAreaPoint__c
    // MapArea__c
    // MapLocation__c
    // Map__c
    // MyEntity__c
    // PersonType__c
    // Person__c
    // Territory__c
    // User
    protected String firstPublishLocationId;
    protected OriginEnum origin;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ContentDocumentId")
    public ContentDocument getContentDocument() {
        return this.contentDocument;
    }
    
    @Basic(optional=false)
    public void setContentDocument(ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
    }
    
    public boolean getIsLatest() {
        return this.isLatest;
    }
    
    public void setIsLatest(boolean isLatest) {
        this.isLatest = isLatest;
    }
    
    @Basic
    public java.net.URL getContentUrl() {
        return this.contentUrl;
    }
    
    public void setContentUrl(java.net.URL contentUrl) {
        this.contentUrl = contentUrl;
    }
    
    public String getVersionNumber() {
        return this.versionNumber;
    }
    
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Basic(optional=false)
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getReasonForChange() {
        return this.reasonForChange;
    }
    
    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }
    
    public String getPathOnClient() {
        return this.pathOnClient;
    }
    
    public void setPathOnClient(String pathOnClient) {
        this.pathOnClient = pathOnClient;
    }
    
    public int getRatingCount() {
        return this.ratingCount;
    }
    
    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
    
    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    public java.util.Calendar getContentModifiedDate() {
        return this.contentModifiedDate;
    }
    
    public void setContentModifiedDate(java.util.Calendar contentModifiedDate) {
        this.contentModifiedDate = contentModifiedDate;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getContentModifiedById() {
        return this.contentModifiedById;
    }
    
    public void setContentModifiedById(User contentModifiedById) {
        this.contentModifiedById = contentModifiedById;
    }
    
    public int getPositiveRatingCount() {
        return this.positiveRatingCount;
    }
    
    public void setPositiveRatingCount(int positiveRatingCount) {
        this.positiveRatingCount = positiveRatingCount;
    }
    
    public int getNegativeRatingCount() {
        return this.negativeRatingCount;
    }
    
    public void setNegativeRatingCount(int negativeRatingCount) {
        this.negativeRatingCount = negativeRatingCount;
    }
    
    public int getFeaturedContentBoost() {
        return this.featuredContentBoost;
    }
    
    public void setFeaturedContentBoost(int featuredContentBoost) {
        this.featuredContentBoost = featuredContentBoost;
    }
    
    public java.util.Date getFeaturedContentDate() {
        return this.featuredContentDate;
    }
    
    public void setFeaturedContentDate(java.util.Date featuredContentDate) {
        this.featuredContentDate = featuredContentDate;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="OwnerId")
    public User getOwner() {
        return this.owner;
    }
    
    public void setOwner(User owner) {
        this.owner = owner;
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
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public String getTagCsv() {
        return this.tagCsv;
    }
    
    public void setTagCsv(String tagCsv) {
        this.tagCsv = tagCsv;
    }
    
    public String getFileType() {
        return this.fileType;
    }
    
    @Basic(optional=false)
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    @Enumerated(value=EnumType.STRING)
    public PublishStatusEnum getPublishStatus() {
        return this.publishStatus;
    }
    
    @Basic(optional=false)
    public void setPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
    }
    
    public String getVersionData() {
        return this.versionData;
    }
    
    public void setVersionData(String versionData) {
        this.versionData = versionData;
    }
    
    public int getContentSize() {
        return this.contentSize;
    }
    
    public void setContentSize(int contentSize) {
        this.contentSize = contentSize;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="FirstPublishLocationId")
    public String getFirstPublishLocationId() {
        return this.firstPublishLocationId;
    }
    
    public void setFirstPublishLocationId(String firstPublishLocationId) {
        this.firstPublishLocationId = firstPublishLocationId;
    }
    
    @Enumerated(value=EnumType.STRING)
    public OriginEnum getOrigin() {
        return this.origin;
    }
    
    @Basic(optional=false)
    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
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
    





    /**
     * Java model for the Origin picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum OriginEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        CONTENT(true,true,"Content","C"),
        CHATTER(true,false,"Chatter","H"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private OriginEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static OriginEnum fromValue(String value) {
            if (value == null) return null;

            for (OriginEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}