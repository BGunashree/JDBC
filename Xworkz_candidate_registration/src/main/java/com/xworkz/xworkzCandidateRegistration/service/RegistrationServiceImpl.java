package com.xworkz.xworkzCandidateRegistration.service;

import com.xworkz.xworkzCandidateRegistration.dto.RegistrationDTO;
import com.xworkz.xworkzCandidateRegistration.entity.RegistrationEntity;
import com.xworkz.xworkzCandidateRegistration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class RegistrationServiceImpl implements  RegistrationService{

    @Autowired
    private PasswordEncoder passwordEncoder;
    public boolean saved;
    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    public String validate(RegistrationDTO registrationDTO) {

        String msg=null;

        System.out.println(registrationDTO.toString());
        if(registrationDTO!=null) {
            String name = registrationDTO.getName();
            if (name.length() >= 10 && !name.isEmpty() && name.matches("[A-Za-z ]+")) {
                System.out.println("name is valid");
                int age = registrationDTO.getAge();
                if (age > 18) {
                    System.out.println("age is valid");
                    String email = registrationDTO.getEmail();
                    if (email.endsWith("gmail.com") && email.contains("@")) {
                        System.out.println("email is valid");
                        String password = registrationDTO.getPassword();
                        int specialCharCount = 0;
                        for (char c : password.toCharArray()) {
                            if (!Character.isLetterOrDigit(c)) {
                                specialCharCount++;
                            }
                        }
                        if (password != null && password.length() == 9 && specialCharCount == 2) {
                            System.out.println("valid password");
                            String confirmPassword = registrationDTO.getConfirmPassword();
                            if (confirmPassword.equals(password)) {
                                System.out.println("password matches");
                                String phone = String.valueOf(registrationDTO.getPhone());
                                if (phone.length() == 10 && phone != null && phone.startsWith("9")) {
                                    System.out.println("valid phone");


                                    RegistrationEntity registrationEntity = new RegistrationEntity();
                                    registrationEntity.setName(registrationDTO.getName());
                                    registrationEntity.setAge(registrationDTO.getAge());
                                    registrationEntity.setEmail(registrationDTO.getEmail());
                                    registrationEntity.setPassword(passwordEncoder.encode(registrationDTO.getPassword()));
                                    registrationEntity.setConfirmPassword(registrationDTO.getConfirmPassword());
                                    registrationEntity.setPhone(registrationDTO.getPhone());
                                    saved= this.registrationRepository.save(registrationEntity);
                                    System.out.println(saved);
                                    return "signup is successfull";
                                } else {
                                    msg = "phone no must begin with 9";
                                    return msg;
                                }

                            } else {
                                msg = "password doesnt match";
                                return msg;
                            }
                        } else {

                            msg = "password must contain 2 sc and 7 c";
                            return msg;
                        }

                    } else {
                        msg = "enter email containing '@gmail.com'";
                        return msg;
                    }


                } else {
                    msg = "enter age > 18";
                    return msg;
                }

            } else {
                msg = "enter name having 10 or more characters excluding special characters";
                return msg;
            }
        }





        return null;
    }

    @Override
    public String findByEmailPassword(String email, String password) {

       String name= registrationRepository.findByEmailPassword(email,password);
        return name;
    }
}
