package org.bdyy.jewelry.pojo;

public class FinishedProductTexture {
    private Integer finishedProductTextureId;

    private String textureId;

    private String finishedProductTextureWeight;

    private String finishedProductTextureSinglePrice;

    private Integer finishedProductId;

    private String finishedProductTextureAllPrice;

    public Integer getFinishedProductTextureId() {
        return finishedProductTextureId;
    }

    public void setFinishedProductTextureId(Integer finishedProductTextureId) {
        this.finishedProductTextureId = finishedProductTextureId;
    }

    public String getTextureId() {
        return textureId;
    }

    public void setTextureId(String textureId) {
        this.textureId = textureId == null ? null : textureId.trim();
    }

    public String getFinishedProductTextureWeight() {
        return finishedProductTextureWeight;
    }

    public void setFinishedProductTextureWeight(String finishedProductTextureWeight) {
        this.finishedProductTextureWeight = finishedProductTextureWeight == null ? null : finishedProductTextureWeight.trim();
    }

    public String getFinishedProductTextureSinglePrice() {
        return finishedProductTextureSinglePrice;
    }

    public void setFinishedProductTextureSinglePrice(String finishedProductTextureSinglePrice) {
        this.finishedProductTextureSinglePrice = finishedProductTextureSinglePrice == null ? null : finishedProductTextureSinglePrice.trim();
    }

    public Integer getFinishedProductId() {
        return finishedProductId;
    }

    public void setFinishedProductId(Integer finishedProductId) {
        this.finishedProductId = finishedProductId;
    }

    public String getFinishedProductTextureAllPrice() {
        return finishedProductTextureAllPrice;
    }

    public void setFinishedProductTextureAllPrice(String finishedProductTextureAllPrice) {
        this.finishedProductTextureAllPrice = finishedProductTextureAllPrice == null ? null : finishedProductTextureAllPrice.trim();
    }
}