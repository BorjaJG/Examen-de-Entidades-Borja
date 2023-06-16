package domain.UseCase;

import data.ProductosBancariosDataStore;
import domain.models.ProductosBancarios;

import java.util.List;

public class gettProductosBancariosUseCase {

    private ProductosBancariosDataStore storage = ProductosBancariosDataStore.getInstance();
    public List<ProductosBancarios> execute() {
        return storage.getAll();

    }

}
