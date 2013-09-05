
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ApexTrigger object.
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
@Table(name="ApexTrigger")
@Entity(name="ApexTrigger")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ApexTrigger extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "01q";


    protected String namespacePrefix;
    protected String name;
    protected TableEnumOrIdEnum tableEnumOrId;
    protected boolean usageBeforeInsert;
    protected boolean usageAfterInsert;
    protected boolean usageBeforeUpdate;
    protected boolean usageAfterUpdate;
    protected boolean usageBeforeDelete;
    protected boolean usageAfterDelete;
    protected boolean usageIsBulk;
    protected boolean usageAfterUndelete;
    protected double apiVersion;
    protected StatusEnum status;
    protected boolean isValid;
    protected double bodyCrc;
    protected String body;
    protected int lengthWithoutComments;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    

    public String getNamespacePrefix() {
        return this.namespacePrefix;
    }
    
    public void setNamespacePrefix(String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    @Enumerated(value=EnumType.STRING)
    public TableEnumOrIdEnum getTableEnumOrId() {
        return this.tableEnumOrId;
    }
    
    public void setTableEnumOrId(TableEnumOrIdEnum tableEnumOrId) {
        this.tableEnumOrId = tableEnumOrId;
    }
    
    public boolean getUsageBeforeInsert() {
        return this.usageBeforeInsert;
    }
    
    @Basic(optional=false)
    public void setUsageBeforeInsert(boolean usageBeforeInsert) {
        this.usageBeforeInsert = usageBeforeInsert;
    }
    
    public boolean getUsageAfterInsert() {
        return this.usageAfterInsert;
    }
    
    @Basic(optional=false)
    public void setUsageAfterInsert(boolean usageAfterInsert) {
        this.usageAfterInsert = usageAfterInsert;
    }
    
    public boolean getUsageBeforeUpdate() {
        return this.usageBeforeUpdate;
    }
    
    @Basic(optional=false)
    public void setUsageBeforeUpdate(boolean usageBeforeUpdate) {
        this.usageBeforeUpdate = usageBeforeUpdate;
    }
    
    public boolean getUsageAfterUpdate() {
        return this.usageAfterUpdate;
    }
    
    @Basic(optional=false)
    public void setUsageAfterUpdate(boolean usageAfterUpdate) {
        this.usageAfterUpdate = usageAfterUpdate;
    }
    
    public boolean getUsageBeforeDelete() {
        return this.usageBeforeDelete;
    }
    
    @Basic(optional=false)
    public void setUsageBeforeDelete(boolean usageBeforeDelete) {
        this.usageBeforeDelete = usageBeforeDelete;
    }
    
    public boolean getUsageAfterDelete() {
        return this.usageAfterDelete;
    }
    
    @Basic(optional=false)
    public void setUsageAfterDelete(boolean usageAfterDelete) {
        this.usageAfterDelete = usageAfterDelete;
    }
    
    public boolean getUsageIsBulk() {
        return this.usageIsBulk;
    }
    
    @Basic(optional=false)
    public void setUsageIsBulk(boolean usageIsBulk) {
        this.usageIsBulk = usageIsBulk;
    }
    
    public boolean getUsageAfterUndelete() {
        return this.usageAfterUndelete;
    }
    
    @Basic(optional=false)
    public void setUsageAfterUndelete(boolean usageAfterUndelete) {
        this.usageAfterUndelete = usageAfterUndelete;
    }
    
    public double getApiVersion() {
        return this.apiVersion;
    }
    
    @Basic(optional=false)
    public void setApiVersion(double apiVersion) {
        this.apiVersion = apiVersion;
    }
    
    @Enumerated(value=EnumType.STRING)
    public StatusEnum getStatus() {
        return this.status;
    }
    
    @Basic(optional=false)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    
    public boolean getIsValid() {
        return this.isValid;
    }
    
    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
    
    public double getBodyCrc() {
        return this.bodyCrc;
    }
    
    public void setBodyCrc(double bodyCrc) {
        this.bodyCrc = bodyCrc;
    }
    
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    
    public int getLengthWithoutComments() {
        return this.lengthWithoutComments;
    }
    
    @Basic(optional=false)
    public void setLengthWithoutComments(int lengthWithoutComments) {
        this.lengthWithoutComments = lengthWithoutComments;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
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
    
    @Version
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    




    /**
     * Java model for the TableEnumOrId picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TableEnumOrIdEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        COLLABORATIONGROUP(true,false,null,"CollaborationGroup"),
        COLLABORATIONGROUPMEMBER(true,false,null,"CollaborationGroupMember"),
        CONTENTDOCUMENT(true,false,null,"ContentDocument"),
        CONTENTVERSION(true,false,null,"ContentVersion"),
        FEEDCOMMENT(true,false,null,"FeedComment"),
        FEEDITEM(true,false,null,"FeedItem"),
        USER(true,false,null,"User"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TableEnumOrIdEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static TableEnumOrIdEnum fromValue(String value) {
            if (value == null) return null;

            for (TableEnumOrIdEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    











    /**
     * Java model for the Status picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum StatusEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        INACTIVE(true,false,"Inactive","Inactive"),
        ACTIVE(true,false,"Active","Active"),
        DELETED(true,false,"Deleted","Deleted"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private StatusEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static StatusEnum fromValue(String value) {
            if (value == null) return null;

            for (StatusEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    










}