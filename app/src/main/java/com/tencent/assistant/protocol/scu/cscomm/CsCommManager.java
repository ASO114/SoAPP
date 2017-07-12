package com.tencent.assistant.protocol.scu.cscomm;

import com.tencent.assistant.protocol.jce.PkgReq;
import com.tencent.assistant.protocol.jce.PkgRsp;
import com.tencent.assistant.protocol.jce.Request;
import com.tencent.assistant.protocol.jce.Response;

import java.util.HashMap;

/**
 * Created on 2017/6/15.
 *
 * @author miyauchirenge
 */

public class CsCommManager {
    public static CsCommManager csCommManager;

    static {
        System.loadLibrary("yyb_csech");
    }

    public static CsCommManager getInstance() {
        if (csCommManager == null) {
            csCommManager = new CsCommManager();
        }
        return csCommManager;
    }

    public static native void clearAuthTicket();

    public static native int getAuthTicket(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4, BytesObject paramBytesObject1, BytesObject paramBytesObject2);

    public static native int getSessionId(BytesObject paramBytesObject);

    public static native byte[] hmac(byte[] paramArrayOfByte, int paramInt);

    public static native int startAuthComm(Object paramObject);

    public native int decryptResponse(PkgRsp paramPkgRsp, Response paramResponse);

    public native int encryptRequest(Request paramRequest, PkgReq paramPkgReq);

    public static void csStatReport(int a, int b, int c, String s) {
    }
}
