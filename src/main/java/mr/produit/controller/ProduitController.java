package mr.produit.controller;

import lombok.AllArgsConstructor;
import mr.produit.model.Produit;
import mr.produit.service.ProduitService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@AllArgsConstructor
@RestController

public class ProduitController {

    private final ProduitService produitService;
    @GetMapping("/produits")
    public List<Produit> getProduits() {
        return produitService.getProduits();
    }

    @GetMapping("/produits/vendeur/{idVendeur}")
    public List<Produit> getProduitsParVendeur(
            @PathVariable final Integer idVendeur) {
        return produitService.getProduitsParVendeur(idVendeur);
    }

    @GetMapping("/produits/{idProduit}")
    public Produit getProduit( @PathVariable final Long idProduit) {
        return produitService.getProduit(idProduit);
    }

    @PostMapping("/produit/save")
    public Produit saveProduit(@RequestBody final  Produit produit) {
        return produitService.saveProduit(produit);
    }
}
