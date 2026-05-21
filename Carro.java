package Avaliação_21_05_2026;

import java.time.LocalDate;

public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;
    private LocalDate dataAquisicao;

    
    public Carro(String marca, String modelo, String placa,
            int ano, double preco, LocalDate dataAquisicao) {

  setMarca(marca);
  setModelo(modelo);
  setPlaca(placa);
  setAno(ano);
  setPreco(preco);
  setDataAquisicao(dataAquisicao);
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida.");
        }
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido.");
        }
        this.modelo = modelo;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        if (placa == null || placa.length() < 7) {
            throw new IllegalArgumentException("Placa inválida.");
        }
        this.placa = placa;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1900 || ano > 2026) {
            throw new IllegalArgumentException("Ano inválido.");
        }
        this.ano = ano;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
        this.preco = preco;
    }
    
    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        if (dataAquisicao == null) {
            throw new IllegalArgumentException("Data inválida.");
        }
        this.dataAquisicao = dataAquisicao;
    }
    public double calcularDepreciacao(int anoFuturo) {

        int anoAtual = 2026;

        if (anoFuturo <= anoAtual) {
            throw new IllegalArgumentException(
                    "O ano deve ser maior que 2026.");
        }
        
        double taxa;

        if (ano < 2016) {
            taxa = 0.07;
        } else {
            taxa = 0.05;
        }
        int tempo = anoFuturo - anoAtual;

        // Fórmula de juros compostos:
        // M = C * (1 - i)^t

        return preco * Math.pow((1 - taxa), tempo);
    }

    @Override
    public String toString() {
        return "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nPlaca: " + placa +
                "\nAno: " + ano +
                "\nPreço: R$ " + preco +
                "\nData de aquisição: " + dataAquisicao;
    }
}







    
