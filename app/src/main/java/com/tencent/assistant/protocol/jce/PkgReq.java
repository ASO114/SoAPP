package com.tencent.assistant.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class PkgReq extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6995233842487757702L;
	static PkgReqHead a = new PkgReqHead();
	static byte[] b = (byte[]) new byte[1];
	public PkgReqHead pkgReqHead = null;
	public byte[] reqEncData = null;

	static {
		((byte[]) b)[0] = 0;
	}

	public PkgReq() {
	}

	public PkgReq(PkgReqHead paramPkgReqHead, byte[] paramArrayOfByte) {
		this.pkgReqHead = paramPkgReqHead;
		this.reqEncData = paramArrayOfByte;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.pkgReqHead = ((PkgReqHead) paramJceInputStream.read(a, 0, true));
		this.reqEncData = ((byte[]) paramJceInputStream.read(b, 1, false));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.pkgReqHead, 0);
		if (this.reqEncData != null) {
			paramJceOutputStream.write(this.reqEncData, 1);
		}
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}