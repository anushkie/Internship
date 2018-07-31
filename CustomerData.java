package com.aeries.utils.excelparser;

/**
 * Created by balaji on 7/31/2018.
 */
public class CustomerData {

    private final String loanAccountNo;

    private final String stateName;

    private final String branchAddress;

    private final String nameOfCustomer;

    private final String cityOfInstallation;

    private final int mobileNo;

    private final String statusByVendor;

    private final String remarks;

    private final String ownership;

    private final String vendor;

    private final String alternateNoStatus;

    private final String scheduleDate;

    private final String installationDate;

    private final String tier;

    private final String userCredentialShared;

    private final String calledBy;

    public CustomerData(String loanAccountNo, String stateName, String branchAddress, String nameOfCustomer, String cityOfInstallation, int mobileNo, String statusByVendor, String remarks, String ownership, String vendor, String alternateNoStatus, String scheduleDate, String installationDate, String tier, String userCredentialShared, String calledBy) {
        this.loanAccountNo = loanAccountNo;
        this.stateName = stateName;
        this.branchAddress = branchAddress;
        this.nameOfCustomer = nameOfCustomer;
        this.cityOfInstallation = cityOfInstallation;
        this.mobileNo = mobileNo;
        this.statusByVendor = statusByVendor;
        this.remarks = remarks;
        this.ownership = ownership;
        this.vendor = vendor;
        this.alternateNoStatus = alternateNoStatus;
        this.scheduleDate = scheduleDate;
        this.installationDate = installationDate;
        this.tier = tier;
        this.userCredentialShared = userCredentialShared;
        this.calledBy = calledBy;
    }

    public String getLoanAccountNo() {
        return loanAccountNo;
    }

    public String getStateName() {
        return stateName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public String getCityOfInstallation() {
        return cityOfInstallation;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public String getStatusByVendor() {
        return statusByVendor;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getOwnership() {
        return ownership;
    }

    public String getVendor() {
        return vendor;
    }

    public String getAlternateNoStatus() {
        return alternateNoStatus;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public String getInstallationDate() {
        return installationDate;
    }

    public String getTier() {
        return tier;
    }

    public String getUserCredentialShared() {
        return userCredentialShared;
    }

    public String getCalledBy() {
        return calledBy;
    }

    @Override
    public String toString() {
        return "CustomerData{" +
                "loanAccountNo='" + loanAccountNo + '\'' +
                ", stateName='" + stateName + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                ", cityOfInstallation='" + cityOfInstallation + '\'' +
                ", mobileNo=" + mobileNo +
                ", statusByVendor='" + statusByVendor + '\'' +
                ", remarks='" + remarks + '\'' +
                ", ownership='" + ownership + '\'' +
                ", vendor='" + vendor + '\'' +
                ", alternateNoStatus='" + alternateNoStatus + '\'' +
                ", scheduleDate='" + scheduleDate + '\'' +
                ", installationDate='" + installationDate + '\'' +
                ", tier='" + tier + '\'' +
                ", userCredentialShared='" + userCredentialShared + '\'' +
                ", calledBy='" + calledBy + '\'' +
                '}';
    }
}
