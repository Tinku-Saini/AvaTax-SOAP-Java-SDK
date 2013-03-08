/**
 * AccountSvcSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public interface AccountSvcSoap extends com.avalara.avatax.services.base.BaseSvcSoap {

    /**
     * Fetches one or more users
     */
    public com.avalara.avatax.services.account.UserFetchResult userFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a user
     */
    public com.avalara.avatax.services.account.UserSaveResult userSave(com.avalara.avatax.services.account.User user) throws java.rmi.RemoteException;

    /**
     * Deletes a user
     */
    public com.avalara.avatax.services.account.DeleteResult userDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Resets the user password and emails the new password to the
     * user
     */
    public com.avalara.avatax.services.account.UserResetPasswordResult userResetPassword(com.avalara.avatax.services.account.UserResetPasswordRequest userResetPasswordRequest) throws java.rmi.RemoteException;

    /**
     * Fetches company specific Locations
     */
    public com.avalara.avatax.services.account.CompanyLocationFetchResult companyLocationFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates an Company Location
     */
    public com.avalara.avatax.services.account.CompanyLocationSaveResult companyLocationSave(com.avalara.avatax.services.account.CompanyLocation companyLocation) throws java.rmi.RemoteException;

    /**
     * Deletes a Company Location
     */
    public com.avalara.avatax.services.account.DeleteResult companyLocationDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches available address categories
     */
    public com.avalara.avatax.services.account.AddressCategoryFetchResult addressCategoryFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetches available address types
     */
    public com.avalara.avatax.services.account.AddressTypeFetchResult addressTypeFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more jurisdiction overrides
     */
    public com.avalara.avatax.services.account.JurisdictionOverrideFetchResult jurisdictionOverrideFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a JurisdictionOverride
     */
    public com.avalara.avatax.services.account.JurisdictionOverrideSaveResult jurisdictionOverrideSave(com.avalara.avatax.services.account.JurisdictionOverride jurisdictionOverride) throws java.rmi.RemoteException;

    /**
     * Deletes a JurisdictionOverride
     */
    public com.avalara.avatax.services.account.DeleteResult jurisdictionOverrideDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more Exemption Certificate entities
     */
    public com.avalara.avatax.services.account.ExemptCertFetchResult exemptCertFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a ExemptionCertificate
     */
    public com.avalara.avatax.services.account.ExemptCertSaveResult exemptCertSave(com.avalara.avatax.services.account.ExemptCert exemptCert) throws java.rmi.RemoteException;

    /**
     * Deletes one ore more ExemptCerts
     */
    public com.avalara.avatax.services.account.DeleteResult exemptCertDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Revokes one or more Exemption Certificate entities
     */
    public com.avalara.avatax.services.account.ExemptCertRevokeResult exemptCertRevoke(com.avalara.avatax.services.account.ExemptCertRevokeRequest exemptCertRevokeRequest) throws java.rmi.RemoteException;

    /**
     * Applies one or more Exemption Certificate entities to documents
     * that have been exempted without a certificate
     */
    public com.avalara.avatax.services.account.ExemptCertApplyResult exemptCertApply(com.avalara.avatax.services.account.ExemptCertApplyRequest exemptCertApplyRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more Business Type entities
     */
    public com.avalara.avatax.services.account.BusinessTypeFetchResult businessTypeFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more ExemptReasons entities
     */
    public com.avalara.avatax.services.account.ExemptReasonFetchResult exemptReasonFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more ExemptReasons entities
     */
    public com.avalara.avatax.services.account.FetchExemptDetailsResult exemptDetailsFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more BusinessAndExemptCertReason entities
     */
    public com.avalara.avatax.services.account.BusinessAndExemptCertReasonFetchResult businessAndExemptCertReasonFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more Document entities
     */
    public com.avalara.avatax.services.account.DocumentFetchResult documentFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more AdjustmentReason entities
     */
    public com.avalara.avatax.services.account.AdjustmentReasonFetchResult adjustmentReasonFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Fetch ALL CompanyReturn entities. Does not synchronize AvaTax
     * and TaxSolver return schedules.
     */
    public com.avalara.avatax.services.account.CompanyReturnFetchResult companyReturnFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a companyReturn
     */
    public com.avalara.avatax.services.account.CompanyReturnSaveResult companyReturnSave(com.avalara.avatax.services.account.CompanyReturn companyReturn) throws java.rmi.RemoteException;

    /**
     * Deletes a CompanyReturn & CompanySupportingReturn
     */
    public com.avalara.avatax.services.account.DeleteResult companyReturnDelete(int companyReturnId) throws java.rmi.RemoteException;

    /**
     * Fetches all RegionFilingConfig entities
     */
    public com.avalara.avatax.services.account.RegionFilingConfigFetchResult regionFilingConfigFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a RegionFilingConfig
     */
    public com.avalara.avatax.services.account.RegionFilingConfigSaveResult regionFilingConfigSave(com.avalara.avatax.services.account.RegionFilingConfig regionFilingConfig) throws java.rmi.RemoteException;

    /**
     * Deletes a Region Filing Config
     */
    public com.avalara.avatax.services.account.DeleteResult regionFilingConfigDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Saves a CompanyReturn and its Supporting Return
     */
    public com.avalara.avatax.services.account.CompanyReturnSaveResult combinedReturnSave(com.avalara.avatax.services.account.CompanyReturn companyReturn) throws java.rmi.RemoteException;

    /**
     * Save companySupportingReturn
     */
    public com.avalara.avatax.services.account.CompanySupportingReturnSaveResult companySupportingReturnSave(com.avalara.avatax.services.account.CompanySupportingReturn companySupportingReturn) throws java.rmi.RemoteException;

    /**
     * Deletes a CompanyReturn
     */
    public com.avalara.avatax.services.account.DeleteResult combinedReturnDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetch ALL AvaFileForm entities
     */
    public com.avalara.avatax.services.account.AvaFileFormFetchResult avaFileFormFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a AvaFileForm
     */
    public com.avalara.avatax.services.account.AvaFileFormSaveResult avaFileFormSave(com.avalara.avatax.services.account.AvaFileForm avaFileForm) throws java.rmi.RemoteException;

    /**
     * Deletes a AvaFileForm
     */
    public com.avalara.avatax.services.account.DeleteResult avaFileFormDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetch ALL AvaFileFormGroup entities
     */
    public com.avalara.avatax.services.account.AvaFileFormGroupFetchResult avaFileFormGroupFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a AvaFileFormGroup
     */
    public com.avalara.avatax.services.account.AvaFileFormGroupSaveResult avaFileFormGroupSave(com.avalara.avatax.services.account.AvaFileFormGroup avaFileFormGroup) throws java.rmi.RemoteException;

    /**
     * Deletes a AvaFileFormGroup
     */
    public com.avalara.avatax.services.account.DeleteResult avaFileFormGroupDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetch one more sites
     */
    public com.avalara.avatax.services.account.SiteFetchResult siteFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a site
     */
    public com.avalara.avatax.services.account.SiteSaveResult siteSave(com.avalara.avatax.services.account.Site site) throws java.rmi.RemoteException;

    /**
     * Fetch one more Account entities
     */
    public com.avalara.avatax.services.account.AccountFetchResult accountFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates an account
     */
    public com.avalara.avatax.services.account.AccountSaveResult accountSave(com.avalara.avatax.services.account.Account account) throws java.rmi.RemoteException;

    /**
     * Resets an account key
     */
    public com.avalara.avatax.services.account.AccountSaveResult accountResetKey(int accountId) throws java.rmi.RemoteException;

    /**
     * Resets an account key
     */
    public com.avalara.avatax.services.account.DeleteResult accountDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Initializess an account
     */
    public com.avalara.avatax.services.account.AccountInitializeResult accountInitialize(com.avalara.avatax.services.account.AccountInitializeRequest accountInitializeRequest) throws java.rmi.RemoteException;

    /**
     * Fetches a service configuration for an account
     */
    public com.avalara.avatax.services.account.ServiceConfigFetchResult serviceConfigFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Updates the service configs for an account
     */
    public com.avalara.avatax.services.account.ServiceConfigSaveResult serviceConfigSave(com.avalara.avatax.services.account.ServiceConfig serviceConfig) throws java.rmi.RemoteException;

    /**
     * Fetches one or more companies
     */
    public com.avalara.avatax.services.account.CompanyFetchResult companyFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a company
     */
    public com.avalara.avatax.services.account.CompanySaveResult companySave(com.avalara.avatax.services.account.Company company) throws java.rmi.RemoteException;

    /**
     * Deletes a company
     */
    public com.avalara.avatax.services.account.DeleteResult companyDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more company contacts
     */
    public com.avalara.avatax.services.account.CompanyContactFetchResult companyContactFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a company contact
     */
    public com.avalara.avatax.services.account.CompanyContactSaveResult companyContactSave(com.avalara.avatax.services.account.CompanyContact companyContact) throws java.rmi.RemoteException;

    /**
     * Deletes a company contact
     */
    public com.avalara.avatax.services.account.DeleteResult companyContactDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more TaxCodes
     */
    public com.avalara.avatax.services.account.TaxCodeFetchResult taxCodeFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a TaxCode
     */
    public com.avalara.avatax.services.account.TaxCodeSaveResult taxCodeSave(com.avalara.avatax.services.account.TaxCode taxCode) throws java.rmi.RemoteException;

    /**
     * Deletes a TaxCode
     */
    public com.avalara.avatax.services.account.DeleteResult taxCodeDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more Items
     */
    public com.avalara.avatax.services.account.ItemFetchResult itemFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates an Item
     */
    public com.avalara.avatax.services.account.ItemSaveResult itemSave(com.avalara.avatax.services.account.Item item) throws java.rmi.RemoteException;

    /**
     * Deletes an Item
     */
    public com.avalara.avatax.services.account.DeleteResult itemDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more Nexuses
     */
    public com.avalara.avatax.services.account.NexusFetchResult nexusFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a Nexus
     */
    public com.avalara.avatax.services.account.NexusSaveResult nexusSave(com.avalara.avatax.services.account.Nexus nexus) throws java.rmi.RemoteException;

    /**
     * Deletes one or more Nexuses
     */
    public com.avalara.avatax.services.account.DeleteResult nexusDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more TaxRules
     */
    public com.avalara.avatax.services.account.TaxRuleFetchResult taxRuleFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates a TaxRule
     */
    public com.avalara.avatax.services.account.TaxRuleSaveResult taxRuleSave(com.avalara.avatax.services.account.TaxRule taxRule) throws java.rmi.RemoteException;

    /**
     * Deletes a TaxRule
     */
    public com.avalara.avatax.services.account.DeleteResult taxRuleDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Deletes one or more Nexuses
     */
    public com.avalara.avatax.services.account.DeleteResult documentDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more company settings
     */
    public com.avalara.avatax.services.account.CompanySettingFetchResult companySettingFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates company settings
     */
    public com.avalara.avatax.services.account.CompanySettingSaveResult companySettingSave(com.avalara.avatax.services.account.CompanySetting[] companySetting) throws java.rmi.RemoteException;

    /**
     * Deletes CompanySettings
     */
    public com.avalara.avatax.services.account.DeleteResult companySettingDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Fetches one or more services
     */
    public com.avalara.avatax.services.account.ServiceFetchResult serviceFetch(com.avalara.avatax.services.account.FetchRequest fetchRequest) throws java.rmi.RemoteException;

    /**
     * Creates or updates service
     */
    public com.avalara.avatax.services.account.ServiceSaveResult serviceSave(com.avalara.avatax.services.account.Service service) throws java.rmi.RemoteException;

    /**
     * Deletes a service
     */
    public com.avalara.avatax.services.account.DeleteResult serviceDelete(com.avalara.avatax.services.account.DeleteRequest deleteRequest) throws java.rmi.RemoteException;

    /**
     * Tests connectivity and version of the service
     */
    public com.avalara.avatax.services.account.PingResult ping(java.lang.String message) throws java.rmi.RemoteException;

    /**
     * Checks authentication and authorization to one or more operations
     * on the service.
     */
    public com.avalara.avatax.services.account.IsAuthorizedResult isAuthorized(java.lang.String operations) throws java.rmi.RemoteException;
}
