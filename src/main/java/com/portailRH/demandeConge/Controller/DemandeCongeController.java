package com.portailRH.demandeConge.Controller;

import com.portailRH.demandeConge.Entity.DemandeConge;
import com.portailRH.demandeConge.Service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/DemandeConge")
public class DemandeCongeController {


    @Autowired
    private DemandeService demandeService;

    public DemandeCongeController(DemandeService demandeService) {
        this.demandeService = demandeService;
    }

    @GetMapping
    public List<DemandeConge> findAllDemandes() {
        return demandeService.findAllDemandes();
    }
    @GetMapping("/{id}")
    public Optional<DemandeConge> findById(@PathVariable("id") Long id){
        return 	demandeService.findById( id);
    }

    @PostMapping
    public DemandeConge savedemande(@RequestBody DemandeConge demandeConge) {
        // TODO Auto-generated method stub
        return demandeService.saveDemande(demandeConge);
    }
    @PutMapping
    public DemandeConge updatedemande(@RequestBody DemandeConge demandeConge) {
        // TODO Auto-generated method stub
        return demandeService.updateDemande(demandeConge);

    }
    @DeleteMapping("/{id}")
    public void deletedemande(@PathVariable("id")Long id) {
        demandeService.deletedemande(id);
    }


}




