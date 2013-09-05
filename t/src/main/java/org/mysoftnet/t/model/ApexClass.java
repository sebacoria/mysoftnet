
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ApexClass object.
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
@Table(name="ApexClass")
@Entity(name="ApexClass")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ApexClass extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "01p";


    protected String namespacePrefix;
    protected String name;
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