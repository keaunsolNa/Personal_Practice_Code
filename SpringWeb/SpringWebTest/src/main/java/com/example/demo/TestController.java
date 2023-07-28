package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
    
    @PostMapping(value="/selectAll")
    @ResponseBody
    public String selectAll(@RequestBody String text) {
    	System.out.println(text);
    	String returnData = "잘 왔다.";
        
    	
    	return returnData;
    }
}