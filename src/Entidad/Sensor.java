/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="valor", nullable=false)
    private int valor;
    @Column(name="fecha", nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @Column(name="prosesamiento", nullable=false, length = 100)
    private String procesamiento;
    
    

    public Sensor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProcesamiento() {
        return procesamiento;
    }

    public void setProcesamiento(String procesamiento) {
        this.procesamiento = procesamiento;
    }
    
}
