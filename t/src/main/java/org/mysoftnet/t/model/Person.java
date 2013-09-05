
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Person__c object.
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
@Table(name="Person__c")
@Entity(name="Person")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Person extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a04";


    protected User createdBy;
    protected User lastModifiedBy;
    protected String firstName;
    protected String lastName;
    protected MapLocation location;
    

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
    
    @Column(name="FirstName__c")
    public String getFirstName() {
        return this.firstName;
    }
    
    @Basic(optional=false)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="LastName__c")
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="Location__c")
    public MapLocation getLocation() {
        return this.location;
    }
    
    public void setLocation(MapLocation location) {
        this.location = location;
    }
    
    






}