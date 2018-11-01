package com.fanxin.android.broadcastsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
*发送广播
 * 发送广播的名称是"com.sample.custom.action"
 * 接收者要在manifest.xml中注册这个广播，当接收到这个广播的时候，就做receiver函数里面的内容
 * API要小于25才可以使用静态注册的方法
*@author Fan Xin <fanxin.hit@gmail.com>
*@time  2018-11-01
*/
public class MainActivity extends AppCompatActivity {
    private Button sender;
    private final String CUSTOM_ACTION = "com.sample.custom.action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sender = (Button) findViewById(R.id.id_sender);

        sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //发送广播给receiver
                Intent intent = new Intent();
                intent.setAction(CUSTOM_ACTION);
                MainActivity.this.sendBroadcast(intent);

            }
        });
    }
}
