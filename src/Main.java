public class Main {
    public static void main(String[] args) {

        Emisora emisora = new Emisora();

        ReceptorTv tv = new ReceptorTv();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite sat = new ReceptorSatelite();

        emisora.addReceptor(tv);
        emisora.addReceptor(radio);
        emisora.addReceptor(sat);

        emisora.emite();
    }
}