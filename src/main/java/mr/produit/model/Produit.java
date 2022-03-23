package mr.produit.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Produit {
    Integer id;
    String sku;
    String codeBarre;
    String libelle;
    BigDecimal prix;
    BigDecimal prixBarre;
    List<String> images;
    String description;
    Categorie categorie;
    Vendeur vendeur;
    Boolean disponible;
    Integer stock;
    Marque marque;
    String nutriton;
}
