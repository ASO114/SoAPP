package com.tencent.assistant.protocol.jce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceDisplayer;

public final class RspHead extends JceStruct implements Cloneable {
	static ArrayList<IPData> t;
	static Ticket u;
	static Ticket v;
	static Map<String, ArrayList<IPData>> w;
	static FlexPushInfo x;
	public int a = 0;
	public int b = 0;
	public short c = 0;
	public ArrayList<IPData> d = null;
	public int e = 0;
	public String f = "";
	public String g = "";
	public byte h = 0;
	public Ticket i = null;
	public Ticket j = null;
	public long k = 0L;
	public int l = 0;
	public int m = 0;
	public byte n = 0;
	public long o = 0L;
	public Map<String, ArrayList<IPData>> p = null;
	public String q = "";
	public String r = "";
	public FlexPushInfo s = null;

	static {
		t = new ArrayList();
		IPData localObject = new IPData();
		t.add(localObject);
		u = new Ticket();
		v = new Ticket();
		w = new HashMap();
		ArrayList localObject2 = new ArrayList();
		((ArrayList) localObject2).add(new IPData());
		w.put("", localObject2);
		x = new FlexPushInfo();
	}

	public void display(StringBuilder sb, int paramInt) {
		JceDisplayer paramStringBuilder = new JceDisplayer(sb, paramInt);
		paramStringBuilder.display(this.a, "requestId");
		paramStringBuilder.display(this.b, "cmdId");
		paramStringBuilder.display(this.c, "areacode");
		paramStringBuilder.display(this.d, "ipData");
		paramStringBuilder.display(this.e, "ret");
		paramStringBuilder.display(this.f, "phoneGuid");
		paramStringBuilder.display(this.g, "clientIp");
		paramStringBuilder.display(this.h, "encryptWithPack");
		paramStringBuilder.display(this.i, "ticket");
		paramStringBuilder.display(this.j, "csTicket");
		paramStringBuilder.display(this.k, "svrTimestamp");
		paramStringBuilder.display(this.l, "csTicketState");
		paramStringBuilder.display(this.m, "csTicketTTL");
		paramStringBuilder.display(this.n, "cmdFlag");
		paramStringBuilder.display(this.o, "newAreaCode");
		paramStringBuilder.display(this.p, "ipDataMap");
		paramStringBuilder.display(this.q, "imei");
		paramStringBuilder.display(this.r, "mac");
		paramStringBuilder.display(this.s, "pushInfo");
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
		this.c = paramJceInputStream.read(this.c, 2, true);
		this.d = ((ArrayList) paramJceInputStream.read(t, 3, true));
		this.e = paramJceInputStream.read(this.e, 4, true);
		this.f = paramJceInputStream.readString(5, false);
		this.g = paramJceInputStream.readString(6, false);
		this.h = paramJceInputStream.read(this.h, 7, false);
		this.i = ((Ticket) paramJceInputStream.read(u, 8, false));
		this.j = ((Ticket) paramJceInputStream.read(v, 9, false));
		this.k = paramJceInputStream.read(this.k, 10, false);
		this.l = paramJceInputStream.read(this.l, 11, false);
		this.m = paramJceInputStream.read(this.m, 12, false);
		this.n = paramJceInputStream.read(this.n, 13, false);
		this.o = paramJceInputStream.read(this.o, 14, false);
		this.p = ((Map) paramJceInputStream.read(w, 15, false));
		this.q = paramJceInputStream.readString(16, false);
		this.r = paramJceInputStream.readString(17, false);
		this.s = ((FlexPushInfo) paramJceInputStream.read(x, 18, false));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
		paramJceOutputStream.write(this.b, 1);
		paramJceOutputStream.write(this.c, 2);
		paramJceOutputStream.write(this.d, 3);
		paramJceOutputStream.write(this.e, 4);
		if (this.f != null) {
			paramJceOutputStream.write(this.f, 5);
		}
		if (this.g != null) {
			paramJceOutputStream.write(this.g, 6);
		}
		paramJceOutputStream.write(this.h, 7);
		if (this.i != null) {
			paramJceOutputStream.write(this.i, 8);
		}
		if (this.j != null) {
			paramJceOutputStream.write(this.j, 9);
		}
		paramJceOutputStream.write(this.k, 10);
		paramJceOutputStream.write(this.l, 11);
		paramJceOutputStream.write(this.m, 12);
		paramJceOutputStream.write(this.n, 13);
		paramJceOutputStream.write(this.o, 14);
		if (this.p != null) {
			paramJceOutputStream.write(this.p, 15);
		}
		if (this.q != null) {
			paramJceOutputStream.write(this.q, 16);
		}
		if (this.r != null) {
			paramJceOutputStream.write(this.r, 17);
		}
		if (this.s != null) {
			paramJceOutputStream.write(this.s, 18);
		}
	}
}