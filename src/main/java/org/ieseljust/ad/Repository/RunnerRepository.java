/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ieseljust.ad.Repository;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.ieseljust.ad.Model.Runner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jasb
 */

@Repository
@Transactional
public interface RunnerRepository extends JpaRepository<Runner, Long> {
    
    public List<Runner> findByLocalitat(String localitat);
    
    @Query(value = "select r from Runner r where r.edat < :edat")
    public List<Runner> getRunnersLessThan(@Param("edat") int edat);
}












