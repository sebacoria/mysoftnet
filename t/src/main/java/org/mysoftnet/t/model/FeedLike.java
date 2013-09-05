
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com FeedLike object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
 *     Read   : false
 *     Update : false
 *     Delete : true
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="FeedLike")
@Entity(name="FeedLike")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class FeedLike extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0I0";


    // feedItemId possible references:
    // CollaborationGroupFeed
    // ContentDocumentFeed
    // FeedItem
    // NewsFeed
    // UserFeed
    // UserProfileFeed
    protected String feedItemId;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected boolean isDeleted;
    protected User insertedBy;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getFeedItemId() {
        return this.feedItemId;
    }
    
    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
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