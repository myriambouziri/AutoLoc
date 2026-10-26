package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.Repositories.VehiculeRepository;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService{
    AgenceRepository agenceRepository;
    VehiculeRepository vehiculeRepository;
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

    @Override
    public Agence FindByid(Long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);

    }

    @Override
    public Agence affecterVehiculeAAgence(Long idAgence, Long idVehicule) {
        Agence agence = agenceRepository.findById(idAgence).get();
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        vehicule.setAgence(agence);
        vehiculeRepository.save(vehicule);
         return agence;

    }

    @Override
    public void desaffecterVehiculeDAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        vehicule.setAgence(null);
        vehiculeRepository.save(vehicule);
    }

}
