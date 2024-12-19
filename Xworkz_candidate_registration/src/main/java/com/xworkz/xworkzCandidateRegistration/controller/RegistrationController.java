package com.xworkz.xworkzCandidateRegistration.controller;


import com.xworkz.xworkzCandidateRegistration.dto.RegistrationDTO;
import com.xworkz.xworkzCandidateRegistration.service.RegistrationService;
import com.xworkz.xworkzCandidateRegistration.service.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RegistrationController {

    @Autowired
    private RegistrationService service;
    public RegistrationController()
    {
        System.out.println("running RegistrationController");
    }

    @PostMapping("/submitLogin")
    public String onSave(RegistrationDTO registrationDTO, Model model)
    {
        String msg=this.service.validate(registrationDTO);
        RegistrationServiceImpl impl=(RegistrationServiceImpl)service;
        System.out.println(impl.saved);
        boolean save=impl.saved;
        if(save)
        {
            return "Success.jsp";
        }


        model.addAttribute("msg",msg);
        return "Signup.jsp";

    }

    @PostMapping("/find")
    public String onSearch(@RequestParam String email,@RequestParam String password, Model model)
    {
        String msg=this.service.findByEmailPassword(email,password);
        System.out.println(msg);

        model.addAttribute("msg",msg);
        return "SignIn.jsp";

    }

    @GetMapping("/abc")
    public String page(){
        return "SignIn.jsp";
    }





}
