
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContentVersionHistory object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
 *     Read   : true
 *     Update : false
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="ContentVersionHistory")
@Entity(name="ContentVersionHistory")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContentVersionHistory extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "";


    protected boolean isDeleted;
    protected ContentVersion contentVersion;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected FieldEnum field;
    protected String oldValue;
    protected String newValue;
    

    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ContentVersionId")
    public ContentVersion getContentVersion() {
        return this.contentVersion;
    }
    
    @Basic(optional=false)
    public void setContentVersion(ContentVersion contentVersion) {
        this.contentVersion = contentVersion;
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
    
    @Enumerated(value=EnumType.STRING)
    public FieldEnum getField() {
        return this.field;
    }
    
    @Basic(optional=false)
    public void setField(FieldEnum field) {
        this.field = field;
    }
    
    public String getOldValue() {
        return this.oldValue;
    }
    
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }
    
    public String getNewValue() {
        return this.newValue;
    }
    
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
    
    






    /**
     * Java model for the Field picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum FieldEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        AVGRATING(true,false,null,"AvgRating"),
        CONTENTMODIFIEDBY(true,false,null,"ContentModifiedBy"),
        CONTENTMODIFIEDDATE(true,false,null,"ContentModifiedDate"),
        CONTENTURL(true,false,null,"ContentUrl"),
        CREATED(true,false,"Created.","created"),
        DESCRIPTION(true,false,null,"Description"),
        EXTERNALDATASOURCE(true,false,null,"ExternalDataSource"),
        EXTERNALDOCUMENTINFO1(true,false,null,"ExternalDocumentInfo1"),
        EXTERNALDOCUMENTINFO2(true,false,null,"ExternalDocumentInfo2"),
        FEATUREDCONTENTBOOST(true,false,null,"FeaturedContentBoost"),
        FEATUREDCONTENTDATE(true,false,null,"FeaturedContentDate"),
        FEEDEVENT(true,false,"Feed event","feedEvent"),
        FILETYPE(true,false,null,"FileType"),
        FIRSTPUBLISHLOCATION(true,false,null,"FirstPublishLocation"),
        ISPUBLIC(true,false,null,"IsPublic"),
        LANGUAGE(true,false,null,"Language"),
        MAXRATING(true,false,null,"MaxRating"),
        MINRATING(true,false,null,"MinRating"),
        NEGATIVERATINGCOUNT(true,false,null,"NegativeRatingCount"),
        OWNER(true,false,null,"Owner"),
        OWNERACCEPTED(true,false,"Owner (Accepted)","ownerAccepted"),
        OWNERASSIGNMENT(true,false,"Owner (Assignment)","ownerAssignment"),
        POSITIVERATINGCOUNT(true,false,null,"PositiveRatingCount"),
        PUBLISHSTATUS(true,false,null,"PublishStatus"),
        RATINGCOUNT(true,false,null,"RatingCount"),
        REASONFORCHANGE(true,false,null,"ReasonForChange"),
        LOCKED(true,false,"Record locked.","locked"),
        UNLOCKED(true,false,"Record unlocked.","unlocked"),
        REFERENCE(true,false,null,"Reference"),
        SUGGESTEDTAGS(true,false,null,"SuggestedTags"),
        TITLE(true,false,null,"Title"),
        CONTENTVERSIONCOMMENTED(true,false,"Version Commented","contentVersionCommented"),
        CONTENTVERSIONCREATED(true,false,"Version Created","contentVersionCreated"),
        CONTENTVERSIONDELETED(true,false,"Version Deleted","contentVersionDeleted"),
        CONTENTVERSIONDOWNLOADED(true,false,"Version Downloaded","contentVersionDownloaded"),
        VERSIONNUMBER(true,false,null,"VersionNumber"),
        CONTENTVERSIONRATED(true,false,"Version Rated","contentVersionRated"),
        CONTENTVERSIONUPDATED(true,false,"Version Updated","contentVersionUpdated"),
        CONTENTVERSIONVIEWED(true,false,"Version Viewed","contentVersionViewed"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private FieldEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static FieldEnum fromValue(String value) {
            if (value == null) return null;

            for (FieldEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    



}