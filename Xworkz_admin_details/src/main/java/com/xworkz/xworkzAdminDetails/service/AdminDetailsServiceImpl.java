package com.xworkz.xworkzAdminDetails.service;

import com.xworkz.xworkzAdminDetails.dto.AdminDetailsDTO;
import com.xworkz.xworkzAdminDetails.entity.AdminDetailsEntity;
import com.xworkz.xworkzAdminDetails.repository.AdminDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDetailsServiceImpl implements  AdminDetailsService{

    @Autowired
    private AdminDetailsRepository repository;

    @Override
    public boolean validate(AdminDetailsDTO adminDetailsDTO) {

        boolean valid=true;
        if(adminDetailsDTO!=null) {
            String name = adminDetailsDTO.getName();
            if(name.length()>=10 && !name.isEmpty() && name.matches("[A-Za-z ]+"))
            {
                System.out.println("valid name");
            }
            else {
                valid=false;
                System.out.println("enter valid name");
            }
            int age=adminDetailsDTO.getAge();
            if(age>18)
            {
                System.out.println("valid age");
            }
            else {
                valid=false;
                System.out.println("enter age > 18");
            }
            String email=adminDetailsDTO.getEmail();
            if(email.endsWith("gmail.com") && email.contains("@"))
            {
                System.out.println("valid email");
            }
            else {
                valid=false;
                System.out.println("enter valid email");
            }
            String password=adminDetailsDTO.getPassword();
            int specialCharCount=0;
            for (char c : password.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    specialCharCount++;
                }
            }
            if(password!=null && password.length()==9 && specialCharCount==2)
            {
                System.out.println("valid password");
            }
            else {
                valid=false;

                System.out.println("enter valid password");
            }
            String confirmPassword=adminDetailsDTO.getConfirmPassword();
            if(confirmPassword.equals(password))
            {
                System.out.println("password matches");
            }
            else
            {
                valid=false;
                System.out.println("cpassword is not same");

            }
            String phone=String.valueOf(adminDetailsDTO.getPhone());
            if(phone.length()==10 && phone!=null && phone.startsWith("9"))
            {
                System.out.println("phone is valid");
            }
            else
            {
                valid=false;
                System.out.println("invalid phone");
            }

        }
        if(valid) {
            AdminDetailsEntity adminDetailsEntity=new AdminDetailsEntity();
            adminDetailsEntity.setName(adminDetailsDTO.getName());
            adminDetailsEntity.setAge(adminDetailsDTO.getAge());
            adminDetailsEntity.setEmail(adminDetailsDTO.getEmail());
            adminDetailsEntity.setPassword(adminDetailsDTO.getPassword());
            adminDetailsEntity.setConfirmPassword(adminDetailsDTO.getConfirmPassword());
            adminDetailsEntity.setPhone(adminDetailsDTO.getPhone());
           this. repository.save(adminDetailsEntity);
            return  true;

        }
        return false;
    }
}
