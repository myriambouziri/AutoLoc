package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;

@Repository
public interface AgenceRepository extends JpaRepository <Agence, Long> {

    List<Agence> idAgence(Long idAgence);
}
