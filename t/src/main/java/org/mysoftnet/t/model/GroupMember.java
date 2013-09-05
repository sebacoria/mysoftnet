
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com GroupMember object.
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
@Table(name="GroupMember")
@Entity(name="GroupMember")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class GroupMember extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "011";


    protected Group group;
    // userOrGroupId possible references:
    // Group
    // User
    protected String userOrGroupId;
    protected java.util.Calendar systemModstamp;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="GroupId")
    public Group getGroup() {
        return this.group;
    }
    
    @Basic(optional=false)
    public void setGroup(Group group) {
        this.group = group;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public String getUserOrGroupId() {
        return this.userOrGroupId;
    }
    
    @Basic(optional=false)
    public void setUserOrGroupId(String userOrGroupId) {
        this.userOrGroupId = userOrGroupId;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    




}