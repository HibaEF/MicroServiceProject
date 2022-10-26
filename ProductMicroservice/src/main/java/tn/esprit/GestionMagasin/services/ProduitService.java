package tn.esprit.GestionMagasin.services;

import java.util.List;

import tn.esprit.GestionMagasin.entities.Produit;

public interface ProduitService {
	
	
	public Produit addProduit(Produit produit);

	Produit getProduitById(int id);

	List<Produit> retrieveAllProduits();
	public Produit updateProduit(Produit p);
	public void deleteProduit(int idProduit);
	public Produit modifierLike(int  idProduit,boolean like);
}
