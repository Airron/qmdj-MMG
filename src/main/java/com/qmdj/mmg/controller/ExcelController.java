package com.qmdj.mmg.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qmdj.mmg.service.UserService;
import com.qmdj.mmg.vo.User;


@Controller
@RequestMapping("/excel")
public class ExcelController {
	
	
	@Autowired
	private UserService userService;
	private User user;
	
	//使用构造函数创建或者使用固定的文件夹
	public ExcelController(HttpServletRequest request,File userfile){
		
		//获取用户ip地址
		String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        
      //如果没有该记录，则记录到数据库
        user.setIpcode(ip);
       List<User> userResultList = userService.getUserByALL(user,ip);
        
        
        
		String excelNameCode = ip.split(".")[0]+ip.split(".")[1];
		
		
		
		
		
		
		File userfloder = null;
	}
	
	
	
	

	@RequestMapping("/merge.jsp")
	public void excelMerge(HttpServletRequest request)throws Exception {
		//Create Blank workbook
		
		
        
        
		
		
		//获取IP的两段作为命名
		
		
		
		HSSFWorkbook MegExRes = new HSSFWorkbook(); 
		
		HSSFSheet sheet = MegExRes.createSheet("sheetname1"); 
		
		
		
	     /* HSSFWorkbook hw = new HSSFWorkbook();
	      FileOutputStream out = new FileOutputStream(
	    	      new File("createworkbook.xlsx"));*/
	}



	
}
