package CVD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Dune\\iCambios\\eCMX\\1 CVD\\Pruebas Internas",
                glue = "CVD.Compra_USD.consulta_tcCompra")
public class RunCucumberCVD {
}
