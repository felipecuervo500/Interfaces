/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfaces;

/**
 *
 * @author USUARIO
 */
public class Interfaces {
    
    public static void main(String[] args) {
        
        Coche5CRUDImpl c = new Coche5CRUDImpl();
        
        c.save();
        c.findAll();
        c.delete();
    }
}
