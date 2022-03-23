package mr.produit.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Marque {
    Integer id;
    String libelle;
    String logo;
    String site;
}
