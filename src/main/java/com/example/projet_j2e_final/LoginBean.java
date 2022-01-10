package com.example.projet_j2e_final;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import static org.apache.myfaces.shared.util.MessageUtils.addMessage;

@ManagedBean
public class LoginBean {
    String UserName;
    private String Password;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String LoginState() {
        if(UserName.equals("BAITAR-OUHMMOUCH") && Password.equals("azerty123")){
            return "HomePage";
        }
        else
            return "Login";
    }

}
