package org.bdyy.jewelry.pojo;

public class Currency {
    private Integer currencyId;

    private String currencyName;

    private String currencToken;

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName == null ? null : currencyName.trim();
    }

    public String getCurrencToken() {
        return currencToken;
    }

    public void setCurrencToken(String currencToken) {
        this.currencToken = currencToken == null ? null : currencToken.trim();
    }
}