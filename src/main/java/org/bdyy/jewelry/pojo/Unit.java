package org.bdyy.jewelry.pojo;

public class Unit {
    private Integer unitId;

    private String unitName;

    private String unitToken;

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getUnitToken() {
        return unitToken;
    }

    public void setUnitToken(String unitToken) {
        this.unitToken = unitToken == null ? null : unitToken.trim();
    }
}