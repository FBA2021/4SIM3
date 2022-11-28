package tn.spring.springproject.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Departement implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepart;
    private String nomDepart;

    /*@OneToMany
    private Set<Etudiant> etudiant;*/

    /*@ManyToOne
    private Universite universite;*/
}