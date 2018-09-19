package org.bdyy.jewelry.pojo;

public class FinishedProductUnit {
    private Integer finishedProductUnitId;

    private String unitId;

    private String finishedProductUnitAllWeight;

    private String finishedProductUnitSingleWeight;

    private Integer finishedProductId;

    public Integer getFinishedProductUnitId() {
        return finishedProductUnitId;
    }

    public void setFinishedProductUnitId(Integer finishedProductUnitId) {
        this.finishedProductUnitId = finishedProductUnitId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getFinishedProductUnitAllWeight() {
        return finishedProductUnitAllWeight;
    }

    public void setFinishedProductUnitAllWeight(String finishedProductUnitAllWeight) {
        this.finishedProductUnitAllWeight = finishedProductUnitAllWeight == null ? null : finishedProductUnitAllWeight.trim();
    }

    public String getFinishedProductUnitSingleWeight() {
        return finishedProductUnitSingleWeight;
    }

    public void setFinishedProductUnitSingleWeight(String finishedProductUnitSingleWeight) {
        this.finishedProductUnitSingleWeight = finishedProductUnitSingleWeight == null ? null : finishedProductUnitSingleWeight.trim();
    }

    public Integer getFinishedProductId() {
        return finishedProductId;
    }

    public void setFinishedProductId(Integer finishedProductId) {
        this.finishedProductId = finishedProductId;
    }
}