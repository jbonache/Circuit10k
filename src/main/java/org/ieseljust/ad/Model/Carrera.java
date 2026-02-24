package org.ieseljust.ad.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "carrera")
public class Carrera {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "localitat")
    private String localitat;
    
    
    @Column(name = "distancia_km")
    private int distancia;
    
    
    @Column(name = "num_participants")
    private int num_participants;
    
    @ManyToMany(mappedBy = "listaCarreras" , fetch =FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Runner> corredores = new ArrayList<>();


	

}
