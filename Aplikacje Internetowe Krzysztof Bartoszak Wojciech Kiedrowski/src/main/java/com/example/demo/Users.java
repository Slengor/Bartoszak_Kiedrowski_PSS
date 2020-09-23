package com.example.demo;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Entity(name = "Users")
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable=false)
    private int id;
    @Column(name = "companyName", nullable=false)
    private String companyName;
    @Column(name = "companyAddress", nullable=false)
    private String companyAddress;
    @Column(name = "companyNIP", nullable=false)
    private String companyNIP;
    @Column(name = "name", nullable=false)
    private String name;
    @Column(name = "lastName", nullable=false)
    private String lastName;
    @Column(name = "email", nullable=false)
    private String email;
    @Column(name = "password", nullable=false)
    private String password;
    @GeneratedValue
    @Column(name = "status")
    private Boolean status;
    @GeneratedValue
    @Column(name = "registrationDate")
    private Date registrationDate;
    @GeneratedValue
    @Column(name = "role")
    private int role;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "role_users",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id")}
    )
    private Set<Role> rolee = new HashSet<>();
    
    @Autowired
    @OneToMany(mappedBy = "delegation", cascade = CascadeType.ALL)
    private Set<Delegation> delegations = new HashSet<>();

    public Users() {
    }
    public void addDelegation(Optional<Delegation> d){
        this.delegations.add(d.orElse(null));
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyNIP() {
        return companyNIP;
    }

    public void setCompanyNIP(String companyNIP) {
        this.companyNIP = companyNIP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
