package org.bdyy.jewelry.pojo;

public class FinishedProductBroadHeading {
    private Integer finishedProductBroadHeadingId;

    private String finishedProductBroadHeadingName;

    private String finishedProductBroadToken;

    public Integer getFinishedProductBroadHeadingId() {
        return finishedProductBroadHeadingId;
    }

    public void setFinishedProductBroadHeadingId(Integer finishedProductBroadHeadingId) {
        this.finishedProductBroadHeadingId = finishedProductBroadHeadingId;
    }

    public String getFinishedProductBroadHeadingName() {
        return finishedProductBroadHeadingName;
    }

    public void setFinishedProductBroadHeadingName(String finishedProductBroadHeadingName) {
        this.finishedProductBroadHeadingName = finishedProductBroadHeadingName == null ? null : finishedProductBroadHeadingName.trim();
    }

    public String getFinishedProductBroadToken() {
        return finishedProductBroadToken;
    }

    public void setFinishedProductBroadToken(String finishedProductBroadToken) {
        this.finishedProductBroadToken = finishedProductBroadToken == null ? null : finishedProductBroadToken.trim();
    }
}