package com.example.realtimemessaging.ui.home;

public class Reclamation {

    private String nomClient;
    private String prenomClient;
    private String reclamation;

    public Reclamation(String nomClient, String prenomClient, String reclamation) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.reclamation = reclamation;
    }

    public Reclamation() {
    }

    @Override
    public String toString() {
        return "Reclamation{" +
                "nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", reclamation='" + reclamation + '\'' +
                '}';
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public String getReclamation() {
        return reclamation;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public void setReclamation(String reclamation) {
        this.reclamation = reclamation;
    }
}
