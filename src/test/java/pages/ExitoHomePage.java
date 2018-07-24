package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
public class ExitoHomePage extends PageObject {

  @FindBy(id = "tbxSearch")
  WebElementFacade txtBusquedaArticulo;

  @FindBy(id = "btnSearch")
  WebElementFacade btnBuscarArticulo;

  public void ingresarArticuloABuscar(String articuloABuscar) {
    txtBusquedaArticulo.sendKeys(articuloABuscar);
  }

  public void buscarPorArticulo() {
    btnBuscarArticulo.click();
  }
}
