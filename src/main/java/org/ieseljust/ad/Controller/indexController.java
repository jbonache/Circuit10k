/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ieseljust.ad.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jasb
 */
@RestController
public class indexController {
    
     @GetMapping("/")
     public String index(){
         return "Benvinguts a l'API REST de <b>Circuit 10k</b>";
     }
}
