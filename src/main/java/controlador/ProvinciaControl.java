/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pais;
import modelo.Provincia;
import service.PaisServiceImpl;
import service.ProvinciaServiceImpl;

/**
 *
 * @author andyj
 */
public class ProvinciaControl {
    private PaisServiceImpl paisserviceImpl = new PaisServiceImpl();
    
   private ProvinciaServiceImpl provinciaServiceImpl; 

    public ProvinciaControl() {
        provinciaServiceImpl= new ProvinciaServiceImpl();
        
    }

  
    
            
    public void crear(String [] data){
        
        var numeroCantones= Integer.valueOf(data[0]);
        var numeroCiudades=Integer.valueOf(data[1]);
        var nuemeroHabitantes=Integer.valueOf(data[2]);
        var habitantesRemunerados=Integer.valueOf(data[3]);
        var habitantesSinTrabajo=Integer.valueOf(data[4]);
        var pais = this.paisserviceImpl.buscarPorCodigo(Integer.valueOf(data[5]));
       
        var provincia = new Provincia(numeroCantones,numeroCiudades,nuemeroHabitantes,habitantesRemunerados,habitantesSinTrabajo,pais);
        this.provinciaServiceImpl.crear(provincia);
        
    }
    
    public List<Provincia> listar(){
        return this.provinciaServiceImpl.listar();
}


}

    

