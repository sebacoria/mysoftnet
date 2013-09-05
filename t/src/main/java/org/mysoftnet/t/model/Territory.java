
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Territory__c object.
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
@Table(name="Territory__c")
@Entity(name="Territory")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Territory extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a05";


    protected User createdBy;
    protected User lastModifiedBy;
    protected double number;
    protected Congregation congregation;
    

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
    
    @Column(name="number__c")
    public double getNumber() {
        return this.number;
    }
    
    @Basic(optional=false)
    public void setNumber(double number) {
        this.number = number;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="Congregation__c")
    public Congregation getCongregation() {
        return this.congregation;
    }
    
    public void setCongregation(Congregation congregation) {
        this.congregation = congregation;
    }
    
    





}