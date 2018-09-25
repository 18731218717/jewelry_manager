package org.bdyy.jewelry.pojo;

public class FinishedProductBroadHeading {
    private Integer finishedProductBroadHeadingId;

    private String finishedProductBroadHeadingName;

    private String finishedProductBroadHeadingToken;

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

    public String getFinishedProductBroadHeadingToken() {
        return finishedProductBroadHeadingToken;
    }

    public void setFinishedProductBroadHeadingToken(String finishedProductBroadHeadingToken) {
        this.finishedProductBroadHeadingToken = finishedProductBroadHeadingToken == null ? null : finishedProductBroadHeadingToken.trim();
    }
}