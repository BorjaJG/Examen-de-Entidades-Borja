package data;

import domain.models.Cliente;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClienteDataStore {


    private static ClienteDataStore instance;

    private Map<Integer, Cliente> storage = new TreeMap<>();

    private ClienteDataStore() {

    }

    public static ClienteDataStore getInstance() {
        return null;
    }

    public void save(Cliente Cliente) {
        storage.put(Cliente.getDni(), Cliente);
    }

    public List<Cliente> getAll() {
        return null;
    }
}
