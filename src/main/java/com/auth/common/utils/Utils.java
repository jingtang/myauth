package com.auth.common.utils;

import java.util.UUID;

public class Utils {
	 
	/**
	 * 生成UUID
	 * @return
	 */
	public static String getUUID() {
		
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
