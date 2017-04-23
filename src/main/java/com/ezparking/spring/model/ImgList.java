package com.ezparking.spring.model;

public class ImgList {
	private String simgname;
	private String imgname;
	public String getSimgname() {
		return simgname;
	}
	public void setSimgname(String simgname) {
		this.simgname = simgname;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	@Override
	public String toString() {
		return "ImgList [simgname=" + simgname + ", imgname=" + imgname + "]";
	}
	
}
