package mohannad.springframework.sfgpetclinic.contollers;

import mohannad.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/owners")
@Controller
public class OwnerController  {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners" , "/owners/index" , "/owners/index.html"})
    public String getIndex(Model model){
        model.addAttribute("owners" , ownerService.findAll());
        return "owners/index";
    }
}
