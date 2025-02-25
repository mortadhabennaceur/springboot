package tn.esprit.firstspringbootproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.Entities.Chambre;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {
}
