package Avaliação_21_05_2026;

import java.util.ArrayList;

public class Revendedora {

    private ArrayList<Carro> carros;
    
    public Revendedora() {
        carros = new ArrayList<>();
    }
    
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public Carro buscarPorPlaca(String placa) {

        for (Carro carro : carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }

        return null;
    }

    public Carro carroMaisCaroAno(int ano) {

        Carro maisCaro = null;

        for (Carro carro : carros) {

            if (carro.getAno() == ano) {

                if (maisCaro == null ||
                        carro.getPreco() > maisCaro.getPreco()) {

                    maisCaro = carro;
                }
            }
        }
        return maisCaro;
       }

       public ArrayList<Carro> buscarMarcaFaixaPreco(
               String marca,
               double precoMin,
               double precoMax) {

           ArrayList<Carro> resultado = new ArrayList<>();

           for (Carro carro : carros) {

               if (carro.getMarca().equalsIgnoreCase(marca)
                       && carro.getPreco() >= precoMin
                       && carro.getPreco() <= precoMax) {

                   resultado.add(carro);
               }
           }
           
           return resultado;
       }
   }

        


