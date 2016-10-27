package com.chaowang.mvptest.presenter;

import android.os.Handler;

import com.chaowang.mvptest.mode.ILoginListener;
import com.chaowang.mvptest.mode.IUserBo;
import com.chaowang.mvptest.mode.UserBean;
import com.chaowang.mvptest.mode.UserBo;
import com.chaowang.mvptest.view.IUserLoginView;


/**
 * Created by chao.wang on 2016/10/27.
 */

public class UserLoginPresenter {

    private IUserBo iUserBo;
    private IUserLoginView iUserLoginView;
    private Handler mHandler = new Handler();

    public UserLoginPresenter(IUserLoginView iUserLoginView) {
        this.iUserLoginView = iUserLoginView;
        this.iUserBo = new UserBo();//非对象赋值，仅仅是声明空间，这个是可以的
    }

    public void login() {
        iUserBo.login(iUserLoginView.getUserId(), iUserLoginView.getPwd(), new ILoginListener() {
            @Override
            public void loginSuccess(UserBean user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iUserLoginView.loginSucess();
                        clear();
                    }
                });
            }

            @Override
            public void loginFailed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iUserLoginView.loginFailed();
                        clear();
                    }
                });
            }
        });
    }

    public void clear() {

        iUserLoginView.clearUserId();
        iUserLoginView.clearPwd();

    }
}
