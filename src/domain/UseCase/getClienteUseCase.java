package domain.UseCase;

import data.ClienteDataStore;
import domain.models.Cliente;

import java.util.List;

public class getClienteUseCase {

    private ClienteDataStore storage = ClienteDataStore.getInstance();
    public List<Cliente> execute() {
        return storage.getAll();

    }
}
