package com.example.iwen.im.model;

/**
 * 数据类
 * author : Iwen大大怪
 * create : 2020/11/9 10:11
 */
public class ItemData {

    public int drawable;
    public String userName;
    public String Message;

    public ItemData(int drawable, String userName, String message) {
        this.drawable = drawable;
        this.userName = userName;
        Message = message;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
