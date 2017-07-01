package com.tencent.assistant.protocol.jce;

import java.util.ArrayList;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import com.qq.taf.jce.JceDisplayer;

public final class ReqHead extends JceStruct implements Cloneable {
	static Net A;
	static Terminal B;
	static TerminalExtra C;
	static ArrayList<ReqHeadExternal> D;
	static FlexPushInfo E;
	static Ticket z;
	public int a = 0;
	public int b = 0;
	public String c = "";
	public Ticket d = null;
	public String e = "";
	public Net f = null;
	public short g = 0;
	public Terminal h = null;
	public long i = 0L;
	public String j = "";
	public byte k = 0;
	public byte l = 0;
	public byte m = 0;
	public String n = "";
	public String o = "";
	public int p = 0;
	public TerminalExtra q = null;
	public long r = 0L;
	public long s = 0L;
	public byte t = 0;
	public ArrayList<ReqHeadExternal> u = null;
	public long v = 0L;
	public byte w = 0;
	public String x = "";
	public FlexPushInfo y = null;

	static {
		z = new Ticket();
		A = new Net();
		B = new Terminal();
		C = new TerminalExtra();
		D = new ArrayList();
		ReqHeadExternal localReqHeadExternal = new ReqHeadExternal();
		D.add(localReqHeadExternal);
		E = new FlexPushInfo();
	}

	public void display(StringBuilder sb, int paramInt) {
		JceDisplayer paramStringBuilder = new JceDisplayer(sb, paramInt);
		paramStringBuilder.display(this.a, "requestId");
		paramStringBuilder.display(this.b, "cmdId");
		paramStringBuilder.display(this.c, "phoneGuid");
		paramStringBuilder.display(this.d, "ticket");
		paramStringBuilder.display(this.e, "qua");
		paramStringBuilder.display(this.f, "net");
		paramStringBuilder.display(this.g, "areacode");
		paramStringBuilder.display(this.h, "terminal");
		paramStringBuilder.display(this.i, "uin");
		paramStringBuilder.display(this.j, "moloDeviceId");
		paramStringBuilder.display(this.k, "encryptWithPack");
		paramStringBuilder.display(this.l, "isForeground");
		paramStringBuilder.display(this.m, "caller");
		paramStringBuilder.display(this.n, "qImei");
		paramStringBuilder.display(this.o, "via");
		paramStringBuilder.display(this.p, "souceOrg");
		paramStringBuilder.display(this.q, "terminalExtra");
		paramStringBuilder.display(this.r, "svrTimestamp");
		paramStringBuilder.display(this.s, "clientTimestamp");
		paramStringBuilder.display(this.t, "cmdFlag");
		paramStringBuilder.display(this.u, "externalList");
		paramStringBuilder.display(this.v, "newAreaCode");
		paramStringBuilder.display(this.w, "sceneFlag");
		paramStringBuilder.display(this.x, "funId");
		paramStringBuilder.display(this.y, "pushInfo");
	}

	public boolean equals(Object paramObject) {
		paramObject = (ReqHead) paramObject;
		return ((!JceUtil.equals(this.a, ((ReqHead) paramObject).a))
				|| (!JceUtil.equals(this.b, ((ReqHead) paramObject).b))
				|| (!JceUtil.equals(this.c, ((ReqHead) paramObject).c))
				|| (!JceUtil.equals(this.d, ((ReqHead) paramObject).d))
				|| (!JceUtil.equals(this.e, ((ReqHead) paramObject).e))
				|| (!JceUtil.equals(this.f, ((ReqHead) paramObject).f))
				|| (!JceUtil.equals(this.g, ((ReqHead) paramObject).g))
				|| (!JceUtil.equals(this.h, ((ReqHead) paramObject).h))
				|| (!JceUtil.equals(this.i, ((ReqHead) paramObject).i))
				|| (!JceUtil.equals(this.j, ((ReqHead) paramObject).j))
				|| (!JceUtil.equals(this.k, ((ReqHead) paramObject).k))
				|| (!JceUtil.equals(this.l, ((ReqHead) paramObject).l))
				|| (!JceUtil.equals(this.m, ((ReqHead) paramObject).m))
				|| (!JceUtil.equals(this.n, ((ReqHead) paramObject).n))
				|| (!JceUtil.equals(this.o, ((ReqHead) paramObject).o))
				|| (!JceUtil.equals(this.p, ((ReqHead) paramObject).p))
				|| (!JceUtil.equals(this.q, ((ReqHead) paramObject).q))
				|| (!JceUtil.equals(this.r, ((ReqHead) paramObject).r))
				|| (!JceUtil.equals(this.s, ((ReqHead) paramObject).s))
				|| (!JceUtil.equals(this.t, ((ReqHead) paramObject).t))
				|| (!JceUtil.equals(this.u, ((ReqHead) paramObject).u))
				|| (!JceUtil.equals(this.v, ((ReqHead) paramObject).v))
				|| (!JceUtil.equals(this.w, ((ReqHead) paramObject).w))
				|| (!JceUtil.equals(this.x, ((ReqHead) paramObject).x))
				|| (!JceUtil.equals(this.y, ((ReqHead) paramObject).y)));
	}

	public int hashCode() {
		try {
			throw new Exception("Need define key first!");
		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return 0;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.read(this.a, 0, true);
		this.b = paramJceInputStream.read(this.b, 1, true);
		this.c = paramJceInputStream.readString(2, true);
		this.d = ((Ticket) paramJceInputStream.read(z, 3, false));
		this.e = paramJceInputStream.readString(4, true);
		this.f = ((Net) paramJceInputStream.read(A, 5, true));
		this.g = paramJceInputStream.read(this.g, 6, true);
		this.h = ((Terminal) paramJceInputStream.read(B, 7, false));
		this.i = paramJceInputStream.read(this.i, 8, false);
		this.j = paramJceInputStream.readString(9, false);
		this.k = paramJceInputStream.read(this.k, 10, false);
		this.l = paramJceInputStream.read(this.l, 11, false);
		this.m = paramJceInputStream.read(this.m, 12, false);
		this.n = paramJceInputStream.readString(13, false);
		this.o = paramJceInputStream.readString(14, false);
		this.p = paramJceInputStream.read(this.p, 15, false);
		this.q = ((TerminalExtra) paramJceInputStream.read(C, 16, false));
		this.r = paramJceInputStream.read(this.r, 17, false);
		this.s = paramJceInputStream.read(this.s, 18, false);
		this.t = paramJceInputStream.read(this.t, 19, false);
		this.u = ((ArrayList) paramJceInputStream.read(D, 20, false));
		this.v = paramJceInputStream.read(this.v, 21, false);
		this.w = paramJceInputStream.read(this.w, 22, false);
		this.x = paramJceInputStream.readString(23, false);
		this.y = ((FlexPushInfo) paramJceInputStream.read(E, 24, false));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
		paramJceOutputStream.write(this.b, 1);
		paramJceOutputStream.write(this.c, 2);
		if (this.d != null) {
			paramJceOutputStream.write(this.d, 3);
		}
		paramJceOutputStream.write(this.e, 4);
		paramJceOutputStream.write(this.f, 5);
		paramJceOutputStream.write(this.g, 6);
		if (this.h != null) {
			paramJceOutputStream.write(this.h, 7);
		}
		paramJceOutputStream.write(this.i, 8);
		if (this.j != null) {
			paramJceOutputStream.write(this.j, 9);
		}
		paramJceOutputStream.write(this.k, 10);
		paramJceOutputStream.write(this.l, 11);
		paramJceOutputStream.write(this.m, 12);
		if (this.n != null) {
			paramJceOutputStream.write(this.n, 13);
		}
		if (this.o != null) {
			paramJceOutputStream.write(this.o, 14);
		}
		paramJceOutputStream.write(this.p, 15);
		if (this.q != null) {
			paramJceOutputStream.write(this.q, 16);
		}
		paramJceOutputStream.write(this.r, 17);
		paramJceOutputStream.write(this.s, 18);
		paramJceOutputStream.write(this.t, 19);
		if (this.u != null) {
			paramJceOutputStream.write(this.u, 20);
		}
		paramJceOutputStream.write(this.v, 21);
		paramJceOutputStream.write(this.w, 22);
		if (this.x != null) {
			paramJceOutputStream.write(this.x, 23);
		}
		if (this.y != null) {
			paramJceOutputStream.write(this.y, 24);
		}
	}
}
