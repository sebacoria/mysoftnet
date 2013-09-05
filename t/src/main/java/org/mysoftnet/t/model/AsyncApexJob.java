
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com AsyncApexJob object.
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
@Table(name="AsyncApexJob")
@Entity(name="AsyncApexJob")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class AsyncApexJob extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "707";


    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected JobTypeEnum jobType;
    protected ApexClass apexClass;
    protected StatusEnum status;
    protected int jobItemsProcessed;
    protected int totalJobItems;
    protected int numberOfErrors;
    protected java.util.Calendar completedDate;
    protected String methodName;
    protected String extendedStatus;
    protected AsyncApexJob parentJobId;
    protected String lastProcessed;
    protected int lastProcessedOffset;
    

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
    
    @Enumerated(value=EnumType.STRING)
    public JobTypeEnum getJobType() {
        return this.jobType;
    }
    
    @Basic(optional=false)
    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ApexClassId")
    public ApexClass getApexClass() {
        return this.apexClass;
    }
    
    public void setApexClass(ApexClass apexClass) {
        this.apexClass = apexClass;
    }
    
    @Enumerated(value=EnumType.STRING)
    public StatusEnum getStatus() {
        return this.status;
    }
    
    @Basic(optional=false)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    
    public int getJobItemsProcessed() {
        return this.jobItemsProcessed;
    }
    
    @Basic(optional=false)
    public void setJobItemsProcessed(int jobItemsProcessed) {
        this.jobItemsProcessed = jobItemsProcessed;
    }
    
    public int getTotalJobItems() {
        return this.totalJobItems;
    }
    
    public void setTotalJobItems(int totalJobItems) {
        this.totalJobItems = totalJobItems;
    }
    
    public int getNumberOfErrors() {
        return this.numberOfErrors;
    }
    
    public void setNumberOfErrors(int numberOfErrors) {
        this.numberOfErrors = numberOfErrors;
    }
    
    public java.util.Calendar getCompletedDate() {
        return this.completedDate;
    }
    
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }
    
    public String getMethodName() {
        return this.methodName;
    }
    
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    
    public String getExtendedStatus() {
        return this.extendedStatus;
    }
    
    public void setExtendedStatus(String extendedStatus) {
        this.extendedStatus = extendedStatus;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public AsyncApexJob getParentJobId() {
        return this.parentJobId;
    }
    
    public void setParentJobId(AsyncApexJob parentJobId) {
        this.parentJobId = parentJobId;
    }
    
    public String getLastProcessed() {
        return this.lastProcessed;
    }
    
    public void setLastProcessed(String lastProcessed) {
        this.lastProcessed = lastProcessed;
    }
    
    public int getLastProcessedOffset() {
        return this.lastProcessedOffset;
    }
    
    public void setLastProcessedOffset(int lastProcessedOffset) {
        this.lastProcessedOffset = lastProcessedOffset;
    }
    
    




    /**
     * Java model for the JobType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum JobTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        FUTURE(true,false,"Future","Future"),
        SHARINGRECALCULATION(true,false,"Sharing Recalculation","SharingRecalculation"),
        SCHEDULEDAPEX(true,false,"Scheduled Apex","ScheduledApex"),
        BATCHAPEX(true,false,"Batch Apex","BatchApex"),
        BATCHAPEXWORKER(true,false,"Batch Apex Worker","BatchApexWorker"),
        TESTREQUEST(true,false,"Test Request","TestRequest"),
        TESTWORKER(true,false,"Test Worker","TestWorker"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private JobTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static JobTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (JobTypeEnum picklistValueEnum : values()) {
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

        QUEUED(true,false,"Queued","Queued"),
        PROCESSING(true,false,"Processing","Processing"),
        ABORTED(true,false,"Aborted","Aborted"),
        COMPLETED(true,false,"Completed","Completed"),
        FAILED(true,false,"Failed","Failed"),
        PREPARING(true,false,"Preparing","Preparing"),
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