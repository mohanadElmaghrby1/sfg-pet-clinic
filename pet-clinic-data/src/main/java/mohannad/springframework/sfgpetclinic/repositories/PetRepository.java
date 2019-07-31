package mohannad.springframework.sfgpetclinic.repositories;

import mohannad.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * created by mohannad  on 29/07/19
 */
public interface PetRepository extends CrudRepository<Pet , Long> {
}
