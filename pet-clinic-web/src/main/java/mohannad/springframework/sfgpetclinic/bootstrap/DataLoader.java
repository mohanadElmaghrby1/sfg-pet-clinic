package mohannad.springframework.sfgpetclinic.bootstrap;

import mohannad.springframework.sfgpetclinic.model.Owner;
import mohannad.springframework.sfgpetclinic.model.Pet;
import mohannad.springframework.sfgpetclinic.model.PetType;
import mohannad.springframework.sfgpetclinic.model.Vet;
import mohannad.springframework.sfgpetclinic.services.OwnerService;
import mohannad.springframework.sfgpetclinic.services.PetTypeService;
import mohannad.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(dog);


        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("mohannad");
        owner1.setLastName("elmaghrby");
        owner1.setAddress("Kom Hamada");
        owner1.setCity("behyera");
        owner1.setTelphone("01014152062");

        Pet mikesPet =new Pet();
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("omar");
        owner2.setLastName("abdo");
        owner1.setAddress("zmran");
        owner1.setCity("alex");
        owner1.setTelphone("01005087893");

        Pet fionasCat =new Pet();
        fionasCat.setPetType(saveCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("soso");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners .....");
        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("abdelazziz");
        vet1.setLastName("ammar");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("abdo");
        vet2.setLastName("elewa");

        vetService.save(vet2);

        System.out.println("Loaded Vets .....");

    }
}
