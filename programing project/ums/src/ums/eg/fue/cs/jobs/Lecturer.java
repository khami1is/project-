/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ums.eg.fue.cs.jobs;

/**
 *
 * @author Administrator
 */
public class Lecturer extends mainSys {
    private int noOfExperienceYears ; 
    
    public Lecturer()
    {
    noOfExperienceYears = 0 ; 
    }

    public Lecturer(int noOfExperienceYears) {
        this.noOfExperienceYears = noOfExperienceYears;
    }

    public void setNoOfExperienceYears(int noOfExperienceYears) {
        this.noOfExperienceYears = noOfExperienceYears;
    }

    public int getNoOfExperienceYears() {
        return noOfExperienceYears;
    }
    
    
   
}
