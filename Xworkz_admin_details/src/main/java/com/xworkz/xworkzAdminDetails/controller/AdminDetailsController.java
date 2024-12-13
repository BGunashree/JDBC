package com.xworkz.xworkzAdminDetails.controller;


import com.xworkz.xworkzAdminDetails.dto.AdminDetailsDTO;
import com.xworkz.xworkzAdminDetails.service.AdminDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class AdminDetailsController {

    @Autowired
    private AdminDetailsService service;
    public AdminDetailsController()
    {
        System.out.println("running AdminDetailsController");
    }

    @PostMapping("/submitLogin")
    public String onSubmit(AdminDetailsDTO adminDetailsDTO)
    {
        System.out.println("controller:"+adminDetailsDTO.toString());
        if(this.service.validate(adminDetailsDTO))
        {
            return "Success.jsp";
        }
        else {

            return "Login.jsp";
        }
    }
}
