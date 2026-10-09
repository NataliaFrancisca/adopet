package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.services.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command{

    @Override
    public void execute() {
        try{
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(clientHttpConfiguration);

            abrigoService.cadastrarAbrigo();
        }catch (IOException | InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
