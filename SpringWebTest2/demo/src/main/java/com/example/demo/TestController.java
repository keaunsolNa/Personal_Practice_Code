package com.example.demo;


import java.util.Map;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestController {
	
    
	@GetMapping(value = "/requestGet")
	@CrossOrigin(origins = "*")
    @ResponseBody 
    public String requestGet(@RequestParam Map<String, String> params, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
   		
//    	System.out.println(params);
//    	
//    	System.out.println("getMethod : " + request.getMethod());
//    	System.out.println("getRequestURI : " + request.getRequestURI());
//    	System.out.println("getQueryString : " + request.getQueryString());
//    	System.out.println("getRemoteAddr : " + request.getRemoteAddr());
//    	
//    	System.out.println("request.getSession() : " + request.getSession());
//    	
//    	System.out.println("request.getHeaderNames() : " + request.getHeaderNames());
//    	System.out.println("request.getDispatcherType() : " +request.getDispatcherType());
//    	System.out.println("request.getProtocol() : " + request.getProtocol());
//    	String returnData = "Get Request Accept";
    	
		
		String sender = params.keySet().toString().replaceAll("\\[|\\]", "");
		String msg = params.get(sender);
		String json = "{\"sender\":\""+sender+"\", \"msg\":\""+msg+"\"}";
		

    	return json;
    }
    
	
    @RequestMapping(value="/requestPost", method= RequestMethod.POST)
    @CrossOrigin(origins = "*")
    @ResponseBody
    public String requestPost(@RequestBody String text, HttpServletRequest request,
            HttpServletResponse response) {
    	
    	System.out.println(text);
    	
    	System.out.println("getMethod : " + request.getMethod());
    	System.out.println("getRequestURI : " + request.getRequestURI());
    	System.out.println("getQueryString : " + request.getQueryString());
    	System.out.println("getRemoteAddr : " + request.getRemoteAddr());
    	
    	System.out.println("request.getSession() : " + request.getSession());
    	
    	System.out.println("request.getHeaderNames() : " + request.getHeaderNames());
    	System.out.println("request.getDispatcherType() : " +request.getDispatcherType());
    	System.out.println("request.getProtocol() : " + request.getProtocol());
    	
    	String returnData = "Post Request Accept";
    	
    	
    	return text;
    }
}