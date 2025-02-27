public class Caneta {

    public String modelo;
    public String cor;
    protected float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta Tampada? " + this.tampada);
    }

    public void escrever(){
        if(this.tampada == true){
            System.out.println("Erro!! Nao e possivel escrever");
        }else{
            System.out.println("Estou Escrevendo");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
