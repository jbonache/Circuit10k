package org.ieseljust.ad.DTO;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ieseljust.ad.Model.Runner;

@Data
@NoArgsConstructor
public class RunnerDTO implements Serializable{
    
    private static final long serialVersionUID = 17L;
	
    private Long id;

    private String dni;

    private String nom;
 
    private String cognoms;

    private int edat;

    private String localitat;

    private String email;

    private CategoriaDTO categoria;


    public static RunnerDTO convert2DTO(Runner runner, CategoriaDTO categoriadto) {

    	RunnerDTO runnerDTO = new RunnerDTO();

    	runnerDTO.setId(runner.getId());
    	runnerDTO.setDni(runner.getDni());
    	runnerDTO.setNom(runner.getNom());
    	runnerDTO.setCognoms(runner.getCognoms());  
        runnerDTO.setEdat(runner.getEdat());
    	runnerDTO.setLocalitat(runner.getLocalitat());
        runnerDTO.setEmail(runner.getEmail());
        
        
        runnerDTO.setCategoria(categoriadto);
        
        
        return runnerDTO;
    }
    
    
}
