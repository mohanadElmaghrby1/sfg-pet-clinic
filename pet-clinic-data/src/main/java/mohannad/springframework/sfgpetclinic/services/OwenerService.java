package mohannad.springframework.sfgpetclinic.services;

import mohannad.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwenerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
