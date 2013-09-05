
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ContactInformation__c object.
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
@Table(name="ContactInformation__c")
@Entity(name="ContactInformation")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ContactInformation extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a03";


    protected User createdBy;
    protected User lastModifiedBy;
    protected String address;
    protected Person person;
    protected String email;
    protected String homePhone;
    protected String bussinesPhone;
    protected String mobilePhone;
    

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
    
    @Column(name="Address__c")
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="Person__c")
    public Person getPerson() {
        return this.person;
    }
    
    @Basic(optional=false)
    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Column(name="Email__c")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="HomePhone__c")
    public String getHomePhone() {
        return this.homePhone;
    }
    
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    
    @Column(name="BussinesPhone__c")
    public String getBussinesPhone() {
        return this.bussinesPhone;
    }
    
    public void setBussinesPhone(String bussinesPhone) {
        this.bussinesPhone = bussinesPhone;
    }
    
    @Column(name="MobilePhone__c")
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    









}