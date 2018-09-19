package org.bdyy.jewelry.pojo;

public class FinishedProductSubclass {
    private Integer finishedProductSubclassId;

    private String finishedProductSubclassName;

    private String finishedProductSubclassToken;

    public Integer getFinishedProductSubclassId() {
        return finishedProductSubclassId;
    }

    public void setFinishedProductSubclassId(Integer finishedProductSubclassId) {
        this.finishedProductSubclassId = finishedProductSubclassId;
    }

    public String getFinishedProductSubclassName() {
        return finishedProductSubclassName;
    }

    public void setFinishedProductSubclassName(String finishedProductSubclassName) {
        this.finishedProductSubclassName = finishedProductSubclassName == null ? null : finishedProductSubclassName.trim();
    }

    public String getFinishedProductSubclassToken() {
        return finishedProductSubclassToken;
    }

    public void setFinishedProductSubclassToken(String finishedProductSubclassToken) {
        this.finishedProductSubclassToken = finishedProductSubclassToken == null ? null : finishedProductSubclassToken.trim();
    }
}