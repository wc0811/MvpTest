package com.chaowang.mvptest.mode;

/**
 * Created by chao.wang on 2016/10/27.
 */

public interface ILoginListener {

    void loginSuccess(UserBean user);

    void loginFailed();

}
