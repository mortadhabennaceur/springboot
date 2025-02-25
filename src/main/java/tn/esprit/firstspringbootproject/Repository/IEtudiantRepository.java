package tn.esprit.firstspringbootproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.Entities.Etudiant;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
}
