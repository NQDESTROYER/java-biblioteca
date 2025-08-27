/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojecttr;

/**
 *
 * @author CETECOM
 */
public class Libro {
    private String titulo;
    private String codigo;
    private String autor;
    private String year;
    private boolean disponible;
    
    
    public Libro(String titulo, String autor, String year)
    {   
        this.titulo = titulo;
        this.autor = autor;
        //this.codigo = codigo;
        this.year = year;
        this.disponible = true;    
    }
    
    public String getTitulo()
    {   
        return this.titulo;
    }
          
    
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    
    
    public String getCodigo()
    {
        return this.codigo;
    }


}

