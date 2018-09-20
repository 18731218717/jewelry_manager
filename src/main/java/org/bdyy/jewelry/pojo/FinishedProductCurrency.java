package org.bdyy.jewelry.pojo;

public class FinishedProductCurrency {
    private Integer finishedProductCurrencyId;

    private String currencyId;

    private String finishedProductCurrencyGPrice;

    private String finishedProductCurrencyPiecePrice;

    private Integer finishedProductId;

    private String finishedProductCurrencyAllPrice;

    public Integer getFinishedProductCurrencyId() {
        return finishedProductCurrencyId;
    }

    public void setFinishedProductCurrencyId(Integer finishedProductCurrencyId) {
        this.finishedProductCurrencyId = finishedProductCurrencyId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getFinishedProductCurrencyGPrice() {
        return finishedProductCurrencyGPrice;
    }

    public void setFinishedProductCurrencyGPrice(String finishedProductCurrencyGPrice) {
        this.finishedProductCurrencyGPrice = finishedProductCurrencyGPrice == null ? null : finishedProductCurrencyGPrice.trim();
    }

    public String getFinishedProductCurrencyPiecePrice() {
        return finishedProductCurrencyPiecePrice;
    }

    public void setFinishedProductCurrencyPiecePrice(String finishedProductCurrencyPiecePrice) {
        this.finishedProductCurrencyPiecePrice = finishedProductCurrencyPiecePrice == null ? null : finishedProductCurrencyPiecePrice.trim();
    }

    public Integer getFinishedProductId() {
        return finishedProductId;
    }

    public void setFinishedProductId(Integer finishedProductId) {
        this.finishedProductId = finishedProductId;
    }

    public String getFinishedProductCurrencyAllPrice() {
        return finishedProductCurrencyAllPrice;
    }

    public void setFinishedProductCurrencyAllPrice(String finishedProductCurrencyAllPrice) {
        this.finishedProductCurrencyAllPrice = finishedProductCurrencyAllPrice == null ? null : finishedProductCurrencyAllPrice.trim();
    }
}