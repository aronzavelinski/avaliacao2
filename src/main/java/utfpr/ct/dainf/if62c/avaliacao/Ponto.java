package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;

    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public Ponto(){
        x = 0;
        y=0;
        z=0;
    }
    
    public Ponto(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public double dist(Ponto p){
        return Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2) + Math.pow(this.y-p.y, 2));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }
    
    @Override
    public String toString(){
        String str = getNome()+"("+x+","+y+","+z+")";
        return str;
    }
    
    @Override
    public boolean equals(Object p){
        if(p == null || !(p instanceof Ponto))
            return false;
        
        Ponto pt = (Ponto) p;
        if((pt.getX()==this.x) && (pt.getY()==this.y) && (pt.getZ()==this.z)){
            return true;
        }
        else{
            return false;
        }
    }
}
