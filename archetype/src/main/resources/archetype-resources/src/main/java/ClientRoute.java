package ${package};

import org.teavm.flavour.routing.Path;
import org.teavm.flavour.routing.PathSet;
import org.teavm.flavour.routing.Route;

/**
 *
 * @author andy
 */
@PathSet
public interface ClientRoute extends Route {

  @Path("/")
  void index();

  @Path("/page1")
  void page1();

  @Path("/page2")
  void page2();
}
