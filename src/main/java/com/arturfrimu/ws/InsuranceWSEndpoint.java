package com.arturfrimu.ws;

import com.arturfrimu.schemas.InsuranceApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InsuranceWSEndpoint {

    private static final String NAMESPACE_URI = "http://www.arturfrimu.com/schemas";

    private InsuranceService insuranceService;

    @Autowired
    public InsuranceWSEndpoint(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    public InsuranceWSEndpoint() {}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InsuranceApplication")
    @ResponsePayload
    public void insuranceApplication(@RequestPayload InsuranceApplication insuranceApplication) {
        if (insuranceApplication != null) {
            insuranceService.writeInsuranceApplication(insuranceApplication);
        }
        insuranceService.processInsuranceApplication(insuranceApplication);
    }
}
