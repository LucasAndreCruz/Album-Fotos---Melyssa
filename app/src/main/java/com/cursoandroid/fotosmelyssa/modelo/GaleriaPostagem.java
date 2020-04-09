package com.cursoandroid.fotosmelyssa.modelo;

public class GaleriaPostagem {

    private String texto;
    private int imagem;

    public GaleriaPostagem() {

    }

    public GaleriaPostagem(String texto, int imagem) {
        this.texto = texto;
        this.imagem = imagem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
