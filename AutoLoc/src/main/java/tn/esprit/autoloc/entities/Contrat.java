package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat ;
    LocalDate dateSignature;
    BigDecimal montantTotal;
    Boolean valide ;
    @OneToOne (mappedBy = "contrat")
    private Reservation reservation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contrat", orphanRemoval = true)
    private Set<Paiement> paiements;
}
