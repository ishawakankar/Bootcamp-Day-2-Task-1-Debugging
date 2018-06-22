package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hpt150030.utilities.STATUS_TYPE;
import com.hpt150030.utilities.Constants;

public final class BorrowerManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            boolean hasStatus = false;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Borrower Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            if (request.getAttribute(Constants.HAS_STATUS) != null) {
                if ((Boolean) request.getAttribute(Constants.HAS_STATUS) == true) {
                    hasStatus = true;
                }
            } else {
                hasStatus = false;
            }
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">Library Management System</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"SearchBookController\">Search</a></li>\n");
      out.write("                        <li><a href=\"BookLoanController\">Loan</a></li>\n");
      out.write("                        <li><a href=\"FineTrackingController\">Fines</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Borrowers</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\">Add new borrower</div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <form class=\"form-horizontal\" role=\"form\" action=\"");
      out.print(request.getContextPath());
      out.write("/NewBorrowerController\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_FNAME);
      out.write("\">First Name:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_FNAME);
      out.write("\" placeholder=\"Enter first name\" \n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_FNAME) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_FNAME));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_LNAME);
      out.write("\">Last Name:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_LNAME);
      out.write("\" placeholder=\"Enter last name\"\n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_LNAME) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_LNAME));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_EMAIL);
      out.write("\">Email:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_EMAIL);
      out.write("\" placeholder=\"Enter email\"\n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_EMAIL) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_EMAIL));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_ADDRESS);
      out.write("\">Address:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_ADDRESS);
      out.write("\" placeholder=\"Enter address\"\n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_ADDRESS) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_ADDRESS));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_CITY);
      out.write("\">City:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_CITY);
      out.write("\" placeholder=\"Enter city\"\n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_CITY) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_CITY));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_STATE);
      out.write("\">State:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_STATE);
      out.write("\" placeholder=\"Enter state\"\n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_STATE) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_STATE));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" for=\"");
      out.print(Constants.NEW_BORROWER_REQ_PHONE);
      out.write("\">Phone no:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"");
      out.print( Constants.NEW_BORROWER_REQ_PHONE);
      out.write("\" placeholder=\"Enter phone number\"\n");
      out.write("                                   value=\"");
 if (request.getParameter(Constants.NEW_BORROWER_REQ_PHONE) != null) {
                                           out.println(request.getParameter(Constants.NEW_BORROWER_REQ_PHONE));
                                       }
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                ");
 if (hasStatus) {
      out.write("\n");
      out.write("                <h5>\n");
      out.write("                    ");
 if (request.getAttribute(Constants.STATUS_TYPE) == STATUS_TYPE.ERROR) {
                    
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                        <strong>\n");
      out.write("                            ");
      out.print( request.getAttribute(Constants.STATUS_BODY));
      out.write("\n");
      out.write("                        </strong>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } else if (request.getAttribute(Constants.STATUS_TYPE) == STATUS_TYPE.WARNING) {
                    
      out.write("\n");
      out.write("                    <div class=\"alert alert-info\" role=\"alert\">\n");
      out.write("                        <strong>\n");
      out.write("                            ");
      out.print( request.getAttribute(Constants.STATUS_BODY));
      out.write("\n");
      out.write("                        </strong>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } else if (request.getAttribute(Constants.STATUS_TYPE) == STATUS_TYPE.SUCCESS) {
                    
      out.write("\n");
      out.write("                    <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                        <strong>\n");
      out.write("                            ");
      out.print( request.getAttribute(Constants.STATUS_BODY));
      out.write("\n");
      out.write("                        </strong>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </h5>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
