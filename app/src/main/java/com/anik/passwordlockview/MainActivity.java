package com.anik.passwordlockview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hanks.passcodeview.PasscodeView;

public class MainActivity extends AppCompatActivity {

    PasscodeView passcodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }


        setContentView(R.layout.activity_main);

        PasscodeView passcodeView = (PasscodeView) findViewById(R.id.passcodeView);
        passcodeView
                .setPasscodeLength(4)
                .setLocalPasscode("5555") //your password
                .setListener(new PasscodeView.PasscodeViewListener() {


                    @Override
                    public void onFail() {

                    }

                    @Override
                    public void onSuccess(String number) {
                        Toast.makeText(getApplication(), "finish", Toast.LENGTH_SHORT).show();
                        onBackPressed();
                    }
                });


    }
}
