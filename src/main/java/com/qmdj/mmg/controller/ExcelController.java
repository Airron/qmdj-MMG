package com.qmdj.mmg.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/excel")
public class ExcelController {
	
	
	
	//获取用户ip地址
	private String getIp(HttpServletRequest request) {
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
        return ip;
        
        
    }
	
	

	@RequestMapping("/merge.jsp")
	public void excelMerge(HttpServletRequest request)throws Exception {
		//Create Blank workbook
		
		String ip=this.getIp(request);
        
        
		System.out.println(ip);
		
		String excelNameCode = ip.split(".")[0]+ip.split(".")[1];
		
		
		HSSFWorkbook MegExRes = new HSSFWorkbook(); 
		
		HSSFSheet sheet = MegExRes.createSheet("sheetname1"); 
		
		
		
	     /* HSSFWorkbook hw = new HSSFWorkbook();
	      FileOutputStream out = new FileOutputStream(
	    	      new File("createworkbook.xlsx"));*/
	}



	
}
