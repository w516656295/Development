package moa.controller;  

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestCtrl {
	@RequestMapping("/name")
	@ResponseBody
	public String getName(){
		return "ggggggg";
	}
}
