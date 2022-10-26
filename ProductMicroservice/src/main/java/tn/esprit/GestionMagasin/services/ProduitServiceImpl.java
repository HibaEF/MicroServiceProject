package tn.esprit.GestionMagasin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import tn.esprit.GestionMagasin.Repositeries.ProduitRepository;
import tn.esprit.GestionMagasin.entities.Produit;

@Service
public class ProduitServiceImpl implements ProduitService {
	 @Autowired
	 ProduitRepository produitRepository;

	    
		@Override
	    public Produit getProduitById(int id) {
	        return  produitRepository.findById(id).get();
	    }
		@Override
		public List<Produit> retrieveAllProduits(){
			return (List<Produit>)produitRepository.findAll();
		}






	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(int idProduit) {
		produitRepository.deleteById(idProduit);
	}
	
	@Override
	public Produit addProduit(Produit produit) {
		// TODO Auto-generated method stub
	produitRepository.save(produit);
	return produit;
	}


	@Override
	public Produit modifierLike(int idProduit, boolean like) {
		// TODO Auto-generated method stub
		Produit p=this.produitRepository.findById(idProduit).get();
		if (like)
			p.setNbrLike(p.getNbrLike()+1);
		else
			p.setNbrLike(p.getNbrLike()-1);
		return this.produitRepository.save(p);		
	}
}
