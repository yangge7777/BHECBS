package com.yang.bean;

import java.util.Date;

public class Tb_admin {
    private Integer adminId;

    private String adminName;

    private String adminAccount;

    private String adminPswd;

    private String adminTelephone;

    private String adminEmail;

    private Date impowerDate;

    public Tb_admin(Integer adminId, String adminName, String adminAccount, String adminPswd, String adminTelephone, String adminEmail, Date impowerDate) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminAccount = adminAccount;
        this.adminPswd = adminPswd;
        this.adminTelephone = adminTelephone;
        this.adminEmail = adminEmail;
        this.impowerDate = impowerDate;
    }

    public Tb_admin() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPswd() {
        return adminPswd;
    }

    public void setAdminPswd(String adminPswd) {
        this.adminPswd = adminPswd == null ? null : adminPswd.trim();
    }

    public String getAdminTelephone() {
        return adminTelephone;
    }

    public void setAdminTelephone(String adminTelephone) {
        this.adminTelephone = adminTelephone == null ? null : adminTelephone.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public Date getImpowerDate() {
        return impowerDate;
    }

    @Override
    public String toString() {
        return "Tb_admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminAccount='" + adminAccount + '\'' +
                ", adminPswd='" + adminPswd + '\'' +
                ", adminTelephone='" + adminTelephone + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", impowerDate=" + impowerDate +
                '}';
    }

    public void setImpowerDate(Date impowerDate) {
        this.impowerDate = impowerDate;
    }
}