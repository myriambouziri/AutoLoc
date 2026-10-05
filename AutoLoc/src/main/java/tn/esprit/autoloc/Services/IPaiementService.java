package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement AddPaiement (Paiement paiement);
    Paiement UpdatePaiement (Paiement paiement);
    void deletePaiement(Long idPaiement);
    List<Paiement> FindAll();
}
