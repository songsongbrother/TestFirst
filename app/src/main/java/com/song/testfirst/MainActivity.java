package com.song.testfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.song.testfirst.testmd5.GetMd5Activity;
import com.song.testfirst.testscreenshot.ScreenShotActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View button) {
        Log.i(this.getClass().getSimpleName(), "click");
        switch (button.getId()) {
            case R.id.screenshot:
                this.startActivity(new Intent(this, ScreenShotActivity.class));
                break;
            case R.id.md5:
                this.startActivity(new Intent(this, GetMd5Activity.class));
                break;
            default:

                break;
        }
    }
}
