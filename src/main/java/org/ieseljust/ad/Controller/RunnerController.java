/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ieseljust.ad.Controller;

import java.util.List;
import org.ieseljust.ad.DTO.CategoriaDTO;
import org.ieseljust.ad.DTO.RunnerDTO;
import org.ieseljust.ad.Service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jasb
 */
@RestController
public class RunnerController {
    
    @Autowired
    RunnerService runnerService;
    
     @GetMapping("/runners")
     public List<RunnerDTO> listAllRunners(){
         
        List<RunnerDTO> elsCorredors = runnerService.listAllRunners();

        return elsCorredors;
     }
     
    @GetMapping("/runner/localitat/{poble}")
    public ResponseEntity<List<RunnerDTO>> getRunnersByPoble(@PathVariable String poble) {

        List<RunnerDTO> resultatsDTO = runnerService.getRunnerByLocalitat(poble);

        if (resultatsDTO == null) 
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else 
            return new ResponseEntity<>(resultatsDTO, HttpStatus.OK);
        
    }
    
    @GetMapping("/runner/less/{edat}")
    public ResponseEntity<List<RunnerDTO>> getRunnersByPoble(@PathVariable int edat) {

        List<RunnerDTO> resultatsDTO = runnerService.getRunnerLessEdat(edat);

        if (resultatsDTO == null) 
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else 
            return new ResponseEntity<>(resultatsDTO, HttpStatus.OK);
        
    }
    
    @GetMapping("/categoria/runner")
    public ResponseEntity<CategoriaDTO> getCategoriaRunner(@RequestParam Long idRunner) {

        CategoriaDTO categoriaDTO = runnerService.getCategoriaRunner(idRunner);

        if (categoriaDTO == null) 
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else 
            return new ResponseEntity<>(categoriaDTO, HttpStatus.OK);
        
    }
    
    
}
