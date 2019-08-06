package mohannad.springframework.sfgpetclinic.services.map;

import mohannad.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long ownerId=1L;
    final String lastNAme="noon";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap() , new PetServiceMap());
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastNAme);
        //ave one owner
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner>owners = ownerServiceMap.findAll();
        assertEquals(1 ,owners.size());

    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0 , ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0 , ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner = new Owner();
        owner.setId(ownerId);
        //save existance owner
        ownerServiceMap.save(owner);
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId , owner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerServiceMap.findByLastName(lastNAme);
        assertEquals(lastNAme ,owner.getLastName());
    }
}