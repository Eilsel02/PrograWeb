package consulado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import consulado.entities.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>  {

}
