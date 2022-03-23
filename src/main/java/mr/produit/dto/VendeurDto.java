package mr.produit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendeurDto {
    Integer id;
    String nom;
    String logo;
    String site;
}
