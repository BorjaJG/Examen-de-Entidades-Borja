package domain.UseCase;

import data.ClienteDataStore;
import data.CuentaBancariaDataStore;
import domain.models.Cliente;
import domain.models.Cuenta;

import javax.management.openmbean.CompositeData;
import java.util.List;

public class gettCuentaUseCase {

    private CuentaBancariaDataStore storage = CuentaBancariaDataStore.getInstance();
    public List<Cuenta> execute() {
        return storage.getAll();

    }
}
