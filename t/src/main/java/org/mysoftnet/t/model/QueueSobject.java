
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com QueueSobject object.
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
@Table(name="QueueSobject")
@Entity(name="QueueSobject")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class QueueSobject extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "03g";


    protected Group queue;
    protected SobjectTypeEnum sobjectType;
    protected User createdBy;
    protected java.util.Calendar systemModstamp;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="QueueId")
    public Group getQueue() {
        return this.queue;
    }
    
    @Basic(optional=false)
    public void setQueue(Group queue) {
        this.queue = queue;
    }
    
    @Enumerated(value=EnumType.STRING)
    public SobjectTypeEnum getSobjectType() {
        return this.sobjectType;
    }
    
    @Basic(optional=false)
    public void setSobjectType(SobjectTypeEnum sobjectType) {
        this.sobjectType = sobjectType;
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
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    



    /**
     * Java model for the SobjectType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum SobjectTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        CIRCUIT__C(true,false,null,"Circuit__c"),
        CONGREGATION__C(true,false,null,"Congregation__c"),
        MAP__C(true,false,null,"Map__c"),
        MYENTITY__C(true,false,null,"MyEntity__c"),
        PERSON__C(true,false,null,"Person__c"),
        PERSONTYPE__C(true,false,null,"PersonType__c"),
        TERRITORY__C(true,false,null,"Territory__c"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private SobjectTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static SobjectTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (SobjectTypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    



}