/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ieseljust.ad.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.ieseljust.ad.DTO.CategoriaDTO;
import org.ieseljust.ad.DTO.RunnerDTO;
import org.ieseljust.ad.Model.Categoria;
import org.ieseljust.ad.Model.Runner;
import org.ieseljust.ad.Repository.CategoriaRepository;
import org.ieseljust.ad.Repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jasb
 */
@Service
public class RunnerServiceImpl implements RunnerService{
    
    @Autowired
    private RunnerRepository runnerRepository;
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Override
    public CategoriaDTO getCategoriaRunner(Long id) {
        
        Optional<Runner> r = runnerRepository.findById(id);
        
        if (r.isPresent()){
            Optional<Categoria> cat = categoriaRepository.findById(r.get().getCategoria().getId());
            
            CategoriaDTO categoriaDTO = CategoriaDTO.convert2DTO(cat.get());
            return categoriaDTO;
        
        }
        return null;
    }

    @Override
    public  List<RunnerDTO> getRunnerByLocalitat(String localitat) {
        List<RunnerDTO> elsCorredorsDTO = new ArrayList<>();

        List<Runner> elsCorredors = runnerRepository.findByLocalitat(localitat);

        for (Runner c : elsCorredors) {
            elsCorredorsDTO.add(RunnerDTO.convert2DTO(c, CategoriaDTO.convert2DTO(c.getCategoria())));
        }
        
        return elsCorredorsDTO;
    }

    @Override
    public List<RunnerDTO> listAllRunners() {
        List<RunnerDTO> elsCorredorsDTO = new ArrayList<>();

        List<Runner> elsCorredors = runnerRepository.findAll();

        for (Runner c : elsCorredors) {
            elsCorredorsDTO.add(RunnerDTO.convert2DTO(c, CategoriaDTO.convert2DTO(c.getCategoria())));
        }

        return elsCorredorsDTO;
    }

    @Override
    public List<RunnerDTO> getRunnerLessEdat(int edat) {
        List<RunnerDTO> elsCorredorsDTO = new ArrayList<>();

        List<Runner> elsCorredors = runnerRepository.getRunnersLessThan(edat);

        for (Runner c : elsCorredors) {
            elsCorredorsDTO.add(RunnerDTO.convert2DTO(c, CategoriaDTO.convert2DTO(c.getCategoria())));
        }

        return elsCorredorsDTO;
    }
 
}
