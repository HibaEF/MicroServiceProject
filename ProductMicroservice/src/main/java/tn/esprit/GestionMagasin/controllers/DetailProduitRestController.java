package tn.esprit.GestionMagasin.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.GestionMagasin.entities.DetailProduit;
import tn.esprit.GestionMagasin.services.DetailProduitService;

@RestController
@RequestMapping("/detailproduit")
public class DetailProduitRestController {
	
	
	
	@Autowired
	DetailProduitService dp;
	

	// http://localhost:8089/SpringMVC/detail-produit/retrieve-all-detail-produit
		@GetMapping("/retrieve-all-details-produits")
		@ResponseBody
	
		public List<DetailProduit> getDetailProduit(){
			List<DetailProduit> listDetailProduit=dp.retrieveAllDetailProduits();
			return listDetailProduit;
		}
		
		// http://localhost:8089/SpringMVC/detail-produit/add-detail-produit
				@PostMapping("/add-detail-produit")
				@ResponseBody
				
				public DetailProduit addDetailProduit(@RequestBody DetailProduit d)
				{
					DetailProduit detprod = dp.addDetailProduit(d);
				return detprod;
				}
				// http://localhost:8089/SpringMVC/detail-produit/modify-detail-produit
				@PutMapping("/modify-detail-produit")
				@ResponseBody
		
				public DetailProduit modifyDetailProduit(@RequestBody DetailProduit d) {
				return dp.updateDetailProduit(d);
				}
				
				

}
