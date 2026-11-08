package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EquipementRepository;
import tn.esprit.autoloc.Repositories.VehiculeRepository;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService{
    VehiculeRepository vehiculeRepository;
    EquipementRepository equipementRepository;
    @Override
    public Vehicule AddVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long idvehicule) {
        vehiculeRepository.deleteById(idvehicule);
    }

    @Override
    public List<Vehicule> FindAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule FindByid(Long idvehicule) {
        return vehiculeRepository.findById(idvehicule).orElse(null);
    }

    @Override
    public Vehicule affecterEquipementAVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        vehicule.getEquipements().add(equipement);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        vehicule.getEquipements().remove(equipement);
        vehiculeRepository.save(vehicule);
    }
}
