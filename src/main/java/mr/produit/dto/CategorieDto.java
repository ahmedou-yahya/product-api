package mr.produit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDto {

    Integer id;
    String libelle;
    String description;
}
