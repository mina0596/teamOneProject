package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AccountingController {
	
	@GetMapping("/accounting")
	public String account() {
		return "accounting/accounting";
		
	}
	
	@GetMapping("/addInvoiceApproval")
	public String addInvoiceApproval() {
		return "accounting/addInvoiceApproval";
	}
	
	@GetMapping("/invoiceApprovalList")
	public String getInvoiceApprovalList() {
		return "accounting/invoiceApprovalList";
	}
			

}
