package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShipmentController {
	@GetMapping("shipment")
	public String getShipment(){
		return "shipment/shipment";
	}
	
	@GetMapping("/courierList")
	public String getCourierList() {
		return "shipment/courierList";
	}
	
	@GetMapping("/addShipment")
	public String addShippedProductInfo() {
		return "shipment/addShipment";
	}
	
	@GetMapping("/shipmentList")
	public String getShipmentList() {
		return "shipment/shipmentList";
	}
}
