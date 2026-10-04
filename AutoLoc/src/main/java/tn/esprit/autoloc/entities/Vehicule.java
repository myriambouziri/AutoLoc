package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.entities.enumerations.CategorieVehicule;
import tn.esprit.autoloc.entities.enumerations.StatutVehicule;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVehicule ;
    String immatriculation;
    String marque;
    String modele;
    CategorieVehicule categorie;
    BigDecimal tarifJournalier;
    StatutVehicule statut;
    @ManyToOne
    Agence agence;
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="vehicule")
    private Set<Reservation> Reservation;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipement> equipements;
}
