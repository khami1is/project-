/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ums.eg.fue.cs.jobs;

/**
 *
 * @author Administrator
 */
public class mainSys {
    private String name , description , faculty , departement ; 

    public mainSys() {
        
    }

    public mainSys(String name, String description, String faculty, String departement) {
        this.name = name;
        this.description = description;
        this.faculty = faculty;
        this.departement = departement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    
    
    
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDepartement() {
        return departement;
    }
    
    
    
   
}
