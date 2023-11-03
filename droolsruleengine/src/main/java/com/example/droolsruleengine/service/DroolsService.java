package com.example.droolsruleengine.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.droolsruleengine.model.Participant;
import com.example.droolsruleengine.model.Rate;

@Service
public class DroolsService {
 
 @Autowired
    private KieContainer kieContainer;
 
  public Rate getRate(Participant applicantRequest) {
    Rate rate = new Rate();
         KieSession kieSession = kieContainer.newKieSession();
         kieSession.setGlobal("rate", rate);
         kieSession.insert(applicantRequest);
         kieSession.fireAllRules();
         kieSession.dispose();
         return rate;
     }

}