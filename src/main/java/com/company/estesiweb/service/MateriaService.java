/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.estesiweb.service;

import com.company.estesiweb.clase.Materia;
import com.mycompany.estesiweb.controller.MateriaController;
 import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author idangut
 */
@Stateless
@Path("materia")
public class MateriaService {
 MateriaController mt = new MateriaController();

 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public Response retornMaterias(){
     
   return Response.ok(mt.getListaMateria()).build();
   }   
 
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 @Path("/{id}")
 public Response retornaMateriaEspecifica(@PathParam("id") int idMateria){
    return Response.ok(mt.getMateriaEsp(idMateria)).build();
   }   
 
   
 

 @POST
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 public Response agregarMateria(Materia materia){
     try{
     mt.anadirMateria(materia);
         return Response.status(Response.Status.OK).build();
     }catch (Exception ex){
         return Response.status(Response.Status.NOT_IMPLEMENTED).build();
         
     }         
   }
 
 
 
 @DELETE
 @Produces(MediaType.APPLICATION_JSON)
 @Path("/{id}")
 public Response eliminar(@PathParam("id") int id){
     mt.eliminar(id);
    return Response.status(Response.Status.OK).build();
   }   
 
 
 }   


