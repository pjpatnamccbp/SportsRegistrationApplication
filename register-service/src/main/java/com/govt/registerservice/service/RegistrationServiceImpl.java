package com.govt.registerservice.service;

import com.govt.registerservice.builder.RegistrationRequestBuilder;
import com.govt.registerservice.builder.RegistrationResponseBuilder;
import com.govt.registerservice.dao.IRegistrationRepository;
import com.govt.registerservice.dto.AadhaarServiceRequest;
import com.govt.registerservice.dto.AadhaarServiceResponse;
import com.govt.registerservice.dto.RegistrationRequest;
import com.govt.registerservice.dto.RegistrationResponse;
import com.govt.registerservice.serviceCient.IAadhaarServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@Service
public class RegistrationServiceImpl implements IRegistrationService{
    @Autowired
    private IRegistrationRepository registrationRepository;
    @Autowired
    private IAadhaarServiceClient aadhaarServiceClient;

    @Autowired
    private RegistrationRequestBuilder requestBuilder;
    @Autowired
    private RegistrationResponseBuilder responseBuilder;
    @Override
    public RegistrationResponse registration(RegistrationRequest registrationRequest) {
        AadhaarServiceRequest aadhaarServiceRequest = requestBuilder.buildAadhaarServiceRequest(registrationRequest);
        AadhaarServiceResponse aadhaarServiceResponse = aadhaarServiceClient.getDetails(aadhaarServiceRequest);
        return null;
    }
}
