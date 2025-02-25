package tn.esprit.firstspringbootproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.Entities.Reservation;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,String> {
}
