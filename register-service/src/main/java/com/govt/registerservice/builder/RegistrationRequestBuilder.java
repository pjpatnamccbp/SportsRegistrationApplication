package com.govt.registerservice.builder;

import com.govt.registerservice.dto.AadhaarServiceRequest;
import com.govt.registerservice.dto.RegistrationRequest;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@Component
public class RegistrationRequestBuilder {

    public AadhaarServiceRequest buildAadhaarServiceRequest(RegistrationRequest registrationRequest) {
        AadhaarServiceRequest aadhaarServiceRequest = new AadhaarServiceRequest();

        aadhaarServiceRequest.setAadhaarNo(registrationRequest.getAadhaarNo());
        aadhaarServiceRequest.setMobile(registrationRequest.getMobile());
        return aadhaarServiceRequest;
    }
}
