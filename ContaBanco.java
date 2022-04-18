package exemploContaBancaria;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void atual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());  
    }   
 
    public void abrirConta(String tipo){ 
        setTipo(tipo);
        setStatus(true);
          
        if (this.tipo == "cc"){
            this.setSaldo(50);
        }

        else if(this.tipo == "cp"){
            this.setSaldo(150);
        }
        System.out.println("Conta no nome de: '" + this.getDono() + "' aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo()> 0){
            System.out.println("Você não pode fechar a conta possuindo saldo dentro.");
            System.out.println("Saldo: " + this.saldo);
        }
        else if(this.getSaldo() < 0){
            System.out.println("Você não pode fechar a conta pois possui débito.");
        }

        else{
            setStatus(false);
            System.out.println("Conta fechada!");
        }
        
    }
    public void depositar(float valor){
        if (this.getStatus()){
            setSaldo(getSaldo() + valor); 
            System.out.println("Deposito feito com sucesso!");
        }
        else{
            System.out.println("Sua conta está fechada, não pode realizar depósitos.");
        }
    }
    public void sacar(float valor){
        if (this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono() + "!");
           }
           else{
            System.out.println("Saldo insuficiente para realizar o saque na conta de " + this.getDono());
           }                        
        }   
        else{
            System.out.println("Impossível sacar!");
        }

     
       
    }
    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "cc"){
            v = 12;
        }
        else if(this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Impossível pagar uma conta fechada");
        }
    }   

    public void contaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.atual();
    
    
    
    }

}
