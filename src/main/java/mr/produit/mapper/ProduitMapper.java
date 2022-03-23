package mr.produit.mapper;

import lombok.AllArgsConstructor;
import mr.produit.dto.ProduitDto;
import mr.produit.model.Produit;

import org.springframework.stereotype.Component;

import java.util.Objects;

@AllArgsConstructor
@Component
public class ProduitMapper {

    private final CategorieMapper categorieMapper;
    private final VendeurMapper vendeurMapper;
    private final MarqueMapper marqueMapper;

   public Produit dtoToProduit(ProduitDto produitDto){
        return Objects.isNull(produitDto) ? null :
                Produit.builder()
                .id(produitDto.getId())
                .sku(produitDto.getSku())
                .codeBarre(produitDto.getCodeBarre())
                .libelle(produitDto.getLibelle())
                .prix(produitDto.getPrix())
                .images(produitDto.getImages())
                .description(produitDto.getDescription())
                .categorie(categorieMapper.dtoToCategorie(produitDto.getCategorie()))
                .vendeur(vendeurMapper.dtoToVendeur(produitDto.getVendeur()))
                .disponible(produitDto.getDisponible())
                .stock(produitDto.getStock())
                .marque(marqueMapper.dtoToMarque(produitDto.getMarque()))
                .build();
    }

    public ProduitDto produitToDto(Produit produit){
        return Objects.isNull(produit) ? null :
                ProduitDto.builder()
                        .id(produit.getId())
                        .sku(produit.getSku())
                        .codeBarre(produit.getCodeBarre())
                        .libelle(produit.getLibelle())
                        .prix(produit.getPrix())
                        .images(produit.getImages())
                        .description(produit.getDescription())
                        .categorie(categorieMapper.categorieToDto(produit.getCategorie()))
                        .vendeur(vendeurMapper.vendeurToDto(produit.getVendeur()))
                        .disponible(produit.getDisponible())
                        .stock(produit.getStock())
                        .marque(marqueMapper.marqueToDto(produit.getMarque()))
                        .build();
    }
}
