
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Circuit__c object.
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
@Table(name="Circuit__c")
@Entity(name="Circuit")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Circuit extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a01";


    protected User createdBy;
    protected User lastModifiedBy;
    protected double number;
    protected String part;
    

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
    
    @Column(name="Number__c")
    public double getNumber() {
        return this.number;
    }
    
    @Basic(optional=false)
    public void setNumber(double number) {
        this.number = number;
    }
    
    @Column(name="Part__c")
    public String getPart() {
        return this.part;
    }
    
    public void setPart(String part) {
        this.part = part;
    }
    
    





}