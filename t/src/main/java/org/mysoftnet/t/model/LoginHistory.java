
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com LoginHistory object.
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
@Table(name="LoginHistory")
@Entity(name="LoginHistory")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class LoginHistory extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0Ya";


    protected User userId;
    protected java.util.Calendar loginTime;
    protected String loginType;
    protected String sourceIp;
    protected String loginUrl;
    protected String browser;
    protected String platform;
    protected String status;
    protected String application;
    protected String clientVersion;
    protected String apiType;
    protected String apiVersion;
    

    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getUserId() {
        return this.userId;
    }
    
    public void setUserId(User userId) {
        this.userId = userId;
    }
    
    public java.util.Calendar getLoginTime() {
        return this.loginTime;
    }
    
    @Basic(optional=false)
    public void setLoginTime(java.util.Calendar loginTime) {
        this.loginTime = loginTime;
    }
    
    @Enumerated(value=EnumType.STRING)
    public String getLoginType() {
        return this.loginType;
    }
    
    @Basic(optional=false)
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
    
    public String getSourceIp() {
        return this.sourceIp;
    }
    
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }
    
    public String getLoginUrl() {
        return this.loginUrl;
    }
    
    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
    
    public String getBrowser() {
        return this.browser;
    }
    
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    
    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getApplication() {
        return this.application;
    }
    
    public void setApplication(String application) {
        this.application = application;
    }
    
    public String getClientVersion() {
        return this.clientVersion;
    }
    
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }
    
    public String getApiType() {
        return this.apiType;
    }
    
    public void setApiType(String apiType) {
        this.apiType = apiType;
    }
    
    public String getApiVersion() {
        return this.apiVersion;
    }
    
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
    
    













}