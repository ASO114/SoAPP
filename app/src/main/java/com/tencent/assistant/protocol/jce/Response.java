package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class Response extends JceStruct {
	static RspHead a = new RspHead();
	static byte[] b = (byte[]) new byte[1];
	public byte[] body = null;
	public RspHead head = null;

	static {
		((byte[]) b)[0] = 0;
	}

	public Response() {
	}

	public Response(RspHead paramRspHead, byte[] paramArrayOfByte) {
		this.head = paramRspHead;
		this.body = paramArrayOfByte;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.head = ((RspHead) paramJceInputStream.read(a, 0, true));
		this.body = ((byte[]) paramJceInputStream.read(b, 1, true));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.head, 0);
		paramJceOutputStream.write(this.body, 1);
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub
		
	}
}
