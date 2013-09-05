
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com MapAreaPoint__c object.
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
@Table(name="MapAreaPoint__c")
@Entity(name="MapAreaPoint")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class MapAreaPoint extends com.force.sdk.jpa.model.BaseForceCustomObject {

    public static final String KEY_PREFIX = "a0B";


    protected User createdBy;
    protected User lastModifiedBy;
    protected String xCoordinate;
    protected String yCoordinate;
    protected MapArea mapArea;
    

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
    
    @Column(name="XCoordinate__c")
    public String getXCoordinate() {
        return this.xCoordinate;
    }
    
    @Basic(optional=false)
    public void setXCoordinate(String xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    
    @Column(name="YCoordinate__c")
    public String getYCoordinate() {
        return this.yCoordinate;
    }
    
    @Basic(optional=false)
    public void setYCoordinate(String yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="MapArea__c")
    public MapArea getMapArea() {
        return this.mapArea;
    }
    
    @Basic(optional=false)
    public void setMapArea(MapArea mapArea) {
        this.mapArea = mapArea;
    }
    
    






}