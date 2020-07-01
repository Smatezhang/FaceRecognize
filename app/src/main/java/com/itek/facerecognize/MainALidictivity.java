package com.itek.facerecognize;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainALidictivity extends AppCompatActivity  {


    String mIp;
    EditText mEtIp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_lidi);
         mEtIp = findViewById(R.id.et_ip);
        Button btn_websocket = findViewById(R.id.btn_websocket);
        String baseurl = SPUtils.getInstance().getString("baseurl");
        if (!TextUtils.isEmpty(baseurl)) {
            mEtIp.setText(baseurl);
        }
        btn_websocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIp = mEtIp.getText().toString().trim();
                if (TextUtils.isEmpty(mIp) ) {
                    Toast.makeText(MainALidictivity.this,"请先输入视频流地址",Toast.LENGTH_LONG).show();
                    return;
                }
                SPUtils.getInstance().put("baseurl", mIp);

                Intent mIntent = new Intent(MainALidictivity.this, MainActivity.class);
                mIntent.putExtra("url",mIp);
                startActivity(mIntent);
            }
        });

    }

}
