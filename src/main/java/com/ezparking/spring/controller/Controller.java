package com.ezparking.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
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
		
		String[] content = _content.getCon().split(",");
		String[] imgPath = _content.getImgPath().split(",");
		
		List<Content> contentList = new ArrayList<Content>();
		int j = (content.length >= imgPath.length)?content.length:imgPath.length;
		for (int i = 0; i < j; i++) {
			Content newsContent = new Content();
			if (content.length > i) {
				newsContent.setCon(content[i]);
			}
			if (imgPath.length > i) {
				newsContent.setImgPath(imgPath[i]);
			}

			newsContent.setNum(i + 1);
			contentList.add(newsContent);
		}
		System.out.println("title:" + title);
		System.out.println("icon_url:" + iconUrl);
		for (Content content2 : contentList) {
			System.out.println(content2);
		}
		return "redirect:push.do";
	}
}
