package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IReservationService;
import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {
    private IReservationService reservationService;

    @PostMapping("/add-reservation")
    public Reservation AddReservation(@RequestBody Reservation reservation) { return reservationService.AddReservation(reservation); }

    @GetMapping("/Get-all")
    public List<Reservation> FindAll() { return reservationService.FindAll(); }

    @GetMapping("/Get-reservation/{reservation-id}")
    public Reservation FindByid(@PathVariable("reservation-id") Long reservationId) { return reservationService.FindByid(reservationId); }

    @DeleteMapping("/delete-reservation/{reservation-id}")
    public void deleteReservation(@PathVariable("reservation-id") Long reservationId) { reservationService.deleteReservation(reservationId); }
}