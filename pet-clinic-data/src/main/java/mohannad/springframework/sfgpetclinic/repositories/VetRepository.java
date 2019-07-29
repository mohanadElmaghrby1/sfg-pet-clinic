package mohannad.springframework.sfgpetclinic.repositories;

import mohannad.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * mohannad created on 29/07/19
 */
public interface VetRepository extends CrudRepository<Vet , Long> {
}
