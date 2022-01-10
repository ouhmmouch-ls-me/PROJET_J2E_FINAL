package com.example.projet_j2e_final;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ReserveHotelBean {
    String[] nomHotels = {"Wazo Hotel","Taghazout Bay Apartment","La maison de Tanger","Riad Sidrat Fes"};

    String[] optionsMarrakech = {"2 Personnes adultes","4 personnes adultes","3 personnes adultes","2 personnes adultes + 1 enfant","2 personnes adultes","2 personnes adultes + 1 enfant"};
    String[] optionsAgadir = {"4 Personnes adultes + 2 enfants", "2 Personnes adultes + 3 enfants", "2 Personnes adultes + 2 enfants"};
    String[] optionsTanger = {"2 Personnes adultes","4 personnes adultes","3 personnes adultes","2 personnes adultes + 1 enfant","2 personnes adultes + 1 enfant","2 personnes adultes + 1 enfant"};
    String[] optionsFes = {"2 Personnes adultes","4 personnes adultes","1 personnes adulte","2 personnes adultes + 1 enfant","2 personnes adultes","2 personnes adultes + 1 enfant"};

    int[] tarifMarrakech = {150,160,170,180,190,200};
    int[] tarifAgadir = {200,230,250};
    int[] tarifTanger = {160,170,200,240,250,260};
    int[] tarifFes = {100,120,140,160,180,200};

    int nbChambre, choixOption;

    public int getChoixOption() {
        return choixOption;
    }

    public void setChoixOption(int choixOption) {
        this.choixOption = choixOption;
    }

    public int getNbChambre() {
        return nbChambre;
    }

    public void setNbChambre(int nbChambre) {
        this.nbChambre = nbChambre;
    }

    public String[] getNomHotels() {
        return nomHotels;
    }

    public void setNomHotels(String[] nomHotels) {
        this.nomHotels = nomHotels;
    }

    public String[] getOptionsMarrakech() {
        return optionsMarrakech;
    }

    public void setOptionsMarrakech(String[] optionsMarrakech) {
        this.optionsMarrakech = optionsMarrakech;
    }

    public String[] getOptionsAgadir() {
        return optionsAgadir;
    }

    public void setOptionsAgadir(String[] optionsAgadir) {
        this.optionsAgadir = optionsAgadir;
    }

    public String[] getOptionsTanger() {
        return optionsTanger;
    }

    public void setOptionsTanger(String[] optionsTanger) {
        this.optionsTanger = optionsTanger;
    }

    public String[] getOptionsFes() {
        return optionsFes;
    }

    public void setOptionsFes(String[] optionsFes) {
        this.optionsFes = optionsFes;
    }

    public int[] getTarifMarrakech() {
        return tarifMarrakech;
    }

    public void setTarifMarrakech(int[] tarifMarrakech) {
        this.tarifMarrakech = tarifMarrakech;
    }

    public int[] getTarifAgadir() {
        return tarifAgadir;
    }

    public void setTarifAgadir(int[] tarifAgadir) {
        this.tarifAgadir = tarifAgadir;
    }

    public int[] getTarifTanger() {
        return tarifTanger;
    }

    public void setTarifTanger(int[] tarifTanger) {
        this.tarifTanger = tarifTanger;
    }

    public int[] getTarifFes() {
        return tarifFes;
    }

    public void setTarifFes(int[] tarifFes) {
        this.tarifFes = tarifFes;
    }

    public String Option1(){
        choixOption = 1;
        return "Validation";
    }

    public String Option2(){
        choixOption = 2;
        return "Validation";
    }

    public String Option3(){
        choixOption = 3;
        return "Validation";
    }

    public String Option4(){
        choixOption = 4;
        return "Validation";
    }

    public String Option5(){
        choixOption = 5;
        return "Validation";

    }public String Option6(){
        choixOption = 6;
        return "Validation";
    }
}
