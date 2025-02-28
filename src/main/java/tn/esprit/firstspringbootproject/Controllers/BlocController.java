package tn.esprit.firstspringbootproject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspringbootproject.Entities.Bloc;
import tn.esprit.firstspringbootproject.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;

    @PostMapping("/add-bloc")
    public Bloc addbloc(@RequestBody Bloc bloc){
        return blocService.addBloc(bloc);
    }
    @PutMapping("/update-bloc")
    public Bloc updatebloc(@RequestBody Bloc bloc){
        return blocService.updateBloc(bloc);
    }

    @GetMapping("/display-bloc")
    public List<Bloc> displaybloc() {
        return blocService.retrieveBlocs();
    }

    @GetMapping("/display-blocbyid/{id}")
    public Bloc displayblocbyid(@PathVariable("id") long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("/delete-bloc/{id}")
    public void deletebloc(@PathVariable("id") long idBloc) {
        blocService.removeBloc(idBloc);
    }

}
