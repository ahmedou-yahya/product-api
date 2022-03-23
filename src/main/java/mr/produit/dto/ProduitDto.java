package mr.produit.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ProduitDto {
    Integer id;
    String sku;
    String codeBarre;
    String libelle;
    BigDecimal prix;
    BigDecimal prixBarre;
    List<String> images;
    String description;
    CategorieDto categorie;
    VendeurDto vendeur;
    Boolean disponible;
    Integer stock;
    MarqueDto marque;
}
