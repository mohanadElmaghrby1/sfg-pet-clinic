package mohannad.springframework.sfgpetclinic.services.springdatajpa;

import mohannad.springframework.sfgpetclinic.model.Owner;
import mohannad.springframework.sfgpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) //used to use mocks in junit 5
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "noon";
    @Mock
    OwnerRepository ownerRepository;

//    @Mock
//    PetRepository petRepository;
//
//    @Mock
//    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;



    @BeforeEach
    void setUp() {

    }

    @Test
    void findByLastName() {
        Owner owner =new Owner();
        owner.setLastName(LAST_NAME);
        when(ownerRepository.findByLastName(any())).thenReturn(owner); // when mockito findByLastName with any arg called return nono

        Owner nono = ownerSDJpaService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, nono.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet=new HashSet<>();
        returnOwnerSet.add(new Owner());
        returnOwnerSet.add(new Owner());
        returnOwnerSet.add(new Owner());

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        assertEquals(3 , ownerSDJpaService.findAll().size());
    }

    @Test
    void findById() {
        Owner owner =new Owner();
        owner.setId(1L);

    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}