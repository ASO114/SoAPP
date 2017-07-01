package com.tencent.assistant.protocol.jce;

import java.util.ArrayList;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
public final class MultiCmdRequest extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1269275518386495403L;
	static ArrayList<SingleCmdRequest> b = new ArrayList<SingleCmdRequest>();
	public ArrayList<SingleCmdRequest> a = null;

	static {
		SingleCmdRequest localSingleCmdRequest = new SingleCmdRequest();
		b.add(localSingleCmdRequest);
	}

	@SuppressWarnings("unchecked")
	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = ((ArrayList<SingleCmdRequest>) paramJceInputStream.read(b, 0, true));
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}
