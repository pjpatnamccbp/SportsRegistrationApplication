package com.govt.registerservice.controller;

import com.govt.registerservice.dto.RegistrationRequest;
import com.govt.registerservice.dto.RegistrationResponse;
import com.govt.registerservice.model.Registration;
import com.govt.registerservice.service.IRegistrationService;
import com.govt.registerservice.validator.RegistrationRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp ON 04-12-2023
 * @Description
 **/
@RestController
@RequestMapping("/aadudam-andhra")
public class RegistrationController {
    @Autowired
    private RegistrationRequestValidator requestValidator;

    @Autowired
    private IRegistrationService registrationService;

    public ResponseEntity<RegistrationResponse> registration(@RequestBody RegistrationRequest registrationRequest){
        requestValidator.validateRequest(registrationRequest);
        return new ResponseEntity<>(registrationService.registration(registrationRequest), HttpStatus.CREATED);
    }
}
