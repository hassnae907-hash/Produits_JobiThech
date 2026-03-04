package com.gt.produits.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;
    private Date dateProduit;

    // Constructeur par défaut
    public Produit() {
        super();
    }

    // Constructeur avec arguments (sans idProduit car auto-généré)
    public Produit(String nomProduit, Double prixProduit, Date dateProduit) {
        super();
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateProduit = dateProduit;
    }

    // Getters et Setters
    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public Date getDateProduit() {
        return dateProduit;
    }

    public void setDateProduit(Date dateProduit) {
        this.dateProduit = dateProduit;
    }

    // toString
    @Override
    public String toString() {
        return "Produit [idProduit=" + idProduit
                + ", nomProduit=" + nomProduit
                + ", prixProduit=" + prixProduit
                + ", dateProduit=" + dateProduit + "]";
    }

}
