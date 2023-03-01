package com.portailRH.demandeConge.Service;

import com.portailRH.demandeConge.Entity.DemandeConge;
import com.portailRH.demandeConge.Repository.DemandeCongeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeCongeService implements DemandeService{
    private final DemandeCongeRepository repos;

    public DemandeCongeService(DemandeCongeRepository repos) {
        this.repos = repos;
    }

    @Override
    public List<DemandeConge> findAllDemandes() {
        return repos.findAll();
    }

    @Override
    public Optional<DemandeConge> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public DemandeConge saveDemande(DemandeConge demandeConge) {
        return repos.save(demandeConge);
    }

    @Override
    public DemandeConge updateDemande(DemandeConge demandeConge) {
        return repos.save(demandeConge);

    }

    @Override
    public void deletedemande(Long id) {
        repos.deleteById(id);
    }
}

