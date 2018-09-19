package org.bdyy.jewelry.pojo;

public class FinishedProductType {
    private Integer finishedProductTypeId;

    private String finishedProductTypeName;

    private String finishedProductTypeToken;

    public Integer getFinishedProductTypeId() {
        return finishedProductTypeId;
    }

    public void setFinishedProductTypeId(Integer finishedProductTypeId) {
        this.finishedProductTypeId = finishedProductTypeId;
    }

    public String getFinishedProductTypeName() {
        return finishedProductTypeName;
    }

    public void setFinishedProductTypeName(String finishedProductTypeName) {
        this.finishedProductTypeName = finishedProductTypeName == null ? null : finishedProductTypeName.trim();
    }

    public String getFinishedProductTypeToken() {
        return finishedProductTypeToken;
    }

    public void setFinishedProductTypeToken(String finishedProductTypeToken) {
        this.finishedProductTypeToken = finishedProductTypeToken == null ? null : finishedProductTypeToken.trim();
    }
}