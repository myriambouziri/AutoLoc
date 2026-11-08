package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.Repositories.ReservationRepository;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
    ContratRepository contratRepository;
    ClientRepository clientRepository;
    @Override
    public Reservation AddReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);

    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> FindAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation FindByid(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public Reservation affecterContratAReservation(Long idContrat, Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        Contrat contrat = contratRepository.findById(idContrat).get();
        reservation.setContrat(contrat);
        return reservationRepository.save(reservation);

    }

    @Override
    public void desaffecterContratDeReservation(Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        reservation.setContrat(null);
         reservationRepository.save(reservation);
    }

    @Override
    public Reservation affecterClientAReservation(Long idClient, Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        Client client = clientRepository.findById(idClient).get();
        reservation.setClient(client);
        return reservationRepository.save(reservation);
    }
}
