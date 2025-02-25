package tn.esprit.firstspringbootproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstspringbootproject.Entities.Bloc;
import tn.esprit.firstspringbootproject.Repository.IBlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService{

    IBlocRepository blocRepository;
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
}
