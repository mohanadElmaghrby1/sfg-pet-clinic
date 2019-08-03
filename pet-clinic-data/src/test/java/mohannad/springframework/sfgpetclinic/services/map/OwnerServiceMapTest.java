package mohannad.springframework.sfgpetclinic.services.map;

import mohannad.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long ownerId=1L;

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap() , new PetServiceMap());
        Owner owner = new Owner();
        owner.setId(ownerId);
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner>owners = ownerServiceMap.findAll();
        assertEquals(1 ,owners.size());

    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId , owner.getId());
    }

    @Test
    void findByLastName() {
    }
}