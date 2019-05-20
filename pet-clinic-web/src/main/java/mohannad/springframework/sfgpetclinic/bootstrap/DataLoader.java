package mohannad.springframework.sfgpetclinic.bootstrap;

import mohannad.springframework.sfgpetclinic.model.Owner;
import mohannad.springframework.sfgpetclinic.model.Vet;
import mohannad.springframework.sfgpetclinic.services.OwenerService;
import mohannad.springframework.sfgpetclinic.services.VetService;
import mohannad.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import mohannad.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwenerService owenerService;
    private final VetService vetService;

    public DataLoader() {
        owenerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("mohannad");
        owner1.setLastName("elmaghrby");

        owenerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("omar");
        owner1.setLastName("abdo");

        owenerService.save(owner2);

        System.out.println("Loaded Owners .....");
        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("abdelazziz");
        vet1.setLastName("ammar");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(4L);
        vet1.setFirstName("abdo");
        vet1.setLastName("elewa");

        vetService.save(vet2);

        System.out.println("Loaded Vets .....");

    }
}