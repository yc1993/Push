package com.ezparking.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezparking.spring.model.Content;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping(value="/update",produces = "text/json,charset=UTF-8")
	public void update(HttpServletResponse response) throws Exception{
		String json = "{\"success\":true,\"msg\":\"修改成功\"}";
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json"); 
		response.getWriter().print(json);
		response.getWriter().flush();
		response.getWriter().close();
	}
	
	@RequestMapping(value="push", method=RequestMethod.GET)
	public String push(ModelMap map, HttpServletRequest request, String icon){
		return "JSP/push.jsp";
	}
	
	@RequestMapping(value="/push", method=RequestMethod.POST)
	public String push(HttpSession session ,ModelMap map, HttpServletRequest request, Content _content, String title, String iconUrl/*, String[] content, String[] url*/){
//<<<<<<< HEAD
//		
//		String[] content = _content.getCon().split(",");
//		String[] imgPath = _content.getImgPath().split(",");
//		
//		List<Content> contentList = new ArrayList<Content>();
//		int j = (content.length >= imgPath.length)?content.length:imgPath.length;
//		for (int i = 0; i < j; i++) {
//			Content newsContent = new Content();
//			if (content.length > i) {
//				newsContent.setCon(content[i]);
//			}
//			if (imgPath.length > i) {
//				newsContent.setImgPath(imgPath[i]);
//			}
//
//			newsContent.setNum(i + 1);
//			contentList.add(newsContent);
//		}
//		System.out.println("title:" + title);
//		System.out.println("icon_url:" + iconUrl);
//		for (Content content2 : contentList) {
//			System.out.println(content2);
//		}
//=======
		//获取所有字段包括空
		String[] content = _content.getCon().split(",");
		String[] imgPath = _content.getImgPath().split(",");
		//去除空字段
		List<String> contentList = new ArrayList<String>();
		for (String string : content) {
			if (!StringUtils.isEmpty(string)) {
				contentList.add(string);	
			}
		}
		List<String> imgPathList = new ArrayList<String>();
		for (String string : imgPath) {
			if (!StringUtils.isEmpty(string)) {
				imgPathList.add(string);
			}
		}
		//放入对象中
		int a = 0, b = 0;
		List<Content> newsContentList = new ArrayList<Content>();
		for (int i = 0; i < (contentList.size() + imgPathList.size()); i++) {
			Content newsContent = new Content();
			if (i % 2 == 0) {
				if (a < contentList.size() && (contentList.get(a) != null || contentList.get(a) != "")) {
					newsContent.setCon(contentList.get(a));
					a++;
				}else {
					newsContent.setImgPath(imgPathList.get(b));
					b++;
				}
			}else {
				if (b < imgPathList.size() && (imgPathList.get(b) != null || imgPathList.get(b) != "")) {
					newsContent.setImgPath(imgPathList.get(b));
					b++;
				}else {
					newsContent.setCon(contentList.get(a));
					a++;
				}
			}
			newsContent.setNum(i + 1);
			newsContentList.add(newsContent);
		}
		System.out.println("title:" + title + " icon_url:" + iconUrl);
		for (Content content2 : newsContentList) {
			System.out.println(content2);
		}
		return "redirect:push.do";
	}
}
