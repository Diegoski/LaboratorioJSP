/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unipiloto.clases;


import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;


/**
 *
 * @author Diego
 */
public class NameHandler {
    private String name; 
    private String fecha_nacimiento;
    
    

    public NameHandler() {
        
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String edad(){
       //2023-04-10
       int año,mes,dia;
       String fecha[] = fecha_nacimiento.split("-");
       año = Integer.parseInt(fecha[0]);
       mes = Integer.parseInt(fecha[1]);
       dia = Integer.parseInt(fecha[2]);
       LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
       LocalDate fechaActual = LocalDate.now();
       int edad = Period.between(fechaNacimiento, fechaActual).getYears();

    return String.valueOf(edad);
    }
    public String saludo(){
     Clock clock = Clock.systemDefaultZone();
     LocalTime horaActual = LocalTime.now(clock);
     String mensajeSaludo; 
      int hora = horaActual.getHour();
      if (hora >= 1 && hora < 12) {
        mensajeSaludo = "Buenos días";
    } else if (hora >= 12 && hora < 18) {
        mensajeSaludo = "Buenas tardes";
    } else {
        mensajeSaludo = "Buenas noches";
    }
      return mensajeSaludo;
    }
}
