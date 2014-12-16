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
public class Poligonal {
    protected Ponto2D[] vertices;
    private int first;
    
    public Poligonal(int tam){
        first = -1;
        if(tam<2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        vertices = new Ponto2D[tam];
    }
    
    public int getN(){
        return vertices.length;
    } 
    
    public Ponto2D get(int pos){
        if(pos<0 || pos>=getN())
            return null;
        return vertices[pos];
    }
    
    public void setFirst(int val){
        first = val;
    }
    
    public int getFirst(){
        return first;
    }
    
    public void set(int pos,Ponto2D pt){
        if(pos<0 || pos>=getN())
            return;
        
        if(getFirst() == -1){
            setFirst(pos);
            vertices[getFirst()] = pt;
            return;
        }
        
        if(     pt instanceof PontoXY && !(vertices[getFirst()] instanceof PontoXY) ||
                pt instanceof PontoXY && !(vertices[getFirst()] instanceof PontoXY) ||
                pt instanceof PontoXY && !(vertices[getFirst()] instanceof PontoXY) )
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        
        vertices[pos] = pt;
    }
    
    public double getComprimento(){
        double comp = 0;
        for(int i=0; i<vertices.length-1; i++){
            comp += vertices[i].dist(vertices[i+1]);
        }
        return comp;
    }
}
