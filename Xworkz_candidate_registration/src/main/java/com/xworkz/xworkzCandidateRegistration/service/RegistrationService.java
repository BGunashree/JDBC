package com.xworkz.xworkzCandidateRegistration.service;

import com.xworkz.xworkzCandidateRegistration.dto.RegistrationDTO;

public interface RegistrationService {

    String validate(RegistrationDTO registrationDTO);

    String findByEmailPassword(String email,String password);
}
