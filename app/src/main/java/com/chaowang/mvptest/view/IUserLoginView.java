package com.chaowang.mvptest.view;

/**
 * Created by chao.wang on 2016/10/27.
 */

public interface IUserLoginView {

    String getUserId();

    String getPwd();

    void showLoading();

    void hideLoading();

    void loginSucess();

    void loginFailed();

    void clearUserId();

    void clearPwd();

}
