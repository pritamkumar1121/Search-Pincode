package com.example.SearchPincode.Controller;

import java.security.Provider.Service;
import java.util.List;

import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SearchPincode.Service.PincodeService;
import com.example.SearchPincode.domain.Pincode;

@Controller
public class PincodeController<Postoffice> {
	
	
	 @Autowired
	    private PincodeService service;

	    @GetMapping("/")
	    public String add(Model model) {
	    	List<Pincode> listPincode = service.listAll();
	        model.addAttribute("pincode", new Pincode());
	        return "index";
	    }

	    
	    @PostMapping("/index")
	     public String doSearchEmployee(@ModelAttribute("pincodeSearchFormData") Pincode formData, Model model) {
	            Pincode pin = service.get(formData.getPincode());
	            model.addAttribute("pincode", pin);
	            return "index";            
	     }
}
