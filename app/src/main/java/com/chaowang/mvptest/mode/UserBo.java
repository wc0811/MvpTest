package com.chaowang.mvptest.mode;

/**
 * Created by chao.wang on 2016/10/27.
 */

public class UserBo implements  IUserBo{
    @Override
    public void login(String userId, String pwd, final ILoginListener loginListener) {
        new Thread(){
            @Override
            public void run() {

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (true){

                    UserBean user = new UserBean();
                    loginListener.loginSuccess(user);

                }else {
                    loginListener.loginFailed();
                }

            }
        }.start();
    }
}
