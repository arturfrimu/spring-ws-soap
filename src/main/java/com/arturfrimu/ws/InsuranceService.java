package com.arturfrimu.ws;

import com.arturfrimu.schemas.InsuranceApplication;

public interface InsuranceService {

    void writeInsuranceApplication(InsuranceApplication insuranceRequest);

    void processInsuranceApplication(InsuranceApplication insuranceRequest);
}
