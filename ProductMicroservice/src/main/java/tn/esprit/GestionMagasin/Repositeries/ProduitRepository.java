package tn.esprit.GestionMagasin.Repositeries;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import tn.esprit.GestionMagasin.entities.Produit;
@Repository

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
	@Query("select p from Produit p where p.libelle like :libelle")
    public Page<Produit> produitByLibelle(@Param("libelle") String mc
            , Pageable pageable);
	 
}
