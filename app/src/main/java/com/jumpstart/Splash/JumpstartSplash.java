package com.jumpstart.Splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.jumpstart.Login;
import com.jumpstart.R;

/**
 * Created by junvir on 7/4/2016.
 */
public class JumpstartSplash  extends Activity {

    private static final int SECONDS = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_jumpstart_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(JumpstartSplash.this, Login.class);
                JumpstartSplash.this.startActivity(intent);JumpstartSplash.this.startActivity(intent);
                JumpstartSplash.this.finish();
            }
        }, SECONDS);
    }
}
