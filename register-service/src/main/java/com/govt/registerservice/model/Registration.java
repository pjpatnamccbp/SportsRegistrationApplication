package com.govt.registerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@Data
@Entity
@Table(name = "registration_details")
public class Registration {
    @Id
    private String registrationId;
    private String aadhaarNo;
    private String mobile;
    private String name;
    private String gender;
    private String permanentAddress;
    private String fatherName;
    private String dob;
}
