package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IEmployeService;
import tn.esprit.autoloc.entities.Employe;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employe")
public class EmployeController {
    private IEmployeService employeService;

    @PostMapping("/add-employe")
    public Employe AddEmploye(@RequestBody Employe employe) { return employeService.AddEmploye(employe); }

    @GetMapping("/Get-all")
    public List<Employe> FindAll() { return employeService.FindAll(); }

    @GetMapping("/Get-employe/{employe-id}")
    public Employe FindByid(@PathVariable("employe-id") Long employeId) { return employeService.FindByid(employeId); }

    @DeleteMapping("/delete-employe/{employe-id}")
    public void deleteEmploye(@PathVariable("employe-id") Long employeId) { employeService.deleteEmploye(employeId); }
}