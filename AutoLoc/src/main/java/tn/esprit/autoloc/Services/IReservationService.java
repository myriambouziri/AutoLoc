package tn.esprit.autoloc.Services;


import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation AddReservation(Reservation reservation);
    Reservation UpdateReservation (Reservation reservation);
    void deleteReservation(Long idReservation);
    List<Reservation> FindAll();
}
