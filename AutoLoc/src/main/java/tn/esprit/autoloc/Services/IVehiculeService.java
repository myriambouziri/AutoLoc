package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule AddVehicule (Vehicule vehicule);
    Vehicule UpdateVehicule (Vehicule vehicule);
    void deleteVehicule(Long idvehicule);
    List<Vehicule> FindAll();
}
