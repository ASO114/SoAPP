package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/**
 * Created on 2017/7/1.
 *
 * @author miyauchirenge
 */

public final class PkgRspHead
        extends JceStruct
{
    public int a = 0;
    public byte b = 0;
    public String c = "";

    public void readFrom(JceInputStream paramJceInputStream)
    {
        this.a = paramJceInputStream.read(this.a, 0, true);
        this.b = paramJceInputStream.read(this.b, 1, false);
        this.c = paramJceInputStream.readString(2, false);
    }

    @Override
    public void display(StringBuilder sb, int level) {

    }

    public void writeTo(JceOutputStream paramJceOutputStream)
    {
        paramJceOutputStream.write(this.a, 0);
        paramJceOutputStream.write(this.b, 1);
        if (this.c != null) {
            paramJceOutputStream.write(this.c, 2);
        }
    }
}
