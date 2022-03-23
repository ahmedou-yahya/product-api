package mr.produit.service;

import lombok.AllArgsConstructor;
import mr.produit.dto.ProduitDto;
import mr.produit.entity.ProduitEntity;
import mr.produit.mapper.ProduitMapper;
import mr.produit.model.Categorie;
import mr.produit.model.Marque;
import mr.produit.model.Produit;
import mr.produit.model.Vendeur;
import mr.produit.repository.ProduitRepository;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class ProduitService {

    private final ProduitRepository produitRepository;
    private final ProduitMapper produitMapper;

    public Produit saveProduit(Produit produit){
        ProduitDto produitDto = produitMapper.produitToDto(produit);
        if(Objects.isNull(produitDto)){
            return null;
        }

        ProduitEntity produitEntity = ProduitEntity.builder()
                .data(produitDto).build();
        ProduitDto produitSaved = produitRepository.save(produitEntity).getData();

        return produitMapper.dtoToProduit(produitSaved);

    }
    public List<Produit> getProduits(){
       List<ProduitEntity> produitEntities = produitRepository.findAll();
        return produitEntities.stream().map(ProduitEntity::getData)
                .map(produitMapper::dtoToProduit)
                .collect(Collectors.toList());
    }

    public Produit getProduit(Long id){
        return produitRepository.findById(id)
                .map(produitEntity -> produitEntity.getData())
                .map(produitDto -> produitMapper.dtoToProduit(produitDto))
                .orElse(Produit.builder().build());
    }

    public List<Produit> getProduitsDisponibles(){
        return null;
    }


   public List<Produit> getProduitsParVendeur(Integer idVendeur){

        List<ProduitEntity> produitEntities = produitRepository.findAll();
        return produitEntities.stream()
               .map(ProduitEntity::getData)
               .map(produitMapper::dtoToProduit)
               .filter(produit -> produit.getVendeur().getId().equals(idVendeur))
               .collect(Collectors.toList());
    }


    public List<Produit> getProduitsParMarque(Marque marque){
        return null;
    }

   public List<Produit> getProduitsParCategorie(Categorie categorie){
        return null;
    }
   public Produit getProduitParCodeBarre(String codeBarre){
        return null;
    }
}
