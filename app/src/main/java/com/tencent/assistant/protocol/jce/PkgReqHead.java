package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class PkgReqHead extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8424171889840050545L;
	static Ticket f = new Ticket();
	public int a = 0;
	public Ticket b = null;
	public byte c = 0;
	public String d = "";
	public String e = "";

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.read(this.a, 0, true);
		this.b = ((Ticket) paramJceInputStream.read(f, 1, false));
		this.c = paramJceInputStream.read(this.c, 2, false);
		this.d = paramJceInputStream.readString(3, false);
		this.e = paramJceInputStream.readString(4, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
		if (this.b != null) {
			paramJceOutputStream.write(this.b, 1);
		}
		paramJceOutputStream.write(this.c, 2);
		if (this.d != null) {
			paramJceOutputStream.write(this.d, 3);
		}
		if (this.e != null) {
			paramJceOutputStream.write(this.e, 4);
		}
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}