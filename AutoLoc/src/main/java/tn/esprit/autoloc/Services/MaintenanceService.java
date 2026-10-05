package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;
import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenaceService{
    MaintenanceRepository maintenanceRepository;
    @Override
    public Maintenance AddMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance UpdateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> FindAll() {
        return maintenanceRepository.findAll();
    }
}
