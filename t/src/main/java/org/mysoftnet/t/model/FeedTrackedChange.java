
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com FeedTrackedChange object.
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
@Table(name="FeedTrackedChange")
@Entity(name="FeedTrackedChange")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class FeedTrackedChange extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0D6";


    // feedItemId possible references:
    // CollaborationGroupFeed
    // ContentDocumentFeed
    // FeedItem
    // NewsFeed
    // UserFeed
    // UserProfileFeed
    protected String feedItemId;
    protected String fieldName;
    protected String oldValue;
    protected String newValue;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getFeedItemId() {
        return this.feedItemId;
    }
    
    @Basic(optional=false)
    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
    
    public String getFieldName() {
        return this.fieldName;
    }
    
    @Basic(optional=false)
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    
    public String getOldValue() {
        return this.oldValue;
    }
    
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }
    
    public String getNewValue() {
        return this.newValue;
    }
    
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
    
    





}