package tn.esprit.gestionmagasin.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Facture implements Serializable{
private static final long serialVersionUID= 6;
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	@Temporal(TemporalType.DATE)
	private  Date dateFacture;
	private float montantFacture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public float getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Facture() {
		
	}
	
	public Facture(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Facture(int id, String libelle, Date dateFacture, float montantFacture) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.dateFacture = dateFacture;
		this.montantFacture = montantFacture;
	}
	
	
	
	

}
