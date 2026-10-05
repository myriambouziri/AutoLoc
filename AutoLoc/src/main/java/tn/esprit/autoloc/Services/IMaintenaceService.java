package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenaceService {
    Maintenance AddMaintenance (Maintenance maintenance);
    Maintenance UpdateMaintenance (Maintenance maintenance);
    void deleteMaintenance(Long idMaintenance);
    List<Maintenance> FindAll();
}
