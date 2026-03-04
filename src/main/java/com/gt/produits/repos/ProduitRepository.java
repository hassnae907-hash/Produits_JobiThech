package com.gt.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gt.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
