/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1608355
 */
public class PoligonalFechada extends Poligonal{
    
    public PoligonalFechada(int tam){
        super(tam);
    }
    
    @Override
    public double getComprimento(){
        double comp = 0;
        int i;
        for(i=0; i<vertices.length-1; i++){
            comp += vertices[i].dist(vertices[i+1]);
        }
        comp += vertices[i].dist(vertices[0]);
        return comp;
    }
}
