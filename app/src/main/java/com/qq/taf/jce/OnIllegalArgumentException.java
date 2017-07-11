package com.qq.taf.jce;

import java.nio.ByteBuffer;

/**
 * Created on 2017/7/11.
 *
 * @author miyauchirenge
 */

public abstract interface OnIllegalArgumentException {
    public abstract void onException(IllegalArgumentException paramIllegalArgumentException, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
}
