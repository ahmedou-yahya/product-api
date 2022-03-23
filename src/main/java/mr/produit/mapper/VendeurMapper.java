package mr.produit.mapper;

import mr.produit.dto.VendeurDto;
import mr.produit.model.Vendeur;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class VendeurMapper {


    public Vendeur dtoToVendeur(VendeurDto vendeurDto){
        return Objects.isNull(vendeurDto) ? null :
                Vendeur.builder()
                .id(vendeurDto.getId())
                .nom(vendeurDto.getNom())
                .logo(vendeurDto.getLogo())
                .site(vendeurDto.getSite())
                .build();
    }

    public VendeurDto vendeurToDto(Vendeur vendeur){
        return Objects.isNull(vendeur) ? null :
                VendeurDto.builder()
                        .id(vendeur.getId())
                        .nom(vendeur.getNom())
                        .logo(vendeur.getLogo())
                        .site(vendeur.getSite())
                        .build();
    }
}
