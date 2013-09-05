
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com LoginIp object.
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
@Table(name="LoginIp")
@Entity(name="LoginIp")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class LoginIp extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "710";


    protected User users;
    protected String sourceIp;
    protected java.util.Calendar createdDate;
    protected boolean isAuthenticated;
    protected java.util.Calendar challengeSentDate;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="UsersId")
    public User getUsers() {
        return this.users;
    }
    
    @Basic(optional=false)
    public void setUsers(User users) {
        this.users = users;
    }
    
    public String getSourceIp() {
        return this.sourceIp;
    }
    
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }
    
    public boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }
    
    public void setIsAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }
    
    public java.util.Calendar getChallengeSentDate() {
        return this.challengeSentDate;
    }
    
    public void setChallengeSentDate(java.util.Calendar challengeSentDate) {
        this.challengeSentDate = challengeSentDate;
    }
    
    






}