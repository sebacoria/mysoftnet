
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Name object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
 *     Read   : false
 *     Update : false
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="Name")
@Entity(name="Name")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Name extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "";


    protected String name;
    protected String lastName;
    protected String firstName;
    protected TypeEnum type;
    protected String alias;
    protected UserRole userRole;
    protected boolean isActive;
    protected Profile profile;
    protected String title;
    protected String email;
    protected String phone;
    protected String username;
    

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Enumerated(value=EnumType.STRING)
    public TypeEnum getType() {
        return this.type;
    }
    
    public void setType(TypeEnum type) {
        this.type = type;
    }
    
    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="UserRoleId")
    public UserRole getUserRole() {
        return this.userRole;
    }
    
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    
    public boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ProfileId")
    public Profile getProfile() {
        return this.profile;
    }
    
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    





    /**
     * Java model for the Type picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        CIRCUIT__C(true,false,null,"Circuit__c"),
        CIRCUITPERSONASSIGMENT__C(true,false,null,"CircuitPersonAssigment__c"),
        COLLABORATIONGROUP(true,false,null,"CollaborationGroup"),
        CONGREGATION__C(true,false,null,"Congregation__c"),
        CONGREGATIONPERSONASSIGMENT__C(true,false,null,"CongregationPersonAssigment__c"),
        CONTACTINFORMATION__C(true,false,null,"ContactInformation__c"),
        CONTENTDOCUMENT(true,false,null,"ContentDocument"),
        CONTENTVERSION(true,false,null,"ContentVersion"),
        MAP__C(true,false,null,"Map__c"),
        MAPAREA__C(true,false,null,"MapArea__c"),
        MAPAREAPOINT__C(true,false,null,"MapAreaPoint__c"),
        MAPLOCATION__C(true,false,null,"MapLocation__c"),
        MYENTITY__C(true,false,null,"MyEntity__c"),
        PERSON__C(true,false,null,"Person__c"),
        PERSONTYPE__C(true,false,null,"PersonType__c"),
        QUEUE(true,false,null,"Queue"),
        SELFSERVICEUSER(true,false,null,"SelfServiceUser"),
        TERRITORY__C(true,false,null,"Territory__c"),
        USER(true,false,null,"User"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static TypeEnum fromValue(String value) {
            if (value == null) return null;

            for (TypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    









}