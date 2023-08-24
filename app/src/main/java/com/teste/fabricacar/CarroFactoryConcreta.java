package com.teste.fabricacar;

public class CarroFactoryConcreta extends CarroFactory{
    @Override
    public Bmw versaoEsportivo() {
        return new Esportivo();
    }

    @Override
    public Ford versaoSimples() {
        return new VersaoSimples();
    }

    @Override
    public Toyota versaoBlindada() {
        return new VersaoBlindada();
    }
}
