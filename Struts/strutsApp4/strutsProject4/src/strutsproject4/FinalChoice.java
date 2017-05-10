package strutsproject4;

import java.util.ArrayList;

import javax.servlet.http.*;

import org.apache.struts.action.*;  // Action, ActionForm, etc.
import org.apache.struts.actions.*; // DispatchAction

public class FinalChoice extends DispatchAction 
{

    public ActionForward delete
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {   
            String[] deletes = request.getParameterValues("crn");
            if (deletes.length > 0)
            {
                HttpSession session = request.getSession(true);
                RegistrationDataBean data;
                data = (RegistrationDataBean)session.getAttribute("data");
                for (int i = 0; i < deletes.length; i++) 
                {
                    data.setDeleteCRN(Integer.parseInt(deletes[i]));
                }
            }
            return (mapping.findForward("see"));  
    }

    public ActionForward register
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {   
            return (mapping.findForward("another"));  
    }
    
    public ActionForward complete
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {   
        HttpSession session = request.getSession(true);
        RegistrationDataBean data;
        data = (RegistrationDataBean)session.getAttribute("data"); 
        data.getRegister();
        return (mapping.findForward("complete"));  
    }
    
}