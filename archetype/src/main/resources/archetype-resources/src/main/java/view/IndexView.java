package ${package}.view;

import com.example.ClientRoute;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

/**
 *
 * @author andy
 */
@BindTemplate("templates/index.html")
public class IndexView {

  public void showPage1() {
    Routing.open(ClientRoute.class).page1();
  }

  public void showPage2() {
    Routing.open(ClientRoute.class).page2();
  }
}
