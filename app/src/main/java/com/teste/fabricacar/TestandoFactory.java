package com.teste.fabricacar;

public class TestandoFactory {
    private static Carro opcoesCarro(String modelo) {
        CarroFactory modelcar = null;
        switch (modelo) {
            case "Ford":
                modelcar = new CarroFactoryConcreta();
                break;
            case "Toyota":
                modelcar = new CarroFactoryConcreta();
                break;
            case "Bmw":
                modelcar = new CarroFactoryConcreta();
        }
        Carro carro = new Carro();
        carro.setBmw(modelcar.versaoEsportivo());
        carro.setFord(modelcar.versaoSimples());
        return carro;
    }

    public static void main(String[] args) {
      Carro c1 = opcoesCarro("Ford");
      Carro c2 = opcoesCarro("Toyota");
      Carro c3 = opcoesCarro("Bmw");

      System.out.println("Todos modelos  ");
    }
}
