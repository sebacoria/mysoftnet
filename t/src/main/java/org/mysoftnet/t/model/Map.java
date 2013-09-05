
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com Map__c object.
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
@Table(name="Map__c")
@Entity(name="Map")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class Map extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a06";


    protected User createdBy;
    protected User lastModifiedBy;
    protected Territory territory;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CreatedById")
    public User getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
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
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="Territory__c")
    public Territory getTerritory() {
        return this.territory;
    }
    
    public void setTerritory(Territory territory) {
        this.territory = territory;
    }
    
    




}