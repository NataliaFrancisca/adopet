package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.services.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command {
    @Override
    public void execute() {
        try{
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            PetService petService = new PetService(clientHttpConfiguration);

            petService.importarPetsDoAbrigo();
        }catch (IOException | InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
