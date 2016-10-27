package com.chaowang.mvptest.mode;

/**
 * Created by chao.wang on 2016/10/27.
 */

public interface IUserBo {
    public void login(String userId, String pwd, ILoginListener loginListener);
}
