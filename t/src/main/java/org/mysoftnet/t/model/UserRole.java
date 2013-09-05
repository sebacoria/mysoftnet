
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com UserRole object.
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
@Table(name="UserRole")
@Entity(name="UserRole")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class UserRole extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "00E";


    protected String name;
    protected UserRole parentRoleId;
    protected String rollupDescription;
    protected boolean mayForecastManagerShare;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    protected PortalTypeEnum portalType;
    protected User portalAccountOwnerId;
    

    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public UserRole getParentRoleId() {
        return this.parentRoleId;
    }
    
    public void setParentRoleId(UserRole parentRoleId) {
        this.parentRoleId = parentRoleId;
    }
    
    public String getRollupDescription() {
        return this.rollupDescription;
    }
    
    public void setRollupDescription(String rollupDescription) {
        this.rollupDescription = rollupDescription;
    }
    
    public boolean getMayForecastManagerShare() {
        return this.mayForecastManagerShare;
    }
    
    public void setMayForecastManagerShare(boolean mayForecastManagerShare) {
        this.mayForecastManagerShare = mayForecastManagerShare;
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
    
    @Enumerated(value=EnumType.STRING)
    public PortalTypeEnum getPortalType() {
        return this.portalType;
    }
    
    public void setPortalType(PortalTypeEnum portalType) {
        this.portalType = portalType;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getPortalAccountOwnerId() {
        return this.portalAccountOwnerId;
    }
    
    public void setPortalAccountOwnerId(User portalAccountOwnerId) {
        this.portalAccountOwnerId = portalAccountOwnerId;
    }
    
    









    /**
     * Java model for the PortalType picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum PortalTypeEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        NONE(true,false,"None","None"),
        CUSTOMERPORTAL(true,false,"Customer Portal","CustomerPortal"),
        PARTNER(true,false,"Partner Portal","Partner"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private PortalTypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
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

        public static PortalTypeEnum fromValue(String value) {
            if (value == null) return null;

            for (PortalTypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    


}