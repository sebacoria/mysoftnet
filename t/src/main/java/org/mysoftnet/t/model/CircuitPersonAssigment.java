
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CircuitPersonAssigment__c object.
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
@Table(name="CircuitPersonAssigment__c")
@Entity(name="CircuitPersonAssigment")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CircuitPersonAssigment extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a09";


    protected User createdBy;
    protected User lastModifiedBy;
    protected Person person;
    protected PersonType personType;
    protected Circuit circuit;
    

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
    @Column(name="Person__c")
    public Person getPerson() {
        return this.person;
    }
    
    @Basic(optional=false)
    public void setPerson(Person person) {
        this.person = person;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="PersonType__c")
    public PersonType getPersonType() {
        return this.personType;
    }
    
    @Basic(optional=false)
    public void setPersonType(PersonType personType) {
        this.personType = personType;
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
    
    






}