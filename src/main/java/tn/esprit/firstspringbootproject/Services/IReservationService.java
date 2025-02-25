package tn.esprit.firstspringbootproject.Services;

import tn.esprit.firstspringbootproject.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);

}
