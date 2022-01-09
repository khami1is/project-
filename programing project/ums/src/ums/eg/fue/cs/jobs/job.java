/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ums.eg.fue.cs.jobs;

/**
 *
 * @author Administrator
 */
public class job {
    private String name , description ; 
    
    public job () 
    {
    name = "" ; 
    description = "" ; 
   }
    
    public job (String n , String d )
    {
    name = n ; description = d ; 
    }
    
    public void setname (String n )
    {
    name = n ;
    }
    
    public void setdesc (String d )
    {
    description = d ;
    }
    
    public String getname()
    {
    return name ; 
    }
    public String getdesc()
    {
    return description ; 
    }
}