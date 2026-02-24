/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ieseljust.ad.DTO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.ieseljust.ad.Model.Categoria;
import org.ieseljust.ad.Model.Runner;

/**
 *
 * @author jasb
 */

@Data
@NoArgsConstructor
public class CategoriaDTO implements Serializable{
    
    private static final long serialVersionUID = 17L;
    private Long id;

    private String nom;
    
    private String descripcio; 
    
    
    public static CategoriaDTO convert2DTO(Categoria categoria) {

    	CategoriaDTO categoriaDTO = new CategoriaDTO();

    	categoriaDTO.setId(categoria.getId());
    	categoriaDTO.setDescripcio(categoria.getDescripcio());
    	categoriaDTO.setNom(categoria.getNom());       
        
        return categoriaDTO;
    }
    
}
