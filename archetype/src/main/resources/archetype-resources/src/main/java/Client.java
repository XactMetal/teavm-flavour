package ${package};

import com.example.view.IndexView;
import com.example.view.Page1View;
import com.example.view.Page2View;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;
import org.teavm.flavour.widgets.RouteBinder;
import org.teavm.jso.browser.Window;

@BindTemplate("templates/client.html")
public class Client extends ApplicationTemplate implements ClientRoute {
  public static void main(String[] args) {
    Window.current().getDocument().getElementById("application-content").clear();
    // To enable path-based routing, uncomment the following line.
    // For more info see the Flavour Book: https://frequal.com/Flavour/book.html
    //Routing.usePathStrategy();
    Client client = new Client();
    new RouteBinder()
            .withDefault(ClientRoute.class, r -> r.index())
            .add(client)
            .update();
    client.bind("application-content");
  }

  @Override
  public void index() {
    setView(new IndexView());
  }

  @Override
  public void page1() {
    setView(new Page1View());
  }

  @Override
  public void page2() {
    setView(new Page2View());
  }
}
