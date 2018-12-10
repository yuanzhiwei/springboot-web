package com.yuanzhiwei.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.yuanzhiwei.util.ServerPortUtils;

/**
 * 启动配置：端口
 * 
 * @author 81450
 *
 */
public class StartConfig {
	private Logger logger = LoggerFactory.getLogger(StartConfig.class);

	public StartConfig(String[] args) {
		boolean isServerPort = false;
		String serverPort = "";
		if (args != null) {
			for (String arg : args) {
				if (StringUtils.hasText(arg) && arg.startsWith("--server.port")) {
					isServerPort = true;
					serverPort = arg;
					break;
				}
			}
			if (!isServerPort) {
				int port = ServerPortUtils.getAvailablePort();
				logger.info("current server.port=" + port);
				System.setProperty("server.port", String.valueOf(port));
			} else {
				logger.info("current server.port=" + serverPort.split("=")[1]);
				System.setProperty("server.port", serverPort.split("=")[1]);
			}
		}
	}
}