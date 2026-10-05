package tn.esprit.autoloc.Services;


import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement AddEquipement (Equipement equipement);
    Equipement UpdateEquipement (Equipement equipement);
    void deleteEquipement(Long idEquipement);
    List<Equipement> FindAll();
}
