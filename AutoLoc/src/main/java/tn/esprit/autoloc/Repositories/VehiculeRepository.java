package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.entities.enumerations.CategorieVehicule;

import java.util.List;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    List<Vehicule> findByMarqueLike(String marque);
    List<Vehicule> findByCategorie(CategorieVehicule categorie);
    @Query("SELECT v FROM Vehicule v WHERE v.agence.idAgence = :idAgence")
    List<Vehicule> getVehiculesByAgence(@Param("idAgence") Long idAgence);}