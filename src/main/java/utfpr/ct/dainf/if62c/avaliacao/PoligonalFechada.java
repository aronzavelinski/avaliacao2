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
        int i, j;
        int prim=0;
        for(i=0; i<vertices.length-1;){
            j=i+1;
            if(vertices[i]==null){
                i++;
                if(vertices[i]!=null && prim==0)
                    prim = i;
                continue;
            }
            
            for(;vertices[j]!=null && j<vertices.length; j++); //avança até encontrar próximo não nulo
            
            if(j==vertices.length)
                break;
            
            comp += vertices[i].dist(vertices[j]);
            i=j;
        }
        comp += vertices[i].dist(vertices[prim]);
        return comp;
    }
}
