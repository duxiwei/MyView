package com.duxiwei.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.duxiwei.widget.BasisView;

public class MainActivity extends Activity {

    BasisView basisView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basisView = (BasisView)findViewById(R.id.bv_main_btn);
        basisView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"BasicView",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
