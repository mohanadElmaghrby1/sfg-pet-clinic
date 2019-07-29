package mohannad.springframework.sfgpetclinic.repositories;

import mohannad.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface OwnerRepository extends CrudRepository<Owner , Long> {
}
