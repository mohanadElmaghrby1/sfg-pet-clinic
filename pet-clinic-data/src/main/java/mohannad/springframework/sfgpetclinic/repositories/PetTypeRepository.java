package mohannad.springframework.sfgpetclinic.repositories;

import mohannad.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * created by mohannad  on 29/07/19
 */
public interface PetTypeRepository extends CrudRepository<PetType , Long> {
}
