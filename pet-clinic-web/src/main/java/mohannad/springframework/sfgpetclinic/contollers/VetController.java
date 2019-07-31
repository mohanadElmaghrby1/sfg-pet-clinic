package mohannad.springframework.sfgpetclinic.contollers;

import mohannad.springframework.sfgpetclinic.model.Vet;
import mohannad.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class VetController  {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets" , "/vets/index" , "/vets/index.html"})
    public String getIndex(Model model){
        Set<Vet> vets = vetService.findAll();
        model.addAttribute("vets" , vets);
        return "vets/index";
    }
}
