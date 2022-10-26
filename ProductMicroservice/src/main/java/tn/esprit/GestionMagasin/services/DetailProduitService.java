package tn.esprit.GestionMagasin.services;


import java.util.List;
import java.util.Optional;

import tn.esprit.GestionMagasin.entities.DetailProduit;
public interface DetailProduitService {
	
	List<DetailProduit> retrieveAllDetailProduits();

	DetailProduit addDetailProduit(DetailProduit c);

	void deleteDetailProduit(Long id);
	DetailProduit updateDetailProduit(DetailProduit c);
	Optional<DetailProduit>  retrieveDetailProduit(Long id);


}
