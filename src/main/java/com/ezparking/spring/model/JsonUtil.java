package com.ezparking.spring.model;

import java.util.List;

public class JsonUtil {
	private String name;
	private int num;
	private int type;
	private int id;
	private String icon;
	private List<ImgList> imglist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<ImgList> getImglist() {
		return imglist;
	}
	public void setImglist(List<ImgList> imglist) {
		this.imglist = imglist;
	}
	@Override
	public String toString() {
		return "JsonUtil [name=" + name + ", num=" + num + ", type=" + type + ", id=" + id + ", icon=" + icon
				+ ", imglist=" + imglist + "]";
	}
	

}
