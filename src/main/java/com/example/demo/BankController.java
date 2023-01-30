package com.example.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class BankController {
	
	@Autowired
	BankDAO dao;

	
	@RequestMapping("/insertbank")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Bank b=new Bank();
		b.setBid(Integer.parseInt(request.getParameter("Bid")));
		b.setBbalance(Float.parseFloat(request.getParameter("Bbalance")));
	  //  float bb=b.getBbalance();
		Bank b1=dao.insert(b);
		if(b1!=null) {
		//	if(b.equals(b1)) {
				
			
			mv.setViewName("bankbal.jsp");
		}
			else
			{
				mv.setViewName("payfail.jsp");
			}
		
	//}
		return mv;
	}
//	@RequestMapping("/getAll_bank")
//
//public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
//	ModelAndView mv=new ModelAndView();
//	
//	List<Bank> list=dao.getAll_bank();
//	mv.setViewName("bankdetails.jsp");
//	mv.addObject("list",list);
//	return mv;
//	
//}
}