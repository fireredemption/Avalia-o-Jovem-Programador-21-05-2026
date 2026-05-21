package Avaliação_21_05_2026;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args) {
	
		Revendedora revendedora = new Revendedora();
		
		revendedora.adicionarCarro(
				new Carro("Volkswagen",
				"Gol",
				"FTX2A45",
				2010,
				21000,
				LocalDate.of(2024, 3, 14)
				)
		);
		
		revendedora.adicionarCarro(
				new Carro (
						"Chevrolet",
						"Onix",
						"JKM9B12",
						2015,
						38000,
						LocalDate.of(2024, 11, 29)
						)
				);
		
	      revendedora.adicionarCarro(
	                new Carro(
	                        "Honda",
	                        "Civic",
	                        "LPR4C67",
	                        2010,
	                        34000,
	                        LocalDate.of(2023, 6, 7)
	                )
	        );

	        revendedora.adicionarCarro(
	                new Carro(
	                        "Chevrolet",
	                        "Cruze",
	                        "QWE7D89",
	                        2019,
	                        79000,
	                        LocalDate.of(2025, 1, 18)
	                )
	        );
	        revendedora.adicionarCarro(
	                new Carro(
	                        "Volkswagen",
	                        "Polo",
	                        "ZTR1F23",
	                        2019,
	                        58000,
	                        LocalDate.of(2024, 8, 25)
	                )
	        );
	        
	        System.out.println("=== BUSCA POR PLACA ===");

	        Carro encontrado =
	                revendedora.buscarPorPlaca("JKM9B12");

	        if (encontrado != null) {
	            System.out.println(encontrado);
	        } else {
	            System.out.println("Carro não encontrado.");
	        }
	        
	        System.out.println("\n=== MAIS CARO DE 2019 ===");

	        Carro maisCaro =
	                revendedora.carroMaisCaroAno(2019);

	        System.out.println(maisCaro);
	        
	        System.out.println("\n=== VOLKSWAGEN ENTRE 20k e 60k ===");

	        ArrayList<Carro> lista =
	                revendedora.buscarMarcaFaixaPreco(
	                        "Volkswagen",
	                        20000,
	                        60000
	                );

	        for (Carro c : lista) {
	            System.out.println(c);
	        }
	        
	        System.out.println("\n=== DEPRECIAÇÃO ===");

	        double valorFuturo =
	                encontrado.calcularDepreciacao(2030);

	        System.out.println(
	                "Valor depreciado em 2030: R$ "
	                        + valorFuturo
	        );
										
	}

}
