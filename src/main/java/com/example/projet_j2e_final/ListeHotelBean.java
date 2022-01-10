package com.example.projet_j2e_final;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ListeHotelBean {
    int choixVille;

    public int getChoixVille() {
        return choixVille;
    }

    public void setChoixVille(int choixVille) {
        this.choixVille = choixVille;
    }

    public String Marrakech(){
        choixVille = 1;
        return "HotelMarrakech";
    }

    public String Agadir(){
        choixVille = 2;
        return "HotelAgadir";
    }

    public String Tanger(){
        choixVille = 3;
        return "HotelTanger";
    }

    public String Fes(){
        choixVille = 4;
        return "HotelFes";
    }
}
