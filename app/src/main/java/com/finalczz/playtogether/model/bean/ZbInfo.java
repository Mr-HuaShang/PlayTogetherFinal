package com.finalczz.playtogether.model.bean;

/**
 * Created by 话伤 on 2017/7/3.
 */

public class ZbInfo {
    private String name;
    private String mailType;
    private String address;
    private String price;
    private String buyNum;
    private int imageId;

    public ZbInfo(String address, String buyNum, int imageId,
                  String mailType, String name, String price) {
        this.address = address;
        this.buyNum = buyNum;
        this.imageId = imageId;
        this.mailType = mailType;
        this.name = name;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(String buyNum) {
        this.buyNum = buyNum;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getMailType() {
        return mailType;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
