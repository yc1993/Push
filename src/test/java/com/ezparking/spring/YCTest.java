package com.ezparking.spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.alibaba.fastjson.JSON;
import com.ezparking.spring.model.JsonUtil;

public class YCTest {
	
	public static void test() throws IOException{
		String filePath = "src/main/resources/info.json";
		File file = new File(filePath);
		if (file.exists() && file.isFile()){
			String encoding = "utf-8";
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file),encoding);
			BufferedReader br = new BufferedReader(isr);
			String content = null;
			
			while ((content = br.readLine()) != null) {
				JsonUtil ju = JSON.parseObject(content, JsonUtil.class);
				System.out.println(ju);
			}
			br.close();
		}
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
