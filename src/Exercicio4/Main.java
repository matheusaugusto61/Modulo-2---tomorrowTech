package Exercicio4;

public class Main {

    public static void main(String[] args) {
        Gigante primeiroGigante = new Gigante();

        Heroi primeiroHeroi = new Heroi();

        primeiroHeroi.setNome("castor");

        primeiroGigante.atacar(primeiroHeroi);

        System.out.println(primeiroHeroi.getVida());
    }

}
