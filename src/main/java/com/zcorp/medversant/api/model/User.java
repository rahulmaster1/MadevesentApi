package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usertable")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer id;
    @NotBlank
    @Size (max = 20)
    private String firstName;
    @NotBlank
    @Size (max = 50)
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="Europe/Berlin")

    private Date birthDate;
    @NotBlank
    @Size (max = 50)
    private String username; 
    @NotBlank
    private String password; 
    @NotBlank
    @Email
    @Column (unique = true)
    private String email; 
    @NotBlank
    private String securityQuestion; 
    @NotBlank
    private String securityAnswer;
    private Organization organization;
    // @ManyToMany
    // @JoinTable(name = "user_role", 
    // joinColumns = @JoinColumn(name = "user_id"), 
    // inverseJoinColumns = @JoinColumn(name = "role_id"))
    // private Set<Role> roles;

    public User(Integer id, String firstName, String lastName, Date birthDate, String username, String password, String email, String securityQuestion, String securityAnswer, Organization organization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        // this.passwordConfirm = passwordConfirm;
        this.email = email;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        // this.roles = roles;
        this.organization = organization;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(password);
    }

    // @Transient
    // public String getPasswordConfirm() {
    //     return this.passwordConfirm;
    // }

    // public void setPasswordConfirm(String passwordConfirm) {
    //     this.passwordConfirm = passwordConfirm;
    // }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecurityQuestion() {
        return this.securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return this.securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public Organization getOrganization() {
        return this.organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    // public Set<Role> getRoles() {
    //     return this.roles;
    // }

    // public void setRoles(Set<Role> roles) {
    //     this.roles = roles;
    // }

    public User(){
        
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
