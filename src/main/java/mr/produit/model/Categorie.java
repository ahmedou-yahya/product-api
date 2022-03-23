package mr.produit.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Categorie {
    Integer id;
    String libelle;
    String description;
}
