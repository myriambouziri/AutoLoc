package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.entities.enumerations.CategorieVehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule AddVehicule (Vehicule vehicule);
    Vehicule UpdateVehicule (Vehicule vehicule);
    void deleteVehicule(Long idvehicule);
    List<Vehicule> FindAll();
    Vehicule FindByid(Long idvehicule);
    Vehicule affecterEquipementAVehicule(Long idEquipement, Long idVehicule);
    void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule);
    List<Vehicule> findByMarqueLike(String marque);
    List<Vehicule> findByCategorie(CategorieVehicule categorie);
    List<Vehicule> getVehiculesByAgence(Long idAgence);
}

