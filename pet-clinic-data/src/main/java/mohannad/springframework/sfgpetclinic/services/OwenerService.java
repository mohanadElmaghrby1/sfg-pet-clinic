package mohannad.springframework.sfgpetclinic.services;

import mohannad.springframework.sfgpetclinic.model.Owner;

public interface OwenerService extends CrudService<Owner , Long> {

    Owner findByLastName(String lastName);

}
