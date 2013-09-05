
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContentDocumentLink object.
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
@Table(name="ContentDocumentLink")
@Entity(name="ContentDocumentLink")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContentDocumentLink extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "06A";


    // linkedEntityId possible references:
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
    // Organization
    // PersonType__c
    // Person__c
    // Territory__c
    // User
    protected String linkedEntityId;
    protected ContentDocument contentDocument;
    protected boolean isDeleted;
    protected java.util.Calendar systemModstamp;
    protected ShareTypeEnum shareType;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LinkedEntityId")
    public String getLinkedEntityId() {
        return this.linkedEntityId;
    }
    
    @Basic(optional=false)
    public void setLinkedEntityId(String linkedEntityId) {
        this.linkedEntityId = linkedEntityId;
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
    
    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    @Enumerated(value=EnumType.STRING)
    public ShareTypeEnum getShareType() {
        return this.shareType;
    }
    
    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }
    
    






    /**
     * Java model for the ShareType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum ShareTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        VIEWER(true,false,"Viewer","V"),
        COLLABORATOR(true,false,"Collaborator","C"),
        INFERRED(true,false,"Inferred","I"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private ShareTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static ShareTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (ShareTypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}