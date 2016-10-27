package com.chaowang.mvptest.view.ac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chaowang.mvptest.R;
import com.chaowang.mvptest.presenter.UserLoginPresenter;
import com.chaowang.mvptest.view.IUserLoginView;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

    private EditText edtUserId, edtPwd;
    private Button btnLogin;
    private UserLoginPresenter userLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        initUI();
        initData();
        initOnClick();
    }

    private void initOnClick() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLoginPresenter.login();
            }
        });
    }

    private void initData() {
        userLoginPresenter = new UserLoginPresenter(this);
    }

    private void initUI() {
        edtUserId = (EditText) findViewById(R.id.edt_UserId);
        edtPwd = (EditText) findViewById(R.id.edt_Pwd);
        btnLogin = (Button) findViewById(R.id.btn_Login);
    }


    @Override
    public String getUserId() {
        return edtPwd.getText().toString();
    }

    @Override
    public String getPwd() {
        return edtUserId.getText().toString();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "Word", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSucess() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearUserId() {
        edtUserId.setText("");
    }

    @Override
    public void clearPwd() {
        edtPwd.setText("");
    }
}
