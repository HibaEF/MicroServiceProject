package tn.esprit.GestionMagasin.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;



@Entity




public class Produit implements Serializable {
	@Id
	@GeneratedValue
    private Integer idProduit;
	private String code;
	private String libelle;
	private String picture;
	private String description;
	private Long nbrLike;
	private float prixUnitaire;
	public Integer getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getNbrLike() {
		return nbrLike;
	}
	public void setNbrLike(Long nbrLike) {
		this.nbrLike = nbrLike;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Produit(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String code, String libelle, String picture, String description, Long nbrLike, float prixUnitaire) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.picture = picture;
		this.description = description;
		this.nbrLike = nbrLike;
		this.prixUnitaire = prixUnitaire;
	}
	
	
	

}
