package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface IAgenceService {
    Agence AddAgence (Agence agence);
    Agence UpdateAgence (Agence agence);
    void deleteAgence(Long idAgence);
    List<Agence> FindAll();
    Agence FindByid(Long idAgence);

}
