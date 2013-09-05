
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com FeedComment object.
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
@Table(name="FeedComment")
@Entity(name="FeedComment")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class FeedComment extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0D7";


    // feedItemId possible references:
    // CollaborationGroupFeed
    // ContentDocumentFeed
    // FeedItem
    // NewsFeed
    // UserFeed
    // UserProfileFeed
    protected String feedItemId;
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
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected String commentBody;
    protected boolean isDeleted;
    protected User insertedBy;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getFeedItemId() {
        return this.feedItemId;
    }
    
    @Basic(optional=false)
    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    
    public String getCommentBody() {
        return this.commentBody;
    }
    
    @Basic(optional=false)
    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }
    
    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="InsertedById")
    public User getInsertedBy() {
        return this.insertedBy;
    }
    
    @Basic(optional=false)
    public void setInsertedBy(User insertedBy) {
        this.insertedBy = insertedBy;
    }
    
    








}