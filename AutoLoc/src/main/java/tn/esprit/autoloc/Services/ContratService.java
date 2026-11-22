package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.Repositories.PaiementRepository;
import tn.esprit.autoloc.dto.ContratDTO;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.mapper.ContratMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRepository contratRepository;
    PaiementRepository paiementRepository;
    ContratMapper contratMapper;
    @Override
    public Contrat AddContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat UpdateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);

    }

    @Override
    public List<ContratDTO> FindAll() {
        return contratRepository.findAll().stream()
                .map(contratMapper::toDto)
                .toList();
    }

    @Override
    public ContratDTO FindByid(Long idContrat) {
        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() -> new RuntimeException("Contrat non trouvé"));
        return contratMapper.toDto(contrat);
    }
    @Override
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Paiement paiement = paiementRepository.findById(idPaiement).get();
        Contrat contrat = contratRepository.findById(idContrat).get();
        paiement.setContrat(contrat);
        paiementRepository.save(paiement);
    }
}
