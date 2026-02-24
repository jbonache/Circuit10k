/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ieseljust.ad.Repository;

import javax.transaction.Transactional;
import org.ieseljust.ad.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jasb
 */
@Repository
@Transactional
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
