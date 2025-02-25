package tn.esprit.firstspringbootproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.Entities.Universite;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
}
