package mr.produit.mapper;

import mr.produit.dto.MarqueDto;
import mr.produit.model.Marque;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class MarqueMapper {

    public Marque dtoToMarque(MarqueDto marqueDto){
        return Objects.isNull(marqueDto) ? null :
                Marque.builder()
                .id(marqueDto.getId())
                .libelle(marqueDto.getLibelle())
                .logo(marqueDto.getLogo())
                .site(marqueDto.getSite())
                .build();
    }

    public MarqueDto marqueToDto(Marque marque){
        return Objects.isNull(marque) ? null :
                MarqueDto.builder()
                        .id(marque.getId())
                        .libelle(marque.getLibelle())
                        .logo(marque.getLogo())
                        .site(marque.getSite())
                        .build();

    }
}
