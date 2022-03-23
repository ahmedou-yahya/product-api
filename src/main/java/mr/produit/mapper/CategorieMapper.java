package mr.produit.mapper;

import mr.produit.dto.CategorieDto;
import mr.produit.model.Categorie;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CategorieMapper {

    Categorie dtoToCategorie(CategorieDto categorieDto){
         return Objects.isNull(categorieDto) ? null :
                 Categorie.builder()
                 .id(categorieDto.getId())
                 .libelle(categorieDto.getLibelle())
                 .description(categorieDto.getDescription())
                 .build();
    }

    CategorieDto categorieToDto(Categorie categorie){
        return Objects.isNull(categorie) ? null :
                CategorieDto.builder()
                        .id(categorie.getId())
                        .libelle(categorie.getLibelle())
                        .description(categorie.getDescription())
                        .build();
    }
}
