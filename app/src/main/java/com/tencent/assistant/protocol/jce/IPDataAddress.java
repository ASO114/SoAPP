package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class IPDataAddress extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1624205509068261974L;
	public String a = "";
	public short b = 0;

	public IPDataAddress() {
	}

	public IPDataAddress(String paramString, short paramShort) {
		this.a = paramString;
		this.b = paramShort;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.readString(0, true);
		this.b = paramJceInputStream.read(this.b, 1, true);
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
