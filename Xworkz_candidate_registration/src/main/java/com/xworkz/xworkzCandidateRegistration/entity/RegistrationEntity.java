package com.xworkz.xworkzCandidateRegistration.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="registration_details_table")
@Data
@NoArgsConstructor

@NamedQuery(name="findyByEmailAndPassword",query="select re.name from RegistrationEntity re where re.email =:byEmail and re.password =:byPass")
public class RegistrationEntity {

    @Id
    @GenericGenerator(name = "yourName" , strategy = "increment")
    @GeneratedValue(generator = "yourName")
    private int id;
    @Column(name="admin_name")
    private String name;
    private int age;
    private String email;
    @Column(name="admin_password")
    private String password;
    @Column(name="confirm_password")
    private String confirmPassword;
    private long phone;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public long getPhone() {
        return phone;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}