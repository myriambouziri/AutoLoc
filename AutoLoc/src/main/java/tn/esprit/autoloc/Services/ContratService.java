package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.Repositories.PaiementRepository;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRepository contratRepository;
    PaiementRepository paiementRepository;
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
    public List<Contrat> FindAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat FindByid(Long idContrat) {
        return contratRepository.findById(idContrat).orElse(null);
    }
    @Override
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Paiement paiement = paiementRepository.findById(idPaiement).get();
        Contrat contrat = contratRepository.findById(idContrat).get();
        paiement.setContrat(contrat);
        paiementRepository.save(paiement);
    }
}
