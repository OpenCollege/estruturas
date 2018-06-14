public class NodoArv
{
    private int info; 
    private NodoArv esq ;
    private NodoArv dir ;
    
    public NodoArv() {
    }
    
    public NodoArv(int info) {
        this.info = info ;
    }

    public void setInfo(int info) {
        this.info = info ;
    }
    
    public NodoArv getEsq() {
        return this.esq ;
    }
    
    public NodoArv getDir() {
        return this.dir ;
    }
    
    public void setEsq(NodoArv nodo) {
        this.esq = nodo ;
    }
    
    public void setDir(NodoArv nodo) {
        this.dir = nodo ;
    }
    
    public int getInfo() {
        return info ;
    }
    
    public void setProx(NodoArv inicio) {
        this.dir = inicio ;
        return ;
    }
}
