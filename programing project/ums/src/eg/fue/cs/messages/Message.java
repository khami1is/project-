/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.fue.cs.messages;

/**
 *
 * @author Administrator
 */
public class Message {
    private String body, subject ; 
    private String from , to ; 
    
    public Message()
    {
    body = "" ; 
    subject = "" ; 
    from = "" ; 
    to = "" ; 
    
    }
    
     public Message(String body, String subject, String from, String to) {
        this.body = body;
        this.subject = subject;
        this.from = from;
        this.to = to;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
     public String getSubject() {
        return subject;
    }
    public String getBody() {
        return body;
    }

   public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

   
    
    
}
