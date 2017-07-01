package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class ReqHeadExternal extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3229192475722747143L;
	static byte[] c = (byte[]) new byte[1];
	public int a = 0;
	public byte[] b = null;

	static {
		((byte[]) c)[0] = 0;
	}

	public ReqHeadExternal() {
	}

	public int describeContents() {
		return 0;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.read(this.a, 0, true);
		this.b = ((byte[]) paramJceInputStream.read(c, 1, true));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
		paramJceOutputStream.write(this.b, 1);
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}

}