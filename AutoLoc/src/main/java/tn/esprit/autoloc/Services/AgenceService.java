package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService{
    AgenceRepository agenceRepository;
    @Override
    public Agence AddAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence UpdateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);

    }

    @Override
    public List<Agence> FindAll() {
        return agenceRepository.findAll();
    }
}
