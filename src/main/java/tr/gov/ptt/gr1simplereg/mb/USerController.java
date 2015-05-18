/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr1simplereg.mb;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import tr.gov.ptt.gr1simplereg.dto.USer;

/**
 *
 * @author Administrator
 */
public class USerController {
    
    private  USer registrationUser;

    public USer getRegistrationUser() {
        return registrationUser;
    }

    public void setRegistrationUser(USer registrationUser) {
        this.registrationUser = registrationUser;
    }

    public USerController(USer registrationUser) {
        this.registrationUser = registrationUser;
    }
    
    
    public String register()
    {
                
       System.out.println("Registration User:"+this.registrationUser);
       
       String msg="User registered succesfully";
       
       FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
       
       FacesContext.getCurrentInstance().getExternalContext().
               getFlash().setKeepMessages(true);
       
       return "registration.jsf?faces-redirect=true";
       
    }
            
            
            
    
    
    
    
}
