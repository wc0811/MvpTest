package com.chaowang.mvptest.mode;

import java.io.Serializable;

/**
 * Created by chao.wang on 2016/10/27.
 */

public class UserBean implements Serializable {
    /**
     * 设置序列化数据的默认值，不写在运行时不会报错。但是，在反序列化的时候会找不到对应的值
     */
    private static final long serialVersionUID = -1;

    private String userId;
    private String pwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
