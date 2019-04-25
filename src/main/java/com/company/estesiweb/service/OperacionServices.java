package com.company.estesiweb.service;

import com.mycompany.estesiweb.controller.UsuarioController;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author DAVID
 */
@Stateless
@Path("operacion")
public class OperacionServices {
 UsuarioController mt = new UsuarioController();   
 /*@GET
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 @Path("/{num1}/{num2}")
 public Response operacionSuma(@PathParam("num1") int num1 ,@PathParam("num2") int num2){
     try{
    // return Response.ok(mt.operacionSuma(num1,num2)).build();
     }catch (Exception ex){
         return Response.status(Response.Status.NOT_IMPLEMENTED).build();
         
     }         
   }*/
}
