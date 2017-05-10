package strutsproject5;

import javax.servlet.http.*;

import org.apache.struts.action.*;  // Action, ActionForm, etc.
import org.apache.struts.actions.*; // DispatchAction

public class NextChoice extends DispatchAction 
{

    public ActionForward more
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {   
            return (mapping.findForward("another"));  
    }

    public ActionForward see
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {   
            return (mapping.findForward("see"));  
    }
    
}