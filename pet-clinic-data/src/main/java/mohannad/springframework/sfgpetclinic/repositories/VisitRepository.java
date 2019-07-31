package mohannad.springframework.sfgpetclinic.repositories;

import mohannad.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * created by mohannad  on 29/07/19
 */
public interface VisitRepository extends CrudRepository<Visit , Long> {
}
