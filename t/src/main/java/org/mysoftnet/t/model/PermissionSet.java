
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com PermissionSet object.
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
@Table(name="PermissionSet")
@Entity(name="PermissionSet")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class PermissionSet extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "0PS";


    protected String name;
    protected String label;
    protected UserLicense userLicense;
    protected boolean permissionsManageUsers;
    protected boolean permissionsModifyAllData;
    protected boolean permissionsCustomizeApplication;
    protected boolean permissionsEditReadonlyFields;
    protected boolean permissionsViewSetup;
    protected boolean permissionsTransferAnyEntity;
    protected boolean permissionsViewAllData;
    protected boolean permissionsManageDashboards;
    protected boolean permissionsApiUserOnly;
    protected boolean permissionsManageRemoteAccess;
    protected boolean permissionsPasswordNeverExpires;
    protected boolean permissionsBulkApiHardDelete;
    protected boolean permissionsInboundMigrationToolsUser;
    protected boolean permissionsOutboundMigrationToolsUser;
    protected boolean permissionsEnableNotifications;
    protected boolean permissionsManageDataIntegrations;
    protected boolean permissionsAuthorApex;
    protected boolean permissionsManageMobile;
    protected boolean permissionsApiEnabled;
    protected boolean permissionsEditCaseComments;
    protected boolean permissionsCustomSidebarOnAllPages;
    protected boolean permissionsResetPasswords;
    protected boolean permissionsFlowUFLRequired;
    protected boolean permissionsCanInsertFeedSystemFields;
    protected String description;
    protected java.util.Calendar createdDate;
    protected User createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected User lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    

    public String getName() {
        return this.name;
    }
    
    @Basic(optional=false)
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    @Basic(optional=false)
    public void setLabel(String label) {
        this.label = label;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="UserLicenseId")
    public UserLicense getUserLicense() {
        return this.userLicense;
    }
    
    public void setUserLicense(UserLicense userLicense) {
        this.userLicense = userLicense;
    }
    
    public boolean getPermissionsManageUsers() {
        return this.permissionsManageUsers;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageUsers(boolean permissionsManageUsers) {
        this.permissionsManageUsers = permissionsManageUsers;
    }
    
    public boolean getPermissionsModifyAllData() {
        return this.permissionsModifyAllData;
    }
    
    @Basic(optional=false)
    public void setPermissionsModifyAllData(boolean permissionsModifyAllData) {
        this.permissionsModifyAllData = permissionsModifyAllData;
    }
    
    public boolean getPermissionsCustomizeApplication() {
        return this.permissionsCustomizeApplication;
    }
    
    @Basic(optional=false)
    public void setPermissionsCustomizeApplication(boolean permissionsCustomizeApplication) {
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
    }
    
    public boolean getPermissionsEditReadonlyFields() {
        return this.permissionsEditReadonlyFields;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditReadonlyFields(boolean permissionsEditReadonlyFields) {
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
    }
    
    public boolean getPermissionsViewSetup() {
        return this.permissionsViewSetup;
    }
    
    @Basic(optional=false)
    public void setPermissionsViewSetup(boolean permissionsViewSetup) {
        this.permissionsViewSetup = permissionsViewSetup;
    }
    
    public boolean getPermissionsTransferAnyEntity() {
        return this.permissionsTransferAnyEntity;
    }
    
    @Basic(optional=false)
    public void setPermissionsTransferAnyEntity(boolean permissionsTransferAnyEntity) {
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
    }
    
    public boolean getPermissionsViewAllData() {
        return this.permissionsViewAllData;
    }
    
    @Basic(optional=false)
    public void setPermissionsViewAllData(boolean permissionsViewAllData) {
        this.permissionsViewAllData = permissionsViewAllData;
    }
    
    public boolean getPermissionsManageDashboards() {
        return this.permissionsManageDashboards;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageDashboards(boolean permissionsManageDashboards) {
        this.permissionsManageDashboards = permissionsManageDashboards;
    }
    
    public boolean getPermissionsApiUserOnly() {
        return this.permissionsApiUserOnly;
    }
    
    @Basic(optional=false)
    public void setPermissionsApiUserOnly(boolean permissionsApiUserOnly) {
        this.permissionsApiUserOnly = permissionsApiUserOnly;
    }
    
    public boolean getPermissionsManageRemoteAccess() {
        return this.permissionsManageRemoteAccess;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageRemoteAccess(boolean permissionsManageRemoteAccess) {
        this.permissionsManageRemoteAccess = permissionsManageRemoteAccess;
    }
    
    public boolean getPermissionsPasswordNeverExpires() {
        return this.permissionsPasswordNeverExpires;
    }
    
    @Basic(optional=false)
    public void setPermissionsPasswordNeverExpires(boolean permissionsPasswordNeverExpires) {
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
    }
    
    public boolean getPermissionsBulkApiHardDelete() {
        return this.permissionsBulkApiHardDelete;
    }
    
    @Basic(optional=false)
    public void setPermissionsBulkApiHardDelete(boolean permissionsBulkApiHardDelete) {
        this.permissionsBulkApiHardDelete = permissionsBulkApiHardDelete;
    }
    
    public boolean getPermissionsInboundMigrationToolsUser() {
        return this.permissionsInboundMigrationToolsUser;
    }
    
    @Basic(optional=false)
    public void setPermissionsInboundMigrationToolsUser(boolean permissionsInboundMigrationToolsUser) {
        this.permissionsInboundMigrationToolsUser = permissionsInboundMigrationToolsUser;
    }
    
    public boolean getPermissionsOutboundMigrationToolsUser() {
        return this.permissionsOutboundMigrationToolsUser;
    }
    
    @Basic(optional=false)
    public void setPermissionsOutboundMigrationToolsUser(boolean permissionsOutboundMigrationToolsUser) {
        this.permissionsOutboundMigrationToolsUser = permissionsOutboundMigrationToolsUser;
    }
    
    public boolean getPermissionsEnableNotifications() {
        return this.permissionsEnableNotifications;
    }
    
    @Basic(optional=false)
    public void setPermissionsEnableNotifications(boolean permissionsEnableNotifications) {
        this.permissionsEnableNotifications = permissionsEnableNotifications;
    }
    
    public boolean getPermissionsManageDataIntegrations() {
        return this.permissionsManageDataIntegrations;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageDataIntegrations(boolean permissionsManageDataIntegrations) {
        this.permissionsManageDataIntegrations = permissionsManageDataIntegrations;
    }
    
    public boolean getPermissionsAuthorApex() {
        return this.permissionsAuthorApex;
    }
    
    @Basic(optional=false)
    public void setPermissionsAuthorApex(boolean permissionsAuthorApex) {
        this.permissionsAuthorApex = permissionsAuthorApex;
    }
    
    public boolean getPermissionsManageMobile() {
        return this.permissionsManageMobile;
    }
    
    @Basic(optional=false)
    public void setPermissionsManageMobile(boolean permissionsManageMobile) {
        this.permissionsManageMobile = permissionsManageMobile;
    }
    
    public boolean getPermissionsApiEnabled() {
        return this.permissionsApiEnabled;
    }
    
    @Basic(optional=false)
    public void setPermissionsApiEnabled(boolean permissionsApiEnabled) {
        this.permissionsApiEnabled = permissionsApiEnabled;
    }
    
    public boolean getPermissionsEditCaseComments() {
        return this.permissionsEditCaseComments;
    }
    
    @Basic(optional=false)
    public void setPermissionsEditCaseComments(boolean permissionsEditCaseComments) {
        this.permissionsEditCaseComments = permissionsEditCaseComments;
    }
    
    public boolean getPermissionsCustomSidebarOnAllPages() {
        return this.permissionsCustomSidebarOnAllPages;
    }
    
    @Basic(optional=false)
    public void setPermissionsCustomSidebarOnAllPages(boolean permissionsCustomSidebarOnAllPages) {
        this.permissionsCustomSidebarOnAllPages = permissionsCustomSidebarOnAllPages;
    }
    
    public boolean getPermissionsResetPasswords() {
        return this.permissionsResetPasswords;
    }
    
    @Basic(optional=false)
    public void setPermissionsResetPasswords(boolean permissionsResetPasswords) {
        this.permissionsResetPasswords = permissionsResetPasswords;
    }
    
    public boolean getPermissionsFlowUFLRequired() {
        return this.permissionsFlowUFLRequired;
    }
    
    @Basic(optional=false)
    public void setPermissionsFlowUFLRequired(boolean permissionsFlowUFLRequired) {
        this.permissionsFlowUFLRequired = permissionsFlowUFLRequired;
    }
    
    public boolean getPermissionsCanInsertFeedSystemFields() {
        return this.permissionsCanInsertFeedSystemFields;
    }
    
    @Basic(optional=false)
    public void setPermissionsCanInsertFeedSystemFields(boolean permissionsCanInsertFeedSystemFields) {
        this.permissionsCanInsertFeedSystemFields = permissionsCanInsertFeedSystemFields;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
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
    
    


































}