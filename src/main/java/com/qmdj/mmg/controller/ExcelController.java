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
	
	//ʹ�ù��캯����������ʹ�ù̶����ļ���
	public ExcelController(HttpServletRequest request,File userfile){
		
		//��ȡ�û�ip��ַ
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
        
      //���û�иü�¼�����¼�����ݿ�
        user.setIpcode(ip);
       List<User> userResultList = userService.getUserByALL(user,ip);
        
        
        
		String excelNameCode = ip.split(".")[0]+ip.split(".")[1];
		
		
		
		
		
		
		File userfloder = null;
	}
	
	
	
	

	@RequestMapping("/merge.jsp")
	public void excelMerge(HttpServletRequest request)throws Exception {
		//Create Blank workbook
		
		
        
        
		
		
		//��ȡIP��������Ϊ����
		
		
		
		HSSFWorkbook MegExRes = new HSSFWorkbook(); 
		
		HSSFSheet sheet = MegExRes.createSheet("sheetname1"); 
		
		
		
	     /* HSSFWorkbook hw = new HSSFWorkbook();
	      FileOutputStream out = new FileOutputStream(
	    	      new File("createworkbook.xlsx"));*/
	}



	
}
