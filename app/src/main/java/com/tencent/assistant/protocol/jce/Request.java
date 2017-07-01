package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class Request extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8056643078616095453L;
	static ReqHead a = new ReqHead();
	static byte[] b = (byte[]) new byte[1];
	public byte[] body = null;
	public ReqHead head = null;

	static {
		((byte[]) b)[0] = 0;
	}

	public Request() {
	}

	public Request(ReqHead paramReqHead, byte[] paramArrayOfByte) {
		this.head = paramReqHead;
		this.body = paramArrayOfByte;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.head = ((ReqHead) paramJceInputStream.read(a, 0, true));
		this.body = ((byte[]) paramJceInputStream.read(b, 1, false));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.head, 0);
		if (this.body != null) {
			paramJceOutputStream.write(this.body, 1);
		}
	}

	@Override
	public void display(StringBuilder sb, int level) {

	}
}
