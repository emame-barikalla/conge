package com.portailRH.demandeConge.Repository;

import com.portailRH.demandeConge.Entity.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Long > {

}
