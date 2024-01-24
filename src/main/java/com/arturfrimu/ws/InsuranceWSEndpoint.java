package com.arturfrimu.ws;

import com.arturfrimu.schemas.InsuranceApplication;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InsuranceWSEndpoint {

    private static final String NAMESPACE_URI = "http://www.arturfrimu.com/spring-ws-insurance";

    private final InsuranceService insuranceService;

    public InsuranceWSEndpoint(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "insuranceApplication")
    @ResponsePayload
    public void insuranceApplication(@RequestPayload InsuranceApplication insuranceApplication) {
        if (insuranceApplication != null) {
            insuranceService.writeInsuranceApplication(insuranceApplication);
        }
        insuranceService.processInsuranceApplication(insuranceApplication);
    }
}
