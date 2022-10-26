package tn.esprit.GestionMagasin.entities;


import tn.esprit.GestionMagasin.entities.CategorieProduit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity




public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="idDetailProduit")
    private Long idDetailProduit;
    
    private Date dateDerniereModification;

    private Date dateCreation;
    
    private CategorieProduit CategorieProduit;

	public Long getIdDetailProduit() {
		return idDetailProduit;
	}

	public void setIdDetailProduit(Long idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public CategorieProduit getCategorieProduit() {
		return CategorieProduit;
	}

	public void setCategorieProduit(CategorieProduit categorieProduit) {
		CategorieProduit = categorieProduit;
	}

	public DetailProduit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetailProduit(Date dateDerniereModification, Date dateCreation,
			tn.esprit.GestionMagasin.entities.CategorieProduit categorieProduit) {
		super();
		this.dateDerniereModification = dateDerniereModification;
		this.dateCreation = dateCreation;
		CategorieProduit = categorieProduit;
	}

	public DetailProduit(Date dateCreation) {
		super();
		this.dateCreation = dateCreation;
	}

}
