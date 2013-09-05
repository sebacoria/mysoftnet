
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Scontrol object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
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
@Table(name="Scontrol")
@Entity(name="Scontrol")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Scontrol extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "01N";


    protected String name;
    protected String developerName;
    protected String description;
    protected EncodingKeyEnum encodingKey;
    protected String htmlWrapper;
    protected String filename;
    protected int bodyLength;
    protected String binary;
    protected ContentSourceEnum contentSource;
    protected boolean supportsCaching;
    protected String namespacePrefix;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    

    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDeveloperName() {
        return this.developerName;
    }
    
    @Basic(optional=false)
    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Enumerated(value=EnumType.STRING)
    public EncodingKeyEnum getEncodingKey() {
        return this.encodingKey;
    }
    
    @Basic(optional=false)
    public void setEncodingKey(EncodingKeyEnum encodingKey) {
        this.encodingKey = encodingKey;
    }
    
    public String getHtmlWrapper() {
        return this.htmlWrapper;
    }
    
    @Basic(optional=false)
    public void setHtmlWrapper(String htmlWrapper) {
        this.htmlWrapper = htmlWrapper;
    }
    
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public int getBodyLength() {
        return this.bodyLength;
    }
    
    @Basic(optional=false)
    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }
    
    public String getBinary() {
        return this.binary;
    }
    
    public void setBinary(String binary) {
        this.binary = binary;
    }
    
    @Enumerated(value=EnumType.STRING)
    public ContentSourceEnum getContentSource() {
        return this.contentSource;
    }
    
    public void setContentSource(ContentSourceEnum contentSource) {
        this.contentSource = contentSource;
    }
    
    public boolean getSupportsCaching() {
        return this.supportsCaching;
    }
    
    public void setSupportsCaching(boolean supportsCaching) {
        this.supportsCaching = supportsCaching;
    }
    
    public String getNamespacePrefix() {
        return this.namespacePrefix;
    }
    
    public void setNamespacePrefix(String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
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
     * Java model for the EncodingKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum EncodingKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        UTF_8(true,false,"Unicode (UTF-8)","UTF-8"),
        ISO_8859_1(true,false,"General US & Western Europe (ISO-8859-1, ISO-LATIN-1)","ISO-8859-1"),
        SHIFT_JIS(true,false,"Japanese (Shift-JIS)","Shift_JIS"),
        ISO_2022_JP(true,false,"Japanese (JIS)","ISO-2022-JP"),
        EUC_JP(true,false,"Japanese (EUC)","EUC-JP"),
        KS_C_5601_1987(true,false,"Korean (ks_c_5601-1987)","ks_c_5601-1987"),
        BIG5(true,false,"Traditional Chinese (Big5)","Big5"),
        GB2312(true,false,"Simplified Chinese (GB2312)","GB2312"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private EncodingKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static EncodingKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (EncodingKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    






    /**
     * Java model for the ContentSource picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum ContentSourceEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        HTML(true,false,"HTML","HTML"),
        URL(true,false,"URL","URL"),
        SNIPPET(true,false,"Snippet","Snippet"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private ContentSourceEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static ContentSourceEnum fromValue(String value) {
            if (value == null) return null;

            for (ContentSourceEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    








}