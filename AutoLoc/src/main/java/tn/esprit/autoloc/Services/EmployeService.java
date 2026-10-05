package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EmployeRepository;
import tn.esprit.autoloc.entities.Employe;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService{
    EmployeRepository employeRepository;
    @Override
    public Employe AddEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe UpdateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }

    @Override
    public List<Employe> FindAll() {
        return employeRepository.findAll();
    }
}
