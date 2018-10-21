/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lino
 */
@Controller
@RequestMapping("/ver.htm")
public class verController {
    
    //Siempre debe retornar un String
    
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model m){
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("txtNombre") String nombre, @RequestParam("txtCarrera") String carrera, @RequestParam("txtFechanac") String fechanac, @RequestParam("txtContra") String contra, @RequestParam("txtCorreoe") String correoe, Model m){
        if ((nombre.trim().equals("")) && (fechanac.trim().equals("")) && (contra.trim().equals("")) && (correoe.trim().equals(""))){
            String a = "Campos vacios";
            m.addAttribute("err", a);
            return "error";
        } else {
            
            Estudiante estudiante = new Estudiante(nombre, carrera, fechanac, contra, correoe);
            
            m.addAttribute("estudiante", estudiante);
            return "exito";
        }
        
        
    }
    
}
