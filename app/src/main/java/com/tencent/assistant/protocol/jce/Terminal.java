package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class Terminal extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5733315059513974382L;
	public String a = "";
	public String b = "";
	public String c = "";
	public String d = "";
	public String e = "";
	public String f = "";
	public String g = "";
	public String h = "";

	public Terminal() {
	}

	public int describeContents() {
		return 0;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.readString(0, false);
		this.b = paramJceInputStream.readString(1, false);
		this.c = paramJceInputStream.readString(2, false);
		this.d = paramJceInputStream.readString(3, false);
		this.e = paramJceInputStream.readString(4, false);
		this.f = paramJceInputStream.readString(5, false);
		this.g = paramJceInputStream.readString(6, false);
		this.h = paramJceInputStream.readString(7, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		if (this.a != null) {
			paramJceOutputStream.write(this.a, 0);
		}
		if (this.b != null) {
			paramJceOutputStream.write(this.b, 1);
		}
		if (this.c != null) {
			paramJceOutputStream.write(this.c, 2);
		}
		if (this.d != null) {
			paramJceOutputStream.write(this.d, 3);
		}
		if (this.e != null) {
			paramJceOutputStream.write(this.e, 4);
		}
		if (this.f != null) {
			paramJceOutputStream.write(this.f, 5);
		}
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
