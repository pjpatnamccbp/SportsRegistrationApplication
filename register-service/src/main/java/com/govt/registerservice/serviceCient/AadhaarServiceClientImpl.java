package com.govt.registerservice.serviceCient;

import com.govt.registerservice.dto.AadhaarServiceRequest;
import com.govt.registerservice.dto.AadhaarServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@Component
public class AadhaarServiceClientImpl implements IAadhaarServiceClient {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public AadhaarServiceResponse getDetails(AadhaarServiceRequest aadhaarServiceRequest) {
        return null;
    }
}
