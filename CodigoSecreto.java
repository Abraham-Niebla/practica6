/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niebla.abraham.mastermind;

import java.util.Random;

/**Obtiene un codigo secreto que se tiene que adivinar
 * Son 6 colores posibles
 * @author (Ramírez Niebla Jesús Abraham) 
 * @version (1 04.14.2022)*/
public class CodigoSecreto
{
    private char[] colores = {'r','a','c','v','n','m'}; //Los posibles colores que puede tomar el codigo secreto
    private char[] codigo;

    /**Constructor de objetos de la clase CodigoSecreto*/
    public CodigoSecreto()
    {
    }
    
    /**Devuelve un código secreto de colores a adivinar*/
    public char[] getCodigo()
    {
        Random rdm = new Random();
        for (int i = 0; i < 6; i++)
        {
            codigo[i] = colores[rdm.nextInt()];
        }
        return codigo;
    }
}
