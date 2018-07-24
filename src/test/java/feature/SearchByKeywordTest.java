package feature;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.BuscarSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/data.csv")
//@Concurrent(threads="4x")
public class SearchByKeywordTest {

  private String palabraBuscar;

  public void setPalabraBuscar(String palabraBuscar) {
    this.palabraBuscar = palabraBuscar;
  }

  public String getPalabraBuscar() {
    return palabraBuscar;
  }

  @Managed(driver="chrome")
  WebDriver driver;

  @Steps
  BuscarSteps buscar;

  @Test
  public void buscarArticulosPorPalabraEspecifica() {

    //Dado
    buscar.abrirPaginaBusqueda();

    //Cuando
    buscar.realizarBusquedaPorPalabraEspecifica(palabraBuscar);

    //Entonces
    //buscar.verResultadosBusqueda();
  }
}
