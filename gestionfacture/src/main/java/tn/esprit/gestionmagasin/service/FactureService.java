package tn.esprit.gestionmagasin.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.gestionmagasin.entity.Facture;
import tn.esprit.gestionmagasin.repository.FactureRepository;

@Service
public class FactureService {
	@Autowired
private FactureRepository facturerepository;
	
	public Facture addFacture(Facture facture) {
		return facturerepository.save(facture);
		
	}
	
	public Facture getFacturebyId(int id) {
		return facturerepository.findById(id).isPresent() ? facturerepository.findById(id).get(): null;
		
	}
	
	public List<Facture> retrieveAllFactures(){
				return (List<Facture>)facturerepository.findAll();
			}

	public Facture updateFacture(int id,Facture facture) {
		if(facturerepository.findById(id).isPresent()) {
			Facture existingFacture=facturerepository.findById(id).get();
			existingFacture.setDateFacture(facture.getDateFacture());
			existingFacture.setLibelle(facture.getLibelle());
			existingFacture.setMontantFacture(facture.getMontantFacture());
			return facturerepository.save(existingFacture);
		}
		else 
			return null;
	}



public String deleteFacture(int id) {
	if(facturerepository.findById(id).isPresent()) {
		facturerepository.deleteById(id);
		return "facture est supprime";
	}
	else
		return "non supprimee";
}

}
