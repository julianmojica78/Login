/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estesiweb.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author DAVID
 */
public class UtilitariaController {
    
    public String tokenGenerado(){
        int num = (int) (Math.random() * 99999) + 1;
        String numero = String.valueOf(num);
        ZonedDateTime dateFormat = ZonedDateTime.now();
        String token = numero + dateFormat;
       
       return token;
    }
    
}
