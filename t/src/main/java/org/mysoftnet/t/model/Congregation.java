
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Congregation__c object.
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
@Table(name="Congregation__c")
@Entity(name="Congregation")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Congregation extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a02";


    protected User createdBy;
    protected User lastModifiedBy;
    protected Circuit circuit;
    protected double number;
    protected String congregationName;
    

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
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="Circuit__c")
    public Circuit getCircuit() {
        return this.circuit;
    }
    
    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }
    
    @Column(name="number__c")
    public double getNumber() {
        return this.number;
    }
    
    @Basic(optional=false)
    public void setNumber(double number) {
        this.number = number;
    }
    
    @Column(name="congregation_name__c")
    public String getCongregationName() {
        return this.congregationName;
    }
    
    @Basic(optional=false)
    public void setCongregationName(String congregationName) {
        this.congregationName = congregationName;
    }    





}