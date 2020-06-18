package com.miyauchirenge.soapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.opos.cmn.nt.crypt.EncryptUtils;
import com.tencent.assistant.protocol.jce.FlexPushInfo;
import com.tencent.assistant.protocol.jce.GetAppDetailRequest;
import com.tencent.assistant.protocol.jce.MultiCmdRequest;
import com.tencent.assistant.protocol.jce.Net;
import com.tencent.assistant.protocol.jce.PkgReq;
import com.tencent.assistant.protocol.jce.PkgRsp;
import com.tencent.assistant.protocol.jce.ReqHead;
import com.tencent.assistant.protocol.jce.ReqHeadExternal;
import com.tencent.assistant.protocol.jce.Request;
import com.tencent.assistant.protocol.jce.Response;
import com.qq.taf.jce.JceInputStream;
import com.tencent.assistant.protocol.jce.SingleCmdRequest;
import com.tencent.assistant.protocol.jce.Terminal;
import com.tencent.assistant.protocol.jce.TerminalExtra;
import com.tencent.assistant.protocol.jce.Ticket;
import com.tencent.assistant.protocol.scu.cscomm.BytesObject;
import com.tencent.assistant.protocol.scu.cscomm.CsCommManager;

import java.util.ArrayList;

import joor.Reflect;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CsCommManager csCommManager;

    private View.OnClickListener yybOnClickListener;
    private View.OnClickListener oppoOnClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        /*
        CsCommManager.clearAuthTicket();
        CsCommManager.startAuthComm(this.getApplication());
        csCommManager = CsCommManager.getInstance();

        yybOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BytesObject localBytesObject1 = new BytesObject();
                BytesObject localBytesObject2 = new BytesObject();
                int i = CsCommManager.getAuthTicket("749367599153491968", System.currentTimeMillis() / 1000L, "127.0.0.1", "863360020232702", "???", localBytesObject1, localBytesObject2);

                ReqHead head = new ReqHead();

                FlexPushInfo fpi = new FlexPushInfo();
                fpi.c = 0;
                fpi.a = -1;

                Ticket ticket = new Ticket();
                ticket.a = 0;
                ticket.b = new byte[0];


                Net net = new Net();
                net.h = "6c:19:8f:bc:e3:70";
                net.g = "CostasLoop_5G";
                net.d = "";
                net.c = 1;
                net.e = -1;
                net.f = 0;
                net.b = -1129066612;
                net.a = 1;

                ReqHeadExternal ext = new ReqHeadExternal();
                ext.a = 2;
                byte guid[] = {0x31, 0x31, 0x64, 0x37, 0x63, 0x33, 0x34, 0x36, 0x2D, 0x34, 0x63, 0x34, 0x33, 0x2D, 0x34, 0x66, 0x64, 0x32, 0x2D, 0x62, 0x64, 0x39, 0x61, 0x2D, 0x30, 0x37, 0x64, 0x38, 0x65, 0x39, 0x39, 0x35, 0x62, 0x64, 0x32, 0x63};
                ext.b = guid;

                ArrayList<ReqHeadExternal> arrExt = new ArrayList<ReqHeadExternal>();
                arrExt.add(ext);

                Terminal t = new Terminal();
                t.a = "863360020232702";
                t.b = "8c:be:be:70:2a:e2";
                t.c = "845635330b1a3bf2";
                t.d = "";
                t.e = "";
                t.f = "";
                t.g = "";
                t.h = "3f64be77989fe9994356964d986a03cf58c10aad";

                TerminalExtra te = new TerminalExtra();
                te.a = "";
                te.h = "";
                te.g = "";
                te.f = "";
                te.b = 0;
                te.e = 0;
                te.c = 0;
                te.d = 0;

                head.y = fpi;
                head.x = "613";
                head.c = "749367599153491968";
                head.d = ticket;
                head.e = "TMAF_704_F_2586/072586&NA/072586/7042130_2586&4.4.4_19_1_2_0_1&120_67_14&Xiaomi_MI3W_Xiaomi_cancro&998856&2586&V3";
                head.f = net;
                head.u = arrExt;
                head.h = t;
                head.q = te;
                head.j = "1499782959961{db22f466-4711-46ef-9cab-a8f517027004}130";
                head.o = "";
                head.n = "863360020232702";
                head.m = 1;
                head.v = 156011000100181000L;
                head.s = System.currentTimeMillis() / 1000L;
                head.r = 0;
                head.i = 0;
                head.p = -100;
                head.k = 0;
                head.t = 0;
                head.g = 0;
                head.l = 1;
                head.w = 1;
                head.b = 1000;
                head.a = 0;

                MultiCmdRequest multiRequest = new MultiCmdRequest();
                JceInputStream multiJis = new JceInputStream(
                        FileUtils.readFileToByteArray("/mnt/sdcard/request.dump"));
                multiRequest.readFrom(multiJis);
                GetAppDetailRequest getAppDetailRequest = new GetAppDetailRequest();
                JceInputStream singleJis = new JceInputStream(multiRequest.a.get(0).b);
                getAppDetailRequest.readFrom(singleJis);

                Request request = new Request();
                request.head = head;
                request.body = getAppDetailRequest.toByteArray();

                PkgReq pkgReq = new PkgReq();
                csCommManager.encryptRequest(request, pkgReq);

//                JceInputStream jis = new JceInputStream(
//                        FileUtils.readFileToByteArray("/mnt/sdcard/u1.trace"));
//                jis.setServerEncoding("utf-8");
//                PkgRsp rsp = new PkgRsp();
//                rsp.readFrom(jis);
//                Response rp = new Response();
//                CsCommManager.a().decryptResponse(rsp, rp);
//                rp.display(new StringBuilder(), 0);
            }
        };
        */
        oppoOnClickListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String cipher = OppoAnalyzor.reflectEncrypt("1","359250055365538");
                Log.i("oppoCipher","cipher=" + cipher);
            }
        };
        button.setOnClickListener(oppoOnClickListener);
    }


}
