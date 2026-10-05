package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EquipementRepository;
import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements  IEquipementService{
    EquipementRepository equipementRepository;
    @Override
    public Equipement AddEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement UpdateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> FindAll() {
        return equipementRepository.findAll();
    }
}
