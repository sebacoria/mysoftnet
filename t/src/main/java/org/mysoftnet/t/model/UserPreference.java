
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com UserPreference object.
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
@Table(name="UserPreference")
@Entity(name="UserPreference")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class UserPreference extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "03u";


    protected User userId;
    protected PreferenceEnum preference;
    protected String value;
    protected java.util.Calendar systemModstamp;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getUserId() {
        return this.userId;
    }
    
    @Basic(optional=false)
    public void setUserId(User userId) {
        this.userId = userId;
    }
    
    @Enumerated(value=EnumType.STRING)
    public PreferenceEnum getPreference() {
        return this.preference;
    }
    
    @Basic(optional=false)
    public void setPreference(PreferenceEnum preference) {
        this.preference = preference;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    



    /**
     * Java model for the Preference picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum PreferenceEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        VALUE_57(true,false,"Event Reminder Default Lead Time","57"),
        VALUE_58(true,false,"Task Reminder Default Time","58"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private PreferenceEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static PreferenceEnum fromValue(String value) {
            if (value == null) return null;

            for (PreferenceEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    



}