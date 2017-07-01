package com.tencent.assistant.protocol.jce;

import java.util.ArrayList;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class IPData extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6978788591763237581L;
	static int d = 0;
	static ArrayList<IPDataAddress> e = new ArrayList();
	public int a = 0;
	public ArrayList<IPDataAddress> b = null;
	public long c = 0L;

	static {
		IPDataAddress localIPDataAddress = new IPDataAddress();
		e.add(localIPDataAddress);
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.read(this.a, 0, true);
		this.b = ((ArrayList) paramJceInputStream.read(e, 1, true));
		this.c = paramJceInputStream.read(this.c, 2, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
		paramJceOutputStream.write(this.b, 1);
		paramJceOutputStream.write(this.c, 2);
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}
