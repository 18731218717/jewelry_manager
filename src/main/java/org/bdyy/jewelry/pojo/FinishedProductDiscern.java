package org.bdyy.jewelry.pojo;

public class FinishedProductDiscern {
    private Integer finishedProductDiscernId;

    private String finishedProductDiscernName;

    private String finishedProductDiscernToken;

    public Integer getFinishedProductDiscernId() {
        return finishedProductDiscernId;
    }

    public void setFinishedProductDiscernId(Integer finishedProductDiscernId) {
        this.finishedProductDiscernId = finishedProductDiscernId;
    }

    public String getFinishedProductDiscernName() {
        return finishedProductDiscernName;
    }

    public void setFinishedProductDiscernName(String finishedProductDiscernName) {
        this.finishedProductDiscernName = finishedProductDiscernName == null ? null : finishedProductDiscernName.trim();
    }

    public String getFinishedProductDiscernToken() {
        return finishedProductDiscernToken;
    }

    public void setFinishedProductDiscernToken(String finishedProductDiscernToken) {
        this.finishedProductDiscernToken = finishedProductDiscernToken == null ? null : finishedProductDiscernToken.trim();
    }
}