/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ums.eg.fue.cs.users;
import java.util.ArrayList ; 
import ums.eg.fue.cs.jobs.job;


/**
 *
 * @author Administrator
 */
public class user extends job{
    private String age , address,i,s  ; 

    public user()
    {
        age = "" ; 
        address = "" ; 
        i = "" ; 
        s = "" ; 
      
    }

    public user(String age, String address) {
        this.age = age;
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setI(String i) {
        this.i = i;
        ArrayList<String> inbox = new ArrayList <String>() ;
        inbox.add(i);
    }

    public void setS(String s) {
        this.s = s;
        ArrayList<String> sent = new ArrayList <String>() ;
        sent.add(s);
    }

    
    
    
    
    
    
    
    
    public String getI() {
        return i ;
    }

    public String getS() {
        return s;
    }
    
      public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

   