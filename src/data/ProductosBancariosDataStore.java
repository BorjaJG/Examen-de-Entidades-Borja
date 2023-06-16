package data;

import domain.models.Cuenta;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductosBancariosDataStore {

    private static ProductosBancariosDataStore instance;
    private Map<Integer, ProductosBancarios> storage = new TreeMap<>();

    private ProductosBancariosDataStore() {

    }

    public static ProductosBancariosDataStore getInstance() {
        return null;
    }

    public void save(ProductosBancarios ProductosBancarios) {
        storage.put(ProductosBancarios.getId(), ProductosBancarios);
    }

    public List<ProductosBancarios> getAll() {
        return null;
    }
}


