
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com TaskStatus object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
 *     Read   : true
 *     Update : false
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="TaskStatus")
@Entity(name="TaskStatus")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class TaskStatus extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "";


    protected String masterLabel;
    protected int sortOrder;
    protected boolean isDefault;
    protected boolean isClosed;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected User lastModifiedBy;
    protected java.util.Calendar lastModifiedDate;
    protected java.util.Calendar systemModstamp;
    

    public String getMasterLabel() {
        return this.masterLabel;
    }
    
    public void setMasterLabel(String masterLabel) {
        this.masterLabel = masterLabel;
    }
    
    public int getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
    
    public boolean getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
    
    public boolean getIsClosed() {
        return this.isClosed;
    }
    
    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
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
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LastModifiedById")
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
    
    










}