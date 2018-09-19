package org.bdyy.jewelry.pojo;

public class Texture {
    private Integer textureId;

    private String textureName;

    private String textureToken;

    public Integer getTextureId() {
        return textureId;
    }

    public void setTextureId(Integer textureId) {
        this.textureId = textureId;
    }

    public String getTextureName() {
        return textureName;
    }

    public void setTextureName(String textureName) {
        this.textureName = textureName == null ? null : textureName.trim();
    }

    public String getTextureToken() {
        return textureToken;
    }

    public void setTextureToken(String textureToken) {
        this.textureToken = textureToken == null ? null : textureToken.trim();
    }
}