package com.portailRH.demandeConge.Service;

import com.portailRH.demandeConge.Entity.DemandeConge;

import java.util.List;
import java.util.Optional;

public interface DemandeService {
    List<DemandeConge> findAllDemandes();
    Optional<DemandeConge> findById(Long id);
    DemandeConge saveDemande(DemandeConge demandeConge);
    DemandeConge updateDemande(DemandeConge demandeConge);
    void deletedemande(Long id);
}
