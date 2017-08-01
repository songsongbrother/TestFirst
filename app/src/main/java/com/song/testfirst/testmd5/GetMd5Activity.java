package com.song.testfirst.testmd5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.song.testfirst.R;

public class GetMd5Activity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_md5);
        textView = ((TextView) findViewById(R.id.textView));

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button:
                // 获取md5
                // Md5Utils.getSingInfo(this);
                textView.setText(Md5Utils.getApkMd5(this));
                break;
            case R.id.button2:
                // 获取签名
                String sign = Md5Utils.getSign(this);
                textView.setText("sign:" + sign);
                break;
            default:
                break;
        }
    }
}
