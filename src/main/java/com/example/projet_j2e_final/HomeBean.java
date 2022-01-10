package com.example.projet_j2e_final;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HomeBean {
    String Login;
    private String Ville;


    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String login() {
        return "Login";
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        this.Ville = ville;
    }


}
