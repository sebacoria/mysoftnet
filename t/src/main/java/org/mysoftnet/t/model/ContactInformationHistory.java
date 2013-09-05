
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContactInformation__History object.
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
@Table(name="ContactInformation__History")
@Entity(name="ContactInformationHistory")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContactInformationHistory extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "";


    protected boolean isDeleted;
    protected ContactInformation parent;
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
    @Column(name="ParentId")
    public ContactInformation getParent() {
        return this.parent;
    }
    
    @Basic(optional=false)
    public void setParent(ContactInformation parent) {
        this.parent = parent;
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

        ADDRESS__C(true,false,null,"Address__c"),
        BUSSINESPHONE__C(true,false,null,"BussinesPhone__c"),
        CREATED(true,false,"Created.","created"),
        EMAIL__C(true,false,null,"Email__c"),
        FEEDEVENT(true,false,"Feed event","feedEvent"),
        HOMEPHONE__C(true,false,null,"HomePhone__c"),
        MOBILEPHONE__C(true,false,null,"MobilePhone__c"),
        NAME(true,false,null,"Name"),
        OWNERACCEPTED(true,false,"Owner (Accepted)","ownerAccepted"),
        OWNERASSIGNMENT(true,false,"Owner (Assignment)","ownerAssignment"),
        PERSON__C(true,false,null,"Person__c"),
        LOCKED(true,false,"Record locked.","locked"),
        UNLOCKED(true,false,"Record unlocked.","unlocked"),
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