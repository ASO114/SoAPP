package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/**
 * Created on 2017/7/1.
 *
 * @author miyauchirenge
 */

public final class PkgRsp
        extends JceStruct
{
    static PkgRspHead a = new PkgRspHead();
    static byte[] b = (byte[])new byte[1];
    public PkgRspHead pkgRspHead = null;
    public byte[] rspEncData = null;

    static
    {
        ((byte[])b)[0] = 0;
    }

    public PkgRsp() {}

    public PkgRsp(PkgRspHead paramPkgRspHead, byte[] paramArrayOfByte)
    {
        this.pkgRspHead = paramPkgRspHead;
        this.rspEncData = paramArrayOfByte;
    }

    public void readFrom(JceInputStream paramJceInputStream)
    {
        this.pkgRspHead = ((PkgRspHead)paramJceInputStream.read(a, 0, true));
        this.rspEncData = ((byte[])paramJceInputStream.read(b, 1, false));
    }

    @Override
    public void display(StringBuilder sb, int level) {

    }

    public void writeTo(JceOutputStream paramJceOutputStream)
    {
        paramJceOutputStream.write(this.pkgRspHead, 0);
        if (this.rspEncData != null) {
            paramJceOutputStream.write(this.rspEncData, 1);
        }
    }
}
