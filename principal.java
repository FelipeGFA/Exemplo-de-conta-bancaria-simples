package exemploContaBancaria;

public class Aula05 {
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Felipe");
        p1.abrirConta("cc");

        ContaBanco p2 = new ContaBanco();
        p2.setDono("Creusa");
        p2.setNumConta(2222);
        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(150);
        p2.sacar(1000);        

        p1.fecharConta();

        p1.atual();
        p2.atual();
    } 
       
    
    
}
