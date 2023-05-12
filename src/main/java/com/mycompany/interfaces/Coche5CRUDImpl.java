/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;


/**
 *
 * @author USUARIO
 */
public class Coche5CRUDImpl implements Coche5CRUD{

    @Override
    public void save() {
        System.out.println("save");
    }
    
    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

}
