package com.portailRH.TypeConge.Entity;

import com.portailRH.demandeConge.Entity.DemandeConge;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "type_conge")
public class TypeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_conge_id",nullable=false)
    private Long id ;
    @Column(name = "libelle")
    private String libelle;

  /*  @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "demande_id") // dont use it
    private DemandeConge demandeConge;
*/

}
