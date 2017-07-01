package com.tencent.assistant.protocol.jce;

import java.util.ArrayList;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
public final class GetAppDetailRequest extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4148544607772410597L;
	static ArrayList<AppDetailParam> g = new ArrayList<AppDetailParam>();
	static TerminalExtra h = new TerminalExtra();
	public ArrayList<AppDetailParam> a = null;
	public String b = "";
	public int c = 0;
	public TerminalExtra d = null;
	public short e = 0;
	public long f = 0L;

	static {
		AppDetailParam localAppDetailParam = new AppDetailParam();
		g.add(localAppDetailParam);
	}

	public GetAppDetailRequest() {
	}

	public GetAppDetailRequest(ArrayList<AppDetailParam> paramArrayList, String paramString, int paramInt,
			TerminalExtra paramTerminalExtra, short paramShort, long paramLong) {
		this.a = paramArrayList;
		this.b = paramString;
		this.c = paramInt;
		this.d = paramTerminalExtra;
		this.e = paramShort;
		this.f = paramLong;
	}

	@SuppressWarnings("unchecked")
	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = ((ArrayList<AppDetailParam>) paramJceInputStream.read(g, 0, false));
		this.b = paramJceInputStream.readString(1, false);
		this.c = paramJceInputStream.read(this.c, 2, false);
		this.d = ((TerminalExtra) paramJceInputStream.read(h, 3, false));
		this.e = paramJceInputStream.read(this.e, 4, false);
		this.f = paramJceInputStream.read(this.f, 5, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		if (this.a != null) {
			paramJceOutputStream.write(this.a, 0);
		}
		if (this.b != null) {
			paramJceOutputStream.write(this.b, 1);
		}
		paramJceOutputStream.write(this.c, 2);
		if (this.d != null) {
			paramJceOutputStream.write(this.d, 3);
		}
		paramJceOutputStream.write(this.e, 4);
		paramJceOutputStream.write(this.f, 5);
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}