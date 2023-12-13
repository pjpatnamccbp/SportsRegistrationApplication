package com.govt.registerservice.serviceCient;

import com.govt.registerservice.dto.AadhaarServiceRequest;
import com.govt.registerservice.dto.AadhaarServiceResponse;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/

public interface IAadhaarServiceClient {
    AadhaarServiceResponse getDetails(AadhaarServiceRequest aadhaarServiceRequest);
}
