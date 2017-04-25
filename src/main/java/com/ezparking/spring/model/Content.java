package com.ezparking.spring.model;

public class Content {
	private int id;
	private	String con;
	private String imgPath;
	private int num;
	private int newsListID;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}

	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNewsListID() {
		return newsListID;
	}
	public void setNewsListID(int newsListID) {
		this.newsListID = newsListID;
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", con=" + con + ", imgPath=" + imgPath + ", num=" + num + ", newsListID=" + newsListID + "]";
	}
	
	
}
