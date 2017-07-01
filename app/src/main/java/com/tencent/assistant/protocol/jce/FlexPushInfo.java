package com.tencent.assistant.protocol.jce;

import java.util.ArrayList;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
public final class FlexPushInfo extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3769540902930512449L;
	static ArrayList<SettingInfo> d = new ArrayList<SettingInfo>();
	public short a = 0;
	public ArrayList<SettingInfo> b = null;
	public long c = 0L;

	static {
		SettingInfo localSettingInfo = new SettingInfo();
		d.add(localSettingInfo);
	}

	@SuppressWarnings("unchecked")
	public void readFrom(JceInputStream paramJceInputStream) {
		this.a = paramJceInputStream.read(this.a, 0, true);
		this.b = ((ArrayList<SettingInfo>) paramJceInputStream.read(d, 1, true));
		this.c = paramJceInputStream.read(this.c, 2, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.a, 0);
		paramJceOutputStream.write(this.b, 1);
		paramJceOutputStream.write(this.c, 2);
	}

	@Override
	public void display(StringBuilder sb, int level) {

	}
}
