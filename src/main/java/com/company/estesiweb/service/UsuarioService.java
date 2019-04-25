/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.estesiweb.service;

import com.mycompany.estesiweb.controller.MateriaController;
import com.mycompany.estesiweb.controller.UsuarioController;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author gtior
 */

@Stateless
@Path("usuario")
public class UsuarioService {
    UsuarioController mt = new UsuarioController();
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public Response retornUsuario(){
     
   return Response.ok(mt.getListaUsuario()).build();
   }      
    
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 @Path("/{usuario}/{contrasena}")
 public Response retornaUsuarioEspecifico(@PathParam("usuario") String usuario,@PathParam("contrasena") String contrasena){
    try{
        return Response.ok(mt.getUsuarioEsp(usuario,contrasena)).build();
    }catch (Exception ex){
         return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }
     
   }
  @GET
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 @Path("/{usuario}/{num1}/{num2}")
 public Response operacionSuma(@PathParam("usuario")String usuario,@PathParam("num1") int num1 ,@PathParam("num2") int num2){
     try{
     return Response.ok(mt.operacionSuma(usuario,num1,num2)).build();
     }catch (Exception ex){
         return Response.status(Response.Status.NOT_IMPLEMENTED).build();
         
     }         
   }
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 @Path("/{usuario}/")
 public Response cerrarSesion(@PathParam("usuario")String usuario){
     return Response.ok(mt.cerrarSesion(usuario)).build();
 }
}
