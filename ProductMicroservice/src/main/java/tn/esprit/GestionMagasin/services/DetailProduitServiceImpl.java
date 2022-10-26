package tn.esprit.GestionMagasin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.GestionMagasin.Repositeries.DetailProduitRepository;
import tn.esprit.GestionMagasin.entities.DetailProduit;
@Service
public class DetailProduitServiceImpl implements DetailProduitService {


private final DetailProduitRepository DPR;
	
	
	@Autowired
	public DetailProduitServiceImpl(DetailProduitRepository DPR) {
		this.DPR=DPR;
	}
	
	
	@Override
	public List<DetailProduit> retrieveAllDetailProduits() {
		// TODO Auto-generated method stub
		return (List<DetailProduit>)DPR.findAll();
	}

	

	
	

	@Override
	public DetailProduit updateDetailProduit(DetailProduit c) {
		// TODO Auto-generated method stub
		//DPR.updateDetailProduit(c.getIdDetailProduit(),c.getDateCreation(),c.getDateDerniereModification());
		DPR.save(c);
		return c;
	}

	

	@Override
	public DetailProduit addDetailProduit(DetailProduit c) {
		// TODO Auto-generated method stub
		DPR.save(c);
		return c;
	}




	@Override
	public Optional<DetailProduit> retrieveDetailProduit(Long id) {
		// TODO Auto-generated method stub
		return DPR.findById(id);
	}


	@Override
	public void deleteDetailProduit(Long id) {
		// TODO Auto-generated method stub
		DPR.deleteById(id);
	}
	
	
	
}
