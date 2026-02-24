/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.ieseljust.ad.Service;

import java.util.List;
import org.ieseljust.ad.DTO.CategoriaDTO;
import org.ieseljust.ad.DTO.RunnerDTO;

/**
 *
 * @author jasb
 */
public interface RunnerService {
    
    List<RunnerDTO> getRunnerByLocalitat(String localitat);

    List<RunnerDTO> listAllRunners();
    
    List<RunnerDTO> getRunnerLessEdat(int edat);
    
    CategoriaDTO getCategoriaRunner(Long id);
    
}
