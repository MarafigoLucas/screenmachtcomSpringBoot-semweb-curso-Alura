package br.com.alura.screenmacht;

import br.com.alura.screenmacht.model.DadosSerie;
import br.com.alura.screenmacht.service.ConsumoApi;
import br.com.alura.screenmacht.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmachtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmachtApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception { // metodo run = void main = inicializa a aplicação
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=stranger+things&apikey=880f8df3");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados (json, DadosSerie.class);
		System.out.println(dados);

	}
}
