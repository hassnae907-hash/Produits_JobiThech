package com.gt.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gt.produits.entities.Produit;
import com.gt.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    // ==================== CREATE ====================
    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("PC Dell", 2200.500, new Date());
        produitRepository.save(prod);
        System.out.println("Produit ajouté : " + prod);
    }

    // ==================== READ ONE ====================
    @Test
    public void testFindProduit() {
        Produit p = produitRepository.findById(1L).get();
        System.out.println(p);
    }

    // ==================== UPDATE ====================
    @Test
    public void testUpdateProduit() {
        Produit p = produitRepository.findById(1L).get();
        p.setPrixProduit(1000.0);
        produitRepository.save(p);
        System.out.println("Produit mis à jour : " + p);
    }

    // ==================== DELETE ====================
    @Test
    public void testDeleteProduit() {
        produitRepository.deleteById(1L);
        System.out.println("Produit supprimé avec id=1");
    }

    // ==================== READ ALL ====================
    @Test
    public void testListerTousProduits() {
        List<Produit> prods = produitRepository.findAll();
        for (Produit p : prods) {
            System.out.println(p);
        }
    }

}
