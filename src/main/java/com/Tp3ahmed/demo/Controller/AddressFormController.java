package com.Tp3ahmed.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AddressFormController {
    @GetMapping("/adresse")
    public String showAddressForm() {
        return "address-form";
    }
}
