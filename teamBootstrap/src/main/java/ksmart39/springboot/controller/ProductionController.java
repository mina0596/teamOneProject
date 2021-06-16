package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductionController {
	
	@GetMapping("/production")
	public String getProdcutioncontrol() {
		return "production/production";
	}

	
	@GetMapping("/addProductionProcess")
	public String addProductionProcess() {
		return "production/addProductionProcess";
	}
	
	@GetMapping("/productionProcessList")
	public String getProductionProcessList() {
		return "production/productionProcessList";
	}
}
