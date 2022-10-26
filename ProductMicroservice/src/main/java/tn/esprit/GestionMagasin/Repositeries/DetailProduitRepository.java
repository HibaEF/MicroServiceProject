package tn.esprit.GestionMagasin.Repositeries;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.GestionMagasin.entities.DetailProduit;
import tn.esprit.GestionMagasin.entities.Produit;

@Repository
public interface DetailProduitRepository extends JpaRepository<DetailProduit, Long>{
	@Query("select p from DetailProduit p where p.dateCreation like :dateCreation")
    public Page<DetailProduit> detailProduitBydateCreation(@Param("dateCreation") String mc
            , Pageable pageable);
}
