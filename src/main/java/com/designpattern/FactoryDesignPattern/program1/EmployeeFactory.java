package com.designpattern.FactoryDesignPattern.program1;

public class EmployeeFactory {

    //get the emplooyee

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
