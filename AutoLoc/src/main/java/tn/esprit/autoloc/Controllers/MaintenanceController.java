package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IMaintenaceService;
import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenance")
public class MaintenanceController {
    private IMaintenaceService maintenanceService;

    @PostMapping("/add-maintenance")
    public Maintenance AddMaintenance(@RequestBody Maintenance maintenance) { return maintenanceService.AddMaintenance(maintenance); }

    @GetMapping("/Get-all")
    public List<Maintenance> FindAll() { return maintenanceService.FindAll(); }

    @GetMapping("/Get-maintenance/{maintenance-id}")
    public Maintenance FindByid(@PathVariable("maintenance-id") Long maintenanceId) { return maintenanceService.FindByid(maintenanceId); }

    @DeleteMapping("/delete-maintenance/{maintenance-id}")
    public void deleteMaintenance(@PathVariable("maintenance-id") Long maintenanceId) { maintenanceService.deleteMaintenance(maintenanceId); }
}