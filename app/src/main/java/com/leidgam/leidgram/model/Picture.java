package com.leidgam.leidgram.model;

/**
 * Created by Acer8 on 11/09/2017.
 */

public class Picture {

    private String picture;
    private String userName;
    private String time;
    private String like_Number = "0";

    public Picture(String picture, String userName, String time, String like_Number) {
        this.picture = picture;
        this.userName = userName;
        this.time = time;
        this.like_Number = like_Number;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike_Number() {
        return like_Number;
    }

    public void setLike_Number(String like_Number) {
        this.like_Number = like_Number;
    }
}
