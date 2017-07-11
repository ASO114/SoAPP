package com.miyauchirenge.soapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.assistant.protocol.jce.PkgRsp;
import com.tencent.assistant.protocol.jce.Response;
import com.qq.taf.jce.JceInputStream;
import com.tencent.assistant.protocol.scu.cscomm.CsCommManager;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        CsCommManager.clearAuthTicket();
        CsCommManager.startAuthComm(this.getApplication());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JceInputStream jis = new JceInputStream(
                        FileUtils.readFileToByteArray("/mnt/sdcard/u1.trace"));
                jis.setServerEncoding("utf-8");
                PkgRsp rsp = new PkgRsp();
                rsp.readFrom(jis);
                Response rp = new Response();
                CsCommManager.a().decryptResponse(rsp, rp);
                rp.display(new StringBuilder(), 0);
            }
        });
    }
}
