
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com PermissionSetAssignment object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : true
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
@Table(name="PermissionSetAssignment")
@Entity(name="PermissionSetAssignment")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class PermissionSetAssignment extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0Pa";


    protected PermissionSet permissionSet;
    protected User assignee;
    protected java.util.Calendar systemModstamp;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="PermissionSetId")
    public PermissionSet getPermissionSet() {
        return this.permissionSet;
    }
    
    @Basic(optional=false)
    public void setPermissionSet(PermissionSet permissionSet) {
        this.permissionSet = permissionSet;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="AssigneeId")
    public User getAssignee() {
        return this.assignee;
    }
    
    @Basic(optional=false)
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    




}