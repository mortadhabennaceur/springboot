package tn.esprit.firstspringbootproject.Controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.Entities.Chambre;
import tn.esprit.firstspringbootproject.Entities.TypeChambre;
import tn.esprit.firstspringbootproject.Services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    IChambreService chambreService;

    @PostMapping("/add-chambre")
    public Chambre addchambre(@RequestBody Chambre c){
       return chambreService.addChambre(c);
    }
    @PutMapping("/update-chambre")
    public Chambre updatechambre(@RequestBody Chambre c){
        return chambreService.updateChambre(c);
    }
    @GetMapping("/display-chambre")
    public List<Chambre> dispalychambres(){
        return chambreService.retrieveAllChambres();
    }
    @GetMapping("/display-chambrebyid/{id}")
    public Chambre displaychambrebyid(@PathVariable("id") long idChambre){
        return chambreService.retrieveChambre(idChambre);
    }

    @GetMapping("/chambres-non-reservees/{nomUniversite}/{typeChambre}")
    public List<Chambre> getChambresNonReservees(@PathVariable String nomUniversite, @PathVariable TypeChambre typeChambre) {
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, typeChambre);
    }
    @GetMapping("/chambres-par-bloc/{idBloc}/{typeChambre}")
    public List<Chambre> getChambresParBloc(@PathVariable long idBloc, @PathVariable TypeChambre typeChambre) {
        return chambreService.getChambresParBlocEtType(idBloc, typeChambre);
    }
}
