package br.com.alura.screenmacht;

import br.com.alura.screenmacht.model.DadosEpisodio;
import br.com.alura.screenmacht.model.DadosSerie;
import br.com.alura.screenmacht.model.DadosTemporada;
import br.com.alura.screenmacht.service.ConsumoApi;
import br.com.alura.screenmacht.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmachtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmachtApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception { // metodo run = void main = inicializa a aplicação
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=880f8df3");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados (json, DadosSerie.class);
		System.out.println(dados);

		json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=880f8df3");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1;i <= dados.totalTemporadas();i++){
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season="+ i +"&apikey=880f8df3");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}

		temporadas.forEach(System.out::println);

	}
}
