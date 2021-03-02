package com.lijunbo.util;

import java.util.UUID;

public class FileUpUtil {
	public static String getNewFileName(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}
	/**
	 * 按真实文件名称截取后缀
	 * @param fileName 真实文件全称
	 * @return 后缀，如.png  .txt .mp3
	 */
	public static String getFileType(String fileName){
		return fileName.substring(fileName.lastIndexOf("."));
	}
}
