package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.services.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command {
    @Override
    public void execute() {
        try{
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            PetService petService = new PetService(clientHttpConfiguration);

            petService.listarPetsDoAbrigo();
        }catch (IOException | InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
