
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ApexLog object.
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
@Table(name="ApexLog")
@Entity(name="ApexLog")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ApexLog extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "07L";


    protected User logUser;
    protected int logLength;
    protected java.util.Calendar lastModifiedDate;
    protected String request;
    protected String operation;
    protected String application;
    protected String status;
    protected int durationMilliseconds;
    protected java.util.Calendar systemModstamp;
    protected java.util.Calendar startTime;
    protected LocationEnum location;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LogUserId")
    public User getLogUser() {
        return this.logUser;
    }
    
    public void setLogUser(User logUser) {
        this.logUser = logUser;
    }
    
    public int getLogLength() {
        return this.logLength;
    }
    
    @Basic(optional=false)
    public void setLogLength(int logLength) {
        this.logLength = logLength;
    }
    
    @Version
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    public String getRequest() {
        return this.request;
    }
    
    @Basic(optional=false)
    public void setRequest(String request) {
        this.request = request;
    }
    
    public String getOperation() {
        return this.operation;
    }
    
    @Basic(optional=false)
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public String getApplication() {
        return this.application;
    }
    
    @Basic(optional=false)
    public void setApplication(String application) {
        this.application = application;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    @Basic(optional=false)
    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getDurationMilliseconds() {
        return this.durationMilliseconds;
    }
    
    @Basic(optional=false)
    public void setDurationMilliseconds(int durationMilliseconds) {
        this.durationMilliseconds = durationMilliseconds;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public java.util.Calendar getStartTime() {
        return this.startTime;
    }
    
    @Basic(optional=false)
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }
    
    @Enumerated(value=EnumType.STRING)
    public LocationEnum getLocation() {
        return this.location;
    }
    
    public void setLocation(LocationEnum location) {
        this.location = location;
    }
    
    












    /**
     * Java model for the Location picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum LocationEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        MONITORING(true,false,null,"Monitoring"),
        SYSTEMLOG(true,false,null,"SystemLog"),
        HEAPDUMP(true,false,null,"HeapDump"),
        PRESERVED(true,false,null,"Preserved"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private LocationEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static LocationEnum fromValue(String value) {
            if (value == null) return null;

            for (LocationEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}