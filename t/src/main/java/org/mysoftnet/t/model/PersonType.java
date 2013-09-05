
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com PersonType__c object.
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
@Table(name="PersonType__c")
@Entity(name="PersonType")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class PersonType extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a07";


    protected User createdBy;
    protected User lastModifiedBy;
    protected String description;
    protected String code;
    

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
    
    @Column(name="Description__c")
    public String getDescription() {
        return this.description;
    }
    
    @Basic(optional=false)
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="Code__c")
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    





    /**
     * Java model for the Code__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum CodeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PUBLIC(true,true,"PUBLIC","PUBLIC"),
        ELDER(true,false,"ELDER","ELDER"),
        MINISTERIAL_SERVANT(true,false,"MINISTERIAL_SERVANT","MINISTERIAL_SERVANT"),
        PUBLICATOR(true,false,"PUBLICATOR","PUBLICATOR"),
        REGULAR_PIONEER(true,false,"REGULAR_PIONEER","REGULAR_PIONEER"),
        AXULIARY_PIONEER(true,false,"AXULIARY_PIONEER","AXULIARY_PIONEER"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private CodeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static CodeEnum fromValue(String value) {
            if (value == null) return null;

            for (CodeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}