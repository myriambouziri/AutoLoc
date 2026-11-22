package tn.esprit.autoloc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratDTO {
    private LocalDate dateSign;      // 'dateSignature' renommé pour l'API
    private BigDecimal montantTotal;
    private Boolean valide;
}