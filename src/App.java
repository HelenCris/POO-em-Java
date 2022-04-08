public class App {
    public static void main(String[] args) throws Exception {
        //Caneta = classe, c1 = objeto
        //objeto c1 istanciado
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f; //atributo não tem parenteses
        c1.tampar();
        
        c1.status(); //método tem parênteses
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
