package data;

import domain.models.Cuenta;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CuentaBancariaDataStore {
    private static CuentaBancariaDataStore instance;

    private Map<Integer, Cuenta> storage = new TreeMap<>();

    private CuentaBancariaDataStore() {

    }

    public static CuentaBancariaDataStore getInstance() {
        return null;
    }

    public void save(Cuenta Cuenta) {
        storage.put(Cuenta.getNCuenta(), Cuenta);
    }

    public List<Cuenta> getAll() {
        return null;
    }
}
