package com.example.hiot_cloud.test.mvptest;

import android.widget.TextView;

import com.example.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {

    private TestView view;

    public TestPresenter(TestMVPActivity view) {
        this.view = view;
    }

    public void login(User user) {
        if ("lisi".equals(user.getUserName()) && "123".equals(user.getPassword())) {
            view.showMessage("登录成功");
        } else {
            view.showMessage("登录失败");

        }
    }
}
