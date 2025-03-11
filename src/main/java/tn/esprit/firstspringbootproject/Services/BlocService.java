package tn.esprit.firstspringbootproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.Entities.Bloc;
import tn.esprit.firstspringbootproject.Entities.Chambre;
import tn.esprit.firstspringbootproject.Repository.IBlocRepository;
import tn.esprit.firstspringbootproject.Repository.IChambreRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService{

    @Autowired
    IBlocRepository blocRepository;
    @Autowired
    IChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>)blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
         blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambres, long idBloc) {

        Bloc bloc = blocRepository.findById(idBloc).orElse(null);

            List<Chambre> chambres = chambreRepository.findByNumeroChambreIn(numChambres);

            if (chambres.isEmpty()) {
                throw new RuntimeException("Aucune chambre trouvée avec les numéros fournis.");
            }

            for (Chambre chambre : chambres) {
                chambre.setBloc(bloc);
            }

            chambreRepository.saveAll(chambres);

            Set<Chambre> updatedChambres = chambres.stream().collect(Collectors.toSet());
            bloc.setChambres(updatedChambres);

            return blocRepository.save(bloc);
        }
    }

