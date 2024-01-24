package com.arturfrimu.ws;

import com.arturfrimu.schemas.ApplicantType;
import com.arturfrimu.schemas.InsuranceApplication;
import com.arturfrimu.schemas.InsuranceInfoType;
import com.arturfrimu.schemas.WidgetInfoType;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Override
    public void writeInsuranceApplication(InsuranceApplication insuranceRequest) {
        System.out.println("Insurance Application: " + insuranceRequest);

        ApplicantType applicantType = insuranceRequest.getApplicant();
        System.out.println("Insurance Applicant First Name : " + applicantType.getFirstName());
        System.out.println("Insurance Applicant Middle Name : " + applicantType.getMiddleName());
        System.out.println("Insurance Applicant Last Name : " + applicantType.getLastName());
        System.out.println("Insurance Applicant SSN : " + applicantType.getSSN());

        WidgetInfoType widgetInfo = insuranceRequest.getWidgetInfo();
        System.out.println("Widget Information: Contract Number : " + widgetInfo.getWgtContractNumber());
        System.out.println("Widget Information: Amount : " + widgetInfo.getWgtAmount());

        InsuranceInfoType insuranceInfo = insuranceRequest.getInsuranceInfo();
        System.out.println("Insurance Information: Coverage Option : " + insuranceInfo.getCoverageOption());
        System.out.println("Insurance Information: Coverage Type : " + insuranceInfo.getCoverageType());
        System.out.println("Insurance Information: Product : " + insuranceInfo.getProduct());
    }

    @Override
    public void processInsuranceApplication(InsuranceApplication insuranceRequest) {
        System.out.println("Insurance Application: " + insuranceRequest);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(calendar.getTime());
        System.out.println(formattedDate);
    }
}
