/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

/**
 *
 * @author Arthur Fagundes
 */
public class Hardware {
    private int cod;
    private String nome;
    private String marca;
    private String categoria;
    private int dataCom;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDataCom() {
        return dataCom;
    }

    public void setDataCom(int dataCad) {
        this.dataCom = dataCom;
    }

    @Override
    public String toString() {
        return "Hardware{" + "cod=" + cod + ", nome=" + nome + ", marca=" + marca + ", categoria=" + categoria + ", dataCom=" + dataCom + '}';
    }
    
    
    
}
