
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com EntitySubscription object.
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
@Table(name="EntitySubscription")
@Entity(name="EntitySubscription")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class EntitySubscription extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0E8";


    // parentId possible references:
    // CircuitPersonAssigment__c
    // Circuit__c
    // CollaborationGroup
    // CongregationPersonAssigment__c
    // Congregation__c
    // ContactInformation__c
    // ContentDocument
    // MapAreaPoint__c
    // MapArea__c
    // MapLocation__c
    // Map__c
    // MyEntity__c
    // PersonType__c
    // Person__c
    // Territory__c
    // User
    protected String parentId;
    protected User subscriber;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected boolean isDeleted;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ParentId")
    public String getParentId() {
        return this.parentId;
    }
    
    @Basic(optional=false)
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="SubscriberId")
    public User getSubscriber() {
        return this.subscriber;
    }
    
    @Basic(optional=false)
    public void setSubscriber(User subscriber) {
        this.subscriber = subscriber;
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
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }
    
    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    






}