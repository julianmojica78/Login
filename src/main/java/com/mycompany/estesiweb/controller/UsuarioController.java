
package com.mycompany.estesiweb.controller;

import com.company.estesiweb.clase.Mensaje;
import com.company.estesiweb.clase.Suma;
import com.company.estesiweb.clase.Usuario;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author gtior
 */
public class UsuarioController {
     
    private List<Usuario> listaUsuario;
    
    public UsuarioController(){
    listaUsuario = new ArrayList();
    listaUsuario.add(new Usuario(1,"Andres","1234","0"));
    listaUsuario.add(new Usuario(2,"Julian","12345","0"));
    }
    
    /**
     * 
     * @return 
     */
    public List<Usuario> getListaUsuario(){
        return listaUsuario;
    }
    /**
     * 
     * @param listaUsuario 
     */
    public void setListaUsuario(List<Usuario> listaUsuario){
        this.listaUsuario = listaUsuario;
    }
    
        public List<Usuario> getListaMateria() {
        return listaUsuario;
    }
    
    /**
      * 
      * @param usuario
      * @param contrasena
      * @return 
      */
     public Mensaje getUsuarioEsp(String usuario,String contrasena){
       LogicaController logica = new LogicaController();
       for(Usuario usuario1 : listaUsuario){
           if(usuario1.getUsuario().equals(usuario)){
           if(usuario1.getUsuario().equals(usuario) && usuario1.getConstrasena().equals(contrasena)){
               Mensaje mensaje = new Mensaje();
               mensaje.setMensaje("Ingreso Valido");
               //listaUsuario = new ArrayList<Usuario>();
                 UtilitariaController utilitaria = new UtilitariaController();
                 int num = (int) (Math.random() * 99999) + 1;
                 String numero = String.valueOf(num);
                 ZonedDateTime dateFormat = ZonedDateTime.now();
                 String token = numero + dateFormat;
                 usuario1.setToken(token);                
              return mensaje;
           }
           else{
               Mensaje mensaje1 = new Mensaje();
               mensaje1.setMensaje("Usuario o Contraseña Invalidos");
               return mensaje1;
           }
         }
       }
       Mensaje mensaje1 = new Mensaje();
       mensaje1.setMensaje("Usuario o Contraseña Invalidos");
       return mensaje1;
     }
     
     public Suma operacionSuma(String usuario, int num1,int num2)
     {
        for(Usuario usuario1 : listaUsuario){
            
           if(usuario1.getUsuario().equals(usuario) && usuario1.getToken().length() > 1){
               Suma sum = new Suma();
               sum.setNum1(num1);
               sum.setNum2(num2);
               sum.setTotal(num1+num2);
               sum.setMensaje("Token Correcto,Operacion exitosa");
               return sum;
           }            
        }
        Suma sum1 = new Suma();
        sum1.setMensaje("Token Invalido,Operacion no habilitada.");
        return sum1; 
     }
     
     public Mensaje cerrarSesion(String usuario){
         Mensaje msg = new Mensaje();
         for(Usuario usuario1 : listaUsuario){
             if(usuario1.getUsuario().equals(usuario)&&usuario1.getToken().length()>1){
                 usuario1.setToken("0");
                 msg.setMensaje("Sesion Cerrada Correctamente");
                 return msg;
             }
         }
         msg.setMensaje("No se puede cerrar sesion sin estar Loggeado");
         return msg;
     }
}
