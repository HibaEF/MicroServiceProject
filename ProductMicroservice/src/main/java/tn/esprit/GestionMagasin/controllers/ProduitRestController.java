package tn.esprit.GestionMagasin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.GestionMagasin.Repositeries.ProduitRepository;
import tn.esprit.GestionMagasin.entities.Produit;
import tn.esprit.GestionMagasin.services.ProduitServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RequestMapping("/produit")
public class ProduitRestController {
	@Autowired
	ProduitServiceImpl p;
	@Autowired 
	ProduitRepository pr;
	
	public  ProduitRestController(ProduitServiceImpl p){
		this.p=p;
	}
	
	
	@GetMapping("/message")
	public String test() {
		return "hello";
	}
	
	
	
	
	
	
	
	// http://localhost:8089/SpringMVC/produit/retrieve-all-produits
	
			//@CrossOrigin(origins = "http://localhost:4200")
			@GetMapping("/retrieve-all-produits")
			@ResponseBody
			
			public List<Produit> getProduits() {
				List<Produit> listProduits = p.retrieveAllProduits();
				return listProduits;

			}

			
			
			
			
			
			//@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/addProduit")
	
		public Produit addProduit(@RequestBody Produit pp){
				Produit produit=p.addProduit(pp);
			return produit;
		}
			
			
		
			
			

		@PutMapping("/modifier_produit")
		@ResponseBody


		public Produit updateProduitC(@RequestBody Produit pp) {
			return p.updateProduit(pp);
		}
		



		// http://localhost:8089/SpringMVC/client/remove-client/{client-id}
		@DeleteMapping("/remove-produit/{produit-id}")
		@ResponseBody
		
		public void removeProduit(@PathVariable("produit-id") int produitId) {
			p.deleteProduit(produitId);
		}
		
		
		
		

//		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/getProduit/{produit-id}")
		@ResponseBody
	

		public Produit getProduit(@PathVariable("produit-id") int produitId) {
			return this.p.getProduitById(produitId);
		}
		
		
		@GetMapping("modifierLike/{idProduit}/{like}")
		@ResponseBody

		public Produit Liked(@PathVariable ("idProduit") int idProduit, boolean like) {
			
			return p.modifierLike(idProduit, like);
		}
		

}
