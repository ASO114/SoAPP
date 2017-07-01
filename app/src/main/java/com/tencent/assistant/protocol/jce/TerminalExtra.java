package com.tencent.assistant.protocol.jce;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;


public final class TerminalExtra extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = -891004549656562835L;
	public String a = "";
	public int b = 0;
	public int c = 0;
	public int d = 0;
	public long e = 0L;
	public String f = "";
	public String g = "";
	public String h = "";

	public TerminalExtra() {
	}

	public int describeContents() {
		return 0;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.readString(0, false);
		this.b = paramJceInputStream.read(this.b, 1, false);
		this.c = paramJceInputStream.read(this.c, 2, false);
		this.d = paramJceInputStream.read(this.d, 3, false);
		this.e = paramJceInputStream.read(this.e, 4, false);
		this.f = paramJceInputStream.readString(5, false);
		this.g = paramJceInputStream.readString(6, false);
		this.h = paramJceInputStream.readString(7, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		if (this.a != null) {
			paramJceOutputStream.write(this.a, 0);
		}
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
		if (this.h != null) {
			paramJceOutputStream.write(this.h, 7);
		}
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}

}