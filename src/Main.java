public class Main {

    public static void main(String[] args) {
        Fraccion a = new Fraccion(12,34);
        Fraccion b = new Fraccion(46,68);
        Fraccion r = new Fraccion();

        r.mostrar();
        r = a.sumar(b);
        r.mostrar();
        r = a.restar(b);
        r.mostrar();
        r = a.multiplicar(b);
        r.mostrar();
        r = a.dividir(b);
        r.mostrar();
        r.simplificar();
        r.mostrar();

    }
}
