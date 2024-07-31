/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.estudiantes;

/**
 *
 * @author Guillermo
 */
public class personas {
private String nombres; 
private String cedulas;
private String edad;  
private String recidencia;

public personas(){
}        
 public personas(String nombres, String cedulas, String edad, String recidencia ) {
 this.cedulas = cedulas;
 this.nombres = nombres;
 this.edad = edad;
 this.recidencia = recidencia;
         
    }
 public String getEdad(){
     return edad;
     
 }
 public String getCedulas() {
        return cedulas;
    }
public String getNombres() {
        return nombres;
    }

  public void setNombre(String nombres) {
        this.nombres = nombres;
    }
    public void setCedulas(String cedulas) {
        this.cedulas = cedulas;
    }
     public void setEdad(String edad) {
        this.edad= edad;
     }
public String getRecidencia(){
return recidencia;

}
public void setRecidencia(String recidencia){
this.recidencia = recidencia;

}
}
