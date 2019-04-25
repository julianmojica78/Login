/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estesiweb.controller;

import com.company.estesiweb.clase.Materia;
import com.company.estesiweb.clase.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author idangut
 */
public class MateriaController {
    private List<Materia> listaMateria;
    
    public MateriaController()
    {
        listaMateria = new ArrayList<>();
        listaMateria.add(new Materia("matematicas",1));
        listaMateria.add(new Materia("español",2));
        listaMateria.add(new Materia("sociales",3));
        ///////////////////////////////////////////////
        
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }
    
    

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
     public Materia getMateriaEsp(int idMateria){
        for (Materia materia : listaMateria) {
            if(materia.getId()== idMateria)
                return materia;
        }
        return null; 
    }
     
     
    
     
     
     
    public void anadirMateria(Materia materia) throws Exception {
       if(materia.getId()==0){
       throw  new Exception("La materia no puede ser cero!!");
       }else{
        listaMateria.add(materia);
    }    
    }
    
    public void eliminar (int id){
        for (Materia materia : listaMateria) {
            if(materia.getId()== id){
                listaMateria.remove(materia);
                break;
            }
        }
    }
   
}

