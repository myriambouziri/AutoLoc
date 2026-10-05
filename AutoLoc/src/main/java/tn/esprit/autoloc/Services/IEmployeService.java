package tn.esprit.autoloc.Services;


import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe AddEmploye (Employe employe);
    Employe UpdateEmploye (Employe employe);
    void deleteEmploye(Long idEmploye);
    List<Employe> FindAll();
}
