package tn.esprit.firstspringbootproject.Services;

import tn.esprit.firstspringbootproject.Entities.Foyer;
import tn.esprit.firstspringbootproject.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);

    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;
    Universite desaffecterFoyerAUniversite (long idUniversite) ;
    Universite ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite);

}
