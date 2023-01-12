package com.labor.database;

public class LaborModel {
    private long laborId = 0L;
    private String laborName = "";
    private String laborMobile = "";
    private String laborEmail = "";
    private LaborType laborType;
    private LaborCategory laborCategory;
    private double laborRateAmount = 0.0;
    private String attachmentUrl = "";
    private AttachmentType attachmentType;

    public long getLaborId() {
        return laborId;
    }

    public void setLaborId(long laborId) {
        this.laborId = laborId;
    }

    public String getLaborName() {
        return laborName;
    }

    public void setLaborName(String laborName) {
        this.laborName = laborName;
    }

    public String getLaborMobile() {
        return laborMobile;
    }

    public void setLaborMobile(String laborMobile) {
        this.laborMobile = laborMobile;
    }

    public String getLaborEmail() {
        return laborEmail;
    }

    public void setLaborEmail(String laborEmail) {
        this.laborEmail = laborEmail;
    }

    public LaborType getLaborType() {
        return laborType;
    }

    public void setLaborType(LaborType laborType) {
        this.laborType = laborType;
    }

    public LaborCategory getLaborCategory() {
        return laborCategory;
    }

    public void setLaborCategory(LaborCategory laborCategory) {
        this.laborCategory = laborCategory;
    }

    public double getLaborRateAmount() {
        return laborRateAmount;
    }

    public void setLaborRateAmount(double laborRateAmount) {
        this.laborRateAmount = laborRateAmount;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
    }
}
