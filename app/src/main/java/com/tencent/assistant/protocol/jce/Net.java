package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class Net extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 418389831307273788L;
	public byte a = 0;
	public int b = 0;
	public byte c = 2;
	public String d = "";
	public int e = 0;
	public byte f = 0;
	public String g = "";
	public String h = "";

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.read(this.a, 0, true);
		this.b = paramJceInputStream.read(this.b, 1, true);
		this.c = paramJceInputStream.read(this.c, 2, false);
		this.d = paramJceInputStream.readString(3, false);
		this.e = paramJceInputStream.read(this.e, 4, false);
		this.f = paramJceInputStream.read(this.f, 5, false);
		this.g = paramJceInputStream.readString(6, false);
		this.h = paramJceInputStream.readString(7, false);
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
		if (this.g != null) {
			paramJceOutputStream.write(this.g, 6);
		}
		if (this.h != null) {
			paramJceOutputStream.write(this.h, 7);
		}
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}