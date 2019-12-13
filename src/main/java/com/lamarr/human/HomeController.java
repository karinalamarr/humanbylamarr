package com.lamarr.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value="fname", required=false, defaultValue="Human") String fname,
    					@RequestParam(value="lname", required=false, defaultValue="") String lname)
    		{
    	System.out.println("fname: "+fname);
    	System.out.println("lname: "+lname);
    	 	
    	return "<h1>Hello " + fname +" "+ lname+ "!</h1>" + "<h2>WELCOME to MY Spring boot!</h2>";
    }
}