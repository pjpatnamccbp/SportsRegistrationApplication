package com.govt.registerservice.service;

import com.govt.registerservice.dto.RegistrationRequest;
import com.govt.registerservice.dto.RegistrationResponse;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
public interface IRegistrationService {
    RegistrationResponse registration(RegistrationRequest registrationRequest);
}
