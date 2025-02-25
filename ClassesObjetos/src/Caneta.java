public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar(){ 
        if(this.tampada==true){
            System.out.println("Erro!! Não posso rabiscar");
        }else{
            System.out.println("Rabiscar!!");
        }

    }

    void tampar(){
        this.tampada = true;
        // this referencia ao Objeto
    }

    void destampar(){
        this.tampada = false;
    }

}
