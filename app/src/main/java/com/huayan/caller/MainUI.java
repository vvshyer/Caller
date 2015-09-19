package com.huayan.caller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainUI extends AppCompatActivity {

    /**
     * 当界面刚被创建时调此方法
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //必须执行此代码，执行父类初始化操作

        setContentView(R.layout.main);  //设置当前界面显示布局
    }

    public void call(View v){
        System.out.println("拨打电话");
        //1.取出输入框中的号码
        EditText etNumber =(EditText) findViewById(R.id.number);    //输入框对象
        //2.根据号码拨打电话
        String number = etNumber.getText().toString();  //需要拨打的号码

    }
}
