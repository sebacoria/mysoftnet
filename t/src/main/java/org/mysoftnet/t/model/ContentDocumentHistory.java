
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContentDocumentHistory object.
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
@Table(name="ContentDocumentHistory")
@Entity(name="ContentDocumentHistory")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContentDocumentHistory extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "";


    protected boolean isDeleted;
    protected ContentDocument contentDocument;
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
    @Column(name="ContentDocumentId")
    public ContentDocument getContentDocument() {
        return this.contentDocument;
    }
    
    @Basic(optional=false)
    public void setContentDocument(ContentDocument contentDocument) {
        this.contentDocument = contentDocument;
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

        ARCHIVEDBY(true,false,null,"ArchivedBy"),
        ARCHIVEDDATE(true,false,null,"ArchivedDate"),
        CREATED(true,false,"Created.","created"),
        DELETEDBY(true,false,null,"DeletedBy"),
        DELETEDDATE(true,false,null,"DeletedDate"),
        CONTENTDOCPUBLISHED(true,false,"Document Added To Library","contentDocPublished"),
        CONTENTDOCFEATURED(true,false,"Document Featured","contentDocFeatured"),
        CONTENTDOCREPUBLISHED(true,false,"Document Re-added To Library","contentDocRepublished"),
        CONTENTDOCUNPUBLISHED(true,false,"Document Removed From Library","contentDocUnpublished"),
        CONTENTDOCSUBSCRIBED(true,false,"Document Subscribed to","contentDocSubscribed"),
        CONTENTDOCUNSUBSCRIBED(true,false,"Document Unsubscribed to","contentDocUnsubscribed"),
        FEEDEVENT(true,false,"Feed event","feedEvent"),
        ISARCHIVED(true,false,null,"IsArchived"),
        OWNER(true,false,null,"Owner"),
        OWNERACCEPTED(true,false,"Owner (Accepted)","ownerAccepted"),
        OWNERASSIGNMENT(true,false,"Owner (Assignment)","ownerAssignment"),
        PARENT(true,false,null,"Parent"),
        PUBLISHSTATUS(true,false,null,"PublishStatus"),
        LOCKED(true,false,"Record locked.","locked"),
        UNLOCKED(true,false,"Record unlocked.","unlocked"),
        TITLE(true,false,null,"Title"),
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