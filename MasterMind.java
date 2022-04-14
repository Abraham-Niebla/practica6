/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package niebla.abraham.mastermind;

import java.awt.Color;

/**El juego MasterMind
 * @author (Ramírez Niebla Jesús Abraham) 
 * @version (1 04.12.2022)
 */
public class MasterMind
{

    public static void main(String[] args)
    {
        MasterMindVisual vista = new MasterMindVisual();
        
        vista.dibujarVista();
        vista.getFichas().setFicha(0, new Color(244, 67, 54));
        vista.getFichas().setFicha(1, new Color(255, 235, 59));
        vista.getFichas().setFicha(2, new Color(0, 188, 212));
        vista.getFichas().setFicha(3, new Color(76, 175, 80));
        vista.getFichas().setFicha(4, new Color(255, 152, 0));
        vista.getFichas().setFicha(5, new Color(156, 39, 176));
    }
    
}