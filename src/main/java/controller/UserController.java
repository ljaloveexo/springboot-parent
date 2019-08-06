package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class UserController { 
	@RequestMapping("/sayHello") 
    @ResponseBody 
    public String sayHello(){ return "hello world"; } }
