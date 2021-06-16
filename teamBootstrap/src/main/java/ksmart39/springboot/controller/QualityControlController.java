package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QualityControlController {
	
	@GetMapping("/qualityControl")
	public String getQulity() {
		return "quality/qualityControl";
	}

	@GetMapping("/addStandardTable")
	public String addStandardTable() {
		return "quality/addStandardTable";
	}
	
	@GetMapping("/getStandardTableList")
	public String getStandardTableList() {
		return "quality/StandardTableList";
	}
}
