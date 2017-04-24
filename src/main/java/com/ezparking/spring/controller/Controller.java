package com.ezparking.spring.controller;

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
	public String push(HttpSession session ,ModelMap map, HttpServletRequest request, Content _content/*,String title, String iconUrl, String[] content, String[] url*/){
		System.out.println("content:" +_content.getCon() + " imgPath:" + _content.getImgPath());
		/*System.out.println("title:" + title + " iconUrl:" + iconUrl );
		if (content != null && content.length > 0) {
			for (String string : content) {
				System.out.println("content:" + string);
			}
		}
		if (url != null && url.length > 0) {
			for (String string : url) {
				System.out.println("url:" + string);
			}
		}*/
		return "redirect:push.do";
	}
}
