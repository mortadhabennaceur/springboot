package tn.esprit.firstspringbootproject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.Entities.Foyer;
import tn.esprit.firstspringbootproject.Services.FoyerService;
import tn.esprit.firstspringbootproject.Services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {

    @Autowired
    IFoyerService foyerService;

    @PostMapping("/add-foyer")
    public Foyer addfoyer(@RequestBody Foyer f){
        return foyerService.addFoyer(f);
    }

    @PutMapping("/update-foyer")
    public Foyer updatefoyer(@RequestBody Foyer f){
        return foyerService.updateFoyer(f);
    }

    @GetMapping("/display-foyer")
    public List<Foyer> displayfoyer(){
       return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/display-foyerbyid/{id}")
    public Foyer displayfoyerbyid(@PathVariable("id") long idFoyer){
        return foyerService.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("/delete-foyer/{id}")
    public void deletefoyer(@PathVariable("id") long idFoyer){
         foyerService.removeFoyer(idFoyer);
    }


}
