package com.song.testfirst.testscreenshot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.song.testfirst.R;

public class ScreenShotActivity extends AppCompatActivity {

    private ScreenShotListenManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_shot);

        manager = ScreenShotListenManager.newInstance(this);
    }

    public void startClick(View button) {
        Log.i(this.getClass().getSimpleName(), "startClick");
        switch (button.getId()) {
            case R.id.setting:
                manager.setListener(new ScreenShotListenManager.OnScreenShotListener() {
                                        public void onShot(String imagePath) {
                                            // do something
                                            Toast.makeText(ScreenShotActivity.this, imagePath, Toast.LENGTH_SHORT).show();

                                        }
                                    }
                );
                break;
            case R.id.start:
                Toast.makeText(ScreenShotActivity.this, "start", Toast.LENGTH_SHORT).show();
                manager.startListen();
                break;
            case R.id.end:
                Toast.makeText(ScreenShotActivity.this, "end", Toast.LENGTH_SHORT).show();
                manager.stopListen();
                break;
            default:
                break;
        }
    }
}
