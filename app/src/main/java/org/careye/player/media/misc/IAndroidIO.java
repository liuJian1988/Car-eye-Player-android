/*
 * Car eye 车辆管理平台: www.car-eye.cn
 * Car eye 开源网址: https://github.com/Car-eye-team
 * Copyright 2018
 */

package org.careye.player.media.misc;

import java.io.IOException;

@SuppressWarnings("RedundantThrows")
public interface IAndroidIO {
    int  open(String url) throws IOException;
    int  read(byte[] buffer, int size) throws IOException;
    long seek(long offset, int whence) throws IOException;
    int  close() throws IOException;
}
