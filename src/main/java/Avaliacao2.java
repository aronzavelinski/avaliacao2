
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        PontoXZ[] pts = new PontoXZ[3];
        pts[0] =  new PontoXZ(-3,2);
        pts[1] = new PontoXZ(-3,6);
        pts[2] = new PontoXZ(0,2);
        PoligonalFechada pol = new PoligonalFechada(3);
        int i=0;
        
        for(PontoXZ pt: pts){
            pol.set(i, pt);
            i++;
        }
        
        System.out.println("Comprimento da poligonal = "+pol.getComprimento());
    }
    
}
