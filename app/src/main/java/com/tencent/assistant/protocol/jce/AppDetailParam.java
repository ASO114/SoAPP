package com.tencent.assistant.protocol.jce;


import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;


public final class AppDetailParam extends JceStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2403121036402358745L;
	static byte[] a = (byte[]) new byte[1];
	public byte actionFlag = 0;
	public long apkId = 0L;
	public String apkMd5 = "";
	public int apkVersionCode = 0;
	public long appId = 0L;
	public byte appType = 1;
	public byte authPlatform = 0;
	public String channelId = "";
	public String contentId = "";
	public String fileListMd5 = "";
	public int ftType = 0;
	public int grayVersionCode = 0;
	public String localCutEocdMd5 = "";
	public String localVersionName = "";
	public String manifestMd5 = "";
	public String packageName = "";
	public byte[] recommend_id = null;
	public String signatureMd5 = "";
	public String token = "";
	public String verifyAppId = "";
	public byte verifyType = 0;
	public int versionCode = 0;

	static {
		((byte[]) a)[0] = 0;
	}

	public AppDetailParam() {
	}

	public AppDetailParam(long paramLong1, String paramString1, String paramString2, int paramInt1, String paramString3,
			byte paramByte1, long paramLong2, int paramInt2, String paramString4, byte paramByte2, int paramInt3,
			String paramString5, byte paramByte3, byte paramByte4, String paramString6, byte[] paramArrayOfByte,
			String paramString7, String paramString8, String paramString9, String paramString10, String paramString11,
			int paramInt4) {
		this.appId = paramLong1;
		this.packageName = paramString1;
		this.signatureMd5 = paramString2;
		this.versionCode = paramInt1;
		this.manifestMd5 = paramString3;
		this.appType = paramByte1;
		this.apkId = paramLong2;
		this.apkVersionCode = paramInt2;
		this.channelId = paramString4;
		this.actionFlag = paramByte2;
		this.grayVersionCode = paramInt3;
		this.token = paramString5;
		this.verifyType = paramByte3;
		this.authPlatform = paramByte4;
		this.verifyAppId = paramString6;
		this.recommend_id = paramArrayOfByte;
		this.fileListMd5 = paramString7;
		this.apkMd5 = paramString8;
		this.localVersionName = paramString9;
		this.localCutEocdMd5 = paramString10;
		this.contentId = paramString11;
		this.ftType = paramInt4;
	}

	public void readFrom(JceInputStream paramJceInputStream) {
		this.appId = paramJceInputStream.read(this.appId, 0, false);
		this.packageName = paramJceInputStream.readString(1, false);
		this.signatureMd5 = paramJceInputStream.readString(2, false);
		this.versionCode = paramJceInputStream.read(this.versionCode, 3, false);
		this.manifestMd5 = paramJceInputStream.readString(4, false);
		this.appType = paramJceInputStream.read(this.appType, 5, false);
		this.apkId = paramJceInputStream.read(this.apkId, 6, false);
		this.apkVersionCode = paramJceInputStream.read(this.apkVersionCode, 7, false);
		this.channelId = paramJceInputStream.readString(8, false);
		this.actionFlag = paramJceInputStream.read(this.actionFlag, 9, false);
		this.grayVersionCode = paramJceInputStream.read(this.grayVersionCode, 10, false);
		this.token = paramJceInputStream.readString(11, false);
		this.verifyType = paramJceInputStream.read(this.verifyType, 12, false);
		this.authPlatform = paramJceInputStream.read(this.authPlatform, 13, false);
		this.verifyAppId = paramJceInputStream.readString(14, false);
		this.recommend_id = ((byte[]) paramJceInputStream.read(a, 15, false));
		this.fileListMd5 = paramJceInputStream.readString(16, false);
		this.apkMd5 = paramJceInputStream.readString(17, false);
		this.localVersionName = paramJceInputStream.readString(18, false);
		this.localCutEocdMd5 = paramJceInputStream.readString(19, false);
		this.contentId = paramJceInputStream.readString(20, false);
		this.ftType = paramJceInputStream.read(this.ftType, 21, false);
	}

	public void writeTo(JceOutputStream paramJceOutputStream) {
		paramJceOutputStream.write(this.appId, 0);
		if (this.packageName != null) {
			paramJceOutputStream.write(this.packageName, 1);
		}
		if (this.signatureMd5 != null) {
			paramJceOutputStream.write(this.signatureMd5, 2);
		}
		paramJceOutputStream.write(this.versionCode, 3);
		if (this.manifestMd5 != null) {
			paramJceOutputStream.write(this.manifestMd5, 4);
		}
		paramJceOutputStream.write(this.appType, 5);
		paramJceOutputStream.write(this.apkId, 6);
		paramJceOutputStream.write(this.apkVersionCode, 7);
		if (this.channelId != null) {
			paramJceOutputStream.write(this.channelId, 8);
		}
		paramJceOutputStream.write(this.actionFlag, 9);
		paramJceOutputStream.write(this.grayVersionCode, 10);
		if (this.token != null) {
			paramJceOutputStream.write(this.token, 11);
		}
		paramJceOutputStream.write(this.verifyType, 12);
		paramJceOutputStream.write(this.authPlatform, 13);
		if (this.verifyAppId != null) {
			paramJceOutputStream.write(this.verifyAppId, 14);
		}
		if (this.recommend_id != null) {
			paramJceOutputStream.write(this.recommend_id, 15);
		}
		if (this.fileListMd5 != null) {
			paramJceOutputStream.write(this.fileListMd5, 16);
		}
		if (this.apkMd5 != null) {
			paramJceOutputStream.write(this.apkMd5, 17);
		}
		if (this.localVersionName != null) {
			paramJceOutputStream.write(this.localVersionName, 18);
		}
		if (this.localCutEocdMd5 != null) {
			paramJceOutputStream.write(this.localCutEocdMd5, 19);
		}
		if (this.contentId != null) {
			paramJceOutputStream.write(this.contentId, 20);
		}
		paramJceOutputStream.write(this.ftType, 21);
	}

	@Override
	public void display(StringBuilder sb, int level) {
		// TODO Auto-generated method stub

	}
}
