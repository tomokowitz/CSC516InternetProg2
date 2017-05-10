package strutsproject1;

// An Action class to handle Requests

import org.apache.struts.action.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;

public class LoginAction extends Action 
{

  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    return mapping.findForward("success");
  }
}
