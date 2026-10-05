package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat AddContrat (Contrat contrat);
    Contrat UpdateContrat (Contrat contrat);
    void deleteContrat(Long idContrat);
    List<Contrat> FindAll();
}
