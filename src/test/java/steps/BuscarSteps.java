package steps;

import net.thucydides.core.annotations.Step;
import pages.ExitoHomePage;
import pages.ResultadoBusquedaPage;

public class BuscarSteps {
  ExitoHomePage exitoHomePage;
  ResultadoBusquedaPage resultadoBusquedaPage;

  @Step
  public void abrirPaginaBusqueda() {
    exitoHomePage.open();
  }

  @Step
  public void realizarBusquedaPorPalabraEspecifica(String articuloABuscar) {
    exitoHomePage.ingresarArticuloABuscar(articuloABuscar);
    exitoHomePage.buscarPorArticulo();
  }

  @Step
  public void verResultadosBusqueda() {
    resultadoBusquedaPage.verResultadosPorPalabraEspecifica();
  }
}
