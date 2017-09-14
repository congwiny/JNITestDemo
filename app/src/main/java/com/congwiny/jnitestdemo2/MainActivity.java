package com.congwiny.jnitestdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNITestUtils testUtils = new JNITestUtils();
        String text = testUtils.getString();
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
