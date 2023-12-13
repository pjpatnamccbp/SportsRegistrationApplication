package com.govt.registerservice.dto;

import lombok.Data;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@Data
public class RegistrationRequest {
    private String aadhaarNo;
    private String mobile;
    private String registerType;
}
