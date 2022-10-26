package tn.esprit.gestionmagasin.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.gestionmagasin.entity.Facture;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer>{
	
	

}
