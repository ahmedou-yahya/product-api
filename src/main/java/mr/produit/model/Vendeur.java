package mr.produit.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vendeur {
    Integer id;
    String nom;
    String logo;
    String site;
}
