public class Fraccion {
    int numerador;
    int denominador;

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion a) {
        int cont1 = (a.numerador * this.denominador) + (a.denominador * this.numerador);
        int cont2 = this.denominador * a.denominador;
        return new Fraccion(cont1, cont2);
    }

    public Fraccion restar(Fraccion a) {
        int cont1 = a.denominador * this.numerador - a.numerador * this.denominador;
        int cont2 = this.denominador * a.denominador;
        return new Fraccion(cont1, cont2);
    }

    public Fraccion multiplicar(Fraccion a) {
        int cont1 = this.numerador * a.numerador;
        int cont2 = this.denominador * a.denominador;
        return new Fraccion(cont1, cont2);
    }

    public Fraccion dividir(Fraccion a) {
        int cont1 = this.numerador * a.denominador;
        int cont2 = this.denominador * a.numerador;
        return new Fraccion(cont1, cont2);
    }

    public Fraccion simplificar() {
        Fraccion resultado;
        int num;
        int cont;
        resultado = new Fraccion();
        cont=2;
        while ((cont<this.numerador) || (cont<this.denominador)) {
            if(this.numerador%cont==0 && this.denominador%cont==0) {
                this.numerador /= cont;
                this.denominador /= cont;
            }
            cont++;
        }
        resultado.numerador=this.numerador;
        resultado.denominador=this.denominador;

        return resultado;
    }

    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }
}
