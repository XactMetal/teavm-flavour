package ${package}.view;

import org.teavm.flavour.templates.BindTemplate;

/**
 *
 * @author andy
 */
@BindTemplate("templates/page1.html")
public class Page1View {
  private String userName = "";

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
