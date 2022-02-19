package pOO.test;

import pOO.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Jaguar";
        carro.modelo = "Pica";
        carro.ano = 1992;

        carro2.nome = "Ferrari";
        carro2.modelo = "Mais pica";
        carro2.ano = 1921;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
