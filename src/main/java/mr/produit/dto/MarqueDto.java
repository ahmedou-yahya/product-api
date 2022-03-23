package mr.produit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MarqueDto {
    Integer id;
    String libelle;
    String logo;
    String site;
}
