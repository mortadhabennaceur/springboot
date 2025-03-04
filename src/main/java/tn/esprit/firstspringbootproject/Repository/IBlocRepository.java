package tn.esprit.firstspringbootproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.Entities.Bloc;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc,Long> {
}
;