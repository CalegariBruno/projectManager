/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author 2022122760044
 */
public class GerenciadorInterfaceGrafica {
    
    //SINGLETON
    
    private static GerenciadorInterfaceGrafica myInstance = new GerenciadorInterfaceGrafica();
    
    private GerenciadorInterfaceGrafica(){
    
    }
    
    public static GerenciadorInterfaceGrafica getInstance(){
        return myInstance;
    }
        
}
