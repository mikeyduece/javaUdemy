package com.company;

public class EFileWorkflow implements FilingWorkflow {

    @Override
    public void buildReturn(String klassName) {
        System.out.println(klassName + " Instance of build return called");
    }

}
