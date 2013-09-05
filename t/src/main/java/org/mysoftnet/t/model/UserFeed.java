
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com UserFeed object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
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
@Table(name="UserFeed")
@Entity(name="UserFeed")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class UserFeed extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "";


    protected User parent;
    protected TypeEnum type;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected boolean isDeleted;
    protected java.util.Calendar lastModifiedDate;
    protected java.util.Calendar systemModstamp;
    protected int commentCount;
    protected int likeCount;
    protected String title;
    protected String body;
    protected java.net.URL linkUrl;
    protected ContentVersion relatedRecordId;
    protected String contentData;
    protected String contentFileName;
    protected String contentDescription;
    protected String contentType;
    protected int contentSize;
    protected User insertedBy;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ParentId")
    public User getParent() {
        return this.parent;
    }
    
    @Basic(optional=false)
    public void setParent(User parent) {
        this.parent = parent;
    }
    
    @Enumerated(value=EnumType.STRING)
    public TypeEnum getType() {
        return this.type;
    }
    
    public void setType(TypeEnum type) {
        this.type = type;
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
    
    @Version
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public int getCommentCount() {
        return this.commentCount;
    }
    
    @Basic(optional=false)
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    
    public int getLikeCount() {
        return this.likeCount;
    }
    
    @Basic(optional=false)
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    
    @Basic
    public java.net.URL getLinkUrl() {
        return this.linkUrl;
    }
    
    public void setLinkUrl(java.net.URL linkUrl) {
        this.linkUrl = linkUrl;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public ContentVersion getRelatedRecordId() {
        return this.relatedRecordId;
    }
    
    public void setRelatedRecordId(ContentVersion relatedRecordId) {
        this.relatedRecordId = relatedRecordId;
    }
    
    public String getContentData() {
        return this.contentData;
    }
    
    public void setContentData(String contentData) {
        this.contentData = contentData;
    }
    
    public String getContentFileName() {
        return this.contentFileName;
    }
    
    public void setContentFileName(String contentFileName) {
        this.contentFileName = contentFileName;
    }
    
    public String getContentDescription() {
        return this.contentDescription;
    }
    
    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }
    
    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    public int getContentSize() {
        return this.contentSize;
    }
    
    public void setContentSize(int contentSize) {
        this.contentSize = contentSize;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="InsertedById")
    public User getInsertedBy() {
        return this.insertedBy;
    }
    
    public void setInsertedBy(User insertedBy) {
        this.insertedBy = insertedBy;
    }
    
    



    /**
     * Java model for the Type picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        TRACKEDCHANGE(true,false,"Tracked Change","TrackedChange"),
        USERSTATUS(true,false,"User Status","UserStatus"),
        TEXTPOST(true,false,"Text Post","TextPost"),
        LINKPOST(true,false,"Link Post","LinkPost"),
        CONTENTPOST(true,false,"Content Post","ContentPost"),
        POLLPOST(true,false,"Poll","PollPost"),
        RYPPLEPOST(true,false,"Work.com Thanks","RypplePost"),
        DASHBOARDCOMPONENTSNAPSHOT(true,false,"Dashboard Component Snapshot","DashboardComponentSnapshot"),
        APPROVALPOST(true,false,"Approval Post","ApprovalPost"),
        CASECOMMENTPOST(true,false,"Case Comment Feed","CaseCommentPost"),
        REPLYPOST(true,false,"Reply Post","ReplyPost"),
        EMAILMESSAGEEVENT(true,false,"Email Message Feed","EmailMessageEvent"),
        CALLLOGPOST(true,false,"Call Log Feed","CallLogPost"),
        CHANGESTATUSPOST(true,false,"Change Status Feed","ChangeStatusPost"),
        ATTACHARTICLEEVENT(true,false,"Attached Article","AttachArticleEvent"),
        ACTIVITYEVENT(true,false,"Activity Change","ActivityEvent"),
        CHATTRANSCRIPTPOST(true,false,"Chat Transcript Post","ChatTranscriptPost"),
        COLLABORATIONGROUPCREATED(true,false,"Collaboration Group Created","CollaborationGroupCreated"),
        COLLABORATIONGROUPUNARCHIVED(true,false,"Collaboration Group Reactivated","CollaborationGroupUnarchived"),
        TWITTERPOST(true,false,"Twitter Post","TwitterPost"),
        FACEBOOKPOST(true,false,"Facebook Post","FacebookPost"),
        BASICTEMPLATEFEEDITEM(true,false,"Basic Template Post","BasicTemplateFeedItem"),
        CREATERECORDEVENT(true,false,"Created Record","CreateRecordEvent"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean isActive() { return this.isActive; }

        @Override
        public boolean isDefaultValue() { return this.isDefaultValue; }

        @Override
        public String label() { return this.label; }

        @Override
        public String value() { return this.value; }

        public static TypeEnum fromValue(String value) {
            if (value == null) return null;

            for (TypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    


















}