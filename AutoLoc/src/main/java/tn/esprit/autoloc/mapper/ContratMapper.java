package tn.esprit.autoloc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.autoloc.dto.ContratDTO;
import tn.esprit.autoloc.entities.Contrat;

@Mapper(componentModel = "spring")
public interface ContratMapper {

    @Mapping(target = "dateSign", source = "dateSignature")
    ContratDTO toDto(Contrat contrat);
}