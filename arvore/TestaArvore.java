public class TestaArvore{
    
    public static void main(String args[]){
        
        Arvore arv = new Arvore();
        int val=0;

        
        System.out.println( "Inserindo Valores: " );
        
        arv.insNodo(18);
        arv.insNodo(22);
        arv.insNodo(25);
        arv.insNodo(8);
        arv.insNodo(4);
        arv.insNodo(40);
        
        System.out.println("\n Pre-Fixado:\n");
        arv.preFixado( );
        
        System.out.println("\n Central:\n");
        arv.central( );
        
        System.out.println("\n Pos-Fixado:\n");
        arv.posFixado( );           
        System.out.println("\n");   

        System.out.println(arv.pesquisa(25));

        System.out.println("\n Removido:\n");
        arv.remove(8);
        
        arv.central();      
    }
}