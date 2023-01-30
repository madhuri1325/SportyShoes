package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ShoeController {
	
	@Autowired
	ShoeDAO dao;

	
	@RequestMapping("/insertshoe")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoe s=new Shoe();
		s.setShoeid(Integer.parseInt(request.getParameter("ShoeId")));
		s.setShoename(request.getParameter("Shoename"));
          s.setShoeprice(Float.parseFloat(request.getParameter("ShoePrice")));	
		Shoe s1=dao.insert(s);
		if(s1!=null) {
			mv.setViewName("successshoe.jsp");
		}
		return mv;
	}

@RequestMapping("/getall")
public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();
	List<Shoe> list= dao.getall();
	mv.setViewName("displayshoelist.jsp");
	mv.addObject("list",list);
	return mv;
	
}
@RequestMapping("/editcontroller")
public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();
	Shoe s=new Shoe();
	s.setShoeid(Integer.parseInt(request.getParameter("shoeid")));
	s.setShoename(request.getParameter("shoename"));
	Shoe s2=dao.edit(s);
	if(s2!=null)
	{
		mv.setViewName("successedit.jsp");
	}
	return mv;
}

@RequestMapping("/DeleteController")
public ModelAndView dlt(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();
	Shoe s=new Shoe();
	s.setShoeid(Integer.parseInt(request.getParameter("shoeid")));

	String s2=dao.delete(s);
	if(s2!=null)
	{
		mv.setViewName("successdelete.jsp");
	}
	return mv;
}
	}



