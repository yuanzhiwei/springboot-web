package com.yuanzhiwei.util;

import java.util.Random;

/**
 * 获取可用的端口
 * 
 * @author 81450
 *
 */
public class ServerPortUtils {

	public static int getAvailablePort() {
		int max = 65535;
		int min = 2000;
		Random random = new Random();
		int port = random.nextInt(max) % (max - min + 1) + min;
		if (NetUtil.isLoclePortUsing(port)) {
			return getAvailablePort();
		} else {
			return port;
		}
	}
}
