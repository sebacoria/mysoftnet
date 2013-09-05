
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com ClientBrowser object.
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
@Table(name="ClientBrowser")
@Entity(name="ClientBrowser")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class ClientBrowser extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "713";


    protected User users;
    protected String fullUserAgent;
    protected String proxyInfo;
    protected java.util.Calendar lastUpdate;
    protected java.util.Calendar createdDate;
    

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
    
    public String getFullUserAgent() {
        return this.fullUserAgent;
    }
    
    public void setFullUserAgent(String fullUserAgent) {
        this.fullUserAgent = fullUserAgent;
    }
    
    public String getProxyInfo() {
        return this.proxyInfo;
    }
    
    public void setProxyInfo(String proxyInfo) {
        this.proxyInfo = proxyInfo;
    }
    
    public java.util.Calendar getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }
    
    






}