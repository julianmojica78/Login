/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estesiweb.controller;

import com.company.estesiweb.clase.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author DAVID
 */
public class LogicaController {
    public HashMap<Integer,Usuario> user;
    private static final String ubicacion = "archivo.txt";
    
     public void grabarLista(HashMap<Integer,Usuario> lista) {  
        try {
            ObjectOutputStream mostrar  = new ObjectOutputStream(new FileOutputStream(ubicacion));
            mostrar.writeObject(lista);
            
            mostrar.close();
        } catch (IOException ex) {
            System.err.println("no se pudo grabar la infromación!!!");
            ex.printStackTrace();
        }//catch
    }// metodo
       /*
    *
    *metodo en el cual se valida los datos insertados en la lista 
    */
    private void validarDatos() {
     try {
            
           File file = new File(ubicacion);
           
            if (!file.exists()) {
                file.createNewFile();
                user=new HashMap<>();
                grabarLista(user);
               
            }//if
        } catch (IOException e) {
            e.printStackTrace();
        }//catch
    }//metodo
   
      /*
    *
    *metodo en el cual se buscan los datos en la lista
    *
    */
 
    public HashMap<Integer,Usuario> obtenerListasActuales() {
        user=new HashMap<>();
        try {
            ObjectInputStream entrada =  new ObjectInputStream(new FileInputStream(ubicacion));
            user = (HashMap<Integer,Usuario>) entrada.readObject();
  
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("no se pudo encontrar la lista!!!");
            ex.printStackTrace();
        } 
        
        return user;
    }//mapa
    
}
