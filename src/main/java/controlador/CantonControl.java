/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import service.CantonServiceImpl;
import java.util.List;
import modelo.Canton;
import service.ProvinciaServiceImpl;

/**
 *
 * @author andyj
 */
public class CantonControl {
    
private ProvinciaServiceImpl provinciaServiceImpl = new ProvinciaServiceImpl();
    private CantonServiceImpl cantonServiceImpl;

    public CantonControl() {
        cantonServiceImpl= new CantonServiceImpl();
    }
    
    
    
    public void crear(String [] data){
        
        var nombreCanton= data[0];
        var areaTotalM2=Integer.valueOf(data[1]);
        var upcActivas=Integer.valueOf(data[2]);
        var universidadesDisponibles=Integer.valueOf(data[3]);
        var numeroHabitantes=Integer.valueOf(data[4]);
        var provincia = this.provinciaServiceImpl.buscarPorCodigo(Integer.valueOf(data[5]));
        
       
        var canton = new Canton(nombreCanton,areaTotalM2,upcActivas,universidadesDisponibles,numeroHabitantes,provincia);
        this.cantonServiceImpl.crear(canton);
        
    }
    
    public List<Canton> listar(){
        return this.cantonServiceImpl.listar();
}

}
