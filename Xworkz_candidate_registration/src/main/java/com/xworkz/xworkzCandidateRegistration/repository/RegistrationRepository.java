package com.xworkz.xworkzCandidateRegistration.repository;

import com.xworkz.xworkzCandidateRegistration.entity.RegistrationEntity;

public interface RegistrationRepository {

    boolean save(RegistrationEntity registrationEntity);

    String findByEmailPassword(String email,String password);
}
