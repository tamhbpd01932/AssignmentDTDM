package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DanhMucDAO;

public final class danhmuc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
 DanhMucDAO dmd = new DanhMucDAO(); 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Aditii</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Morris Charts CSS -->\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">Aditii Shop</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Top Menu Items -->\n");
      out.write("                <ul class=\"nav navbar-right top-nav\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu message-dropdown\">\n");
      out.write("                            <li class=\"message-preview\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"media\">\n");
      out.write("                                        <span class=\"pull-left\">\n");
      out.write("                                            <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"media-body\">\n");
      out.write("                                            <h5 class=\"media-heading\"><strong>Admin</strong>\n");
      out.write("                                            </h5>\n");
      out.write("                                            <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"message-preview\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"media\">\n");
      out.write("                                        <span class=\"pull-left\">\n");
      out.write("                                            <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"media-body\">\n");
      out.write("                                            <h5 class=\"media-heading\"><strong>John Smith</strong>\n");
      out.write("                                            </h5>\n");
      out.write("                                            <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"message-preview\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div class=\"media\">\n");
      out.write("                                        <span class=\"pull-left\">\n");
      out.write("                                            <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"media-body\">\n");
      out.write("                                            <h5 class=\"media-heading\"><strong>John Smith</strong>\n");
      out.write("                                            </h5>\n");
      out.write("                                            <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"message-footer\">\n");
      out.write("                                <a href=\"#\">Read All New Messages</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu alert-dropdown\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Alert Name <span class=\"label label-default\">Alert Badge</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Alert Name <span class=\"label label-primary\">Alert Badge</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Alert Name <span class=\"label label-success\">Alert Badge</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Alert Name <span class=\"label label-info\">Alert Badge</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Alert Name <span class=\"label label-warning\">Alert Badge</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Alert Name <span class=\"label label-danger\">Alert Badge</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">View All</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> John Smith <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Inbox</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"LogoutServlet\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"sanpham.jsp\"><i class=\"fa fa-fw fa-dashboard\"></i>SẢN PHẨM</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"danhmuc.jsp\"><i class=\"fa fa-fw fa-bar-chart-o\"></i> DANH MỤC</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"tables.html\"><i class=\"fa fa-fw fa-table\"></i> KHÁCH HÀNG</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"forms.html\"><i class=\"fa fa-fw fa-edit\"></i> GIỎ HÀNG</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <h1>DANH MỤC</h1>\n");
      out.write("                    <form action=\"DanhMucServlet\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">Mã Danh Mục:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter name\" name=\"idDanhMuc\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">Tên Danh Mục:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter name\" name=\"tenDanhMuc\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\" name=\"action\" value=\"add\">Add</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\" name=\"action\" value=\"update\">Update</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Tên Danh Mục</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 for (int i = 0; i < dmd.getAllDanhMuc().size(); i++) {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( dmd.getAllDanhMuc().get(i).getId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( dmd.getAllDanhMuc().get(i).getName());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                <td><a href=\"");
      out.print("DanhMucServlet?action=edit&id=" + dmd.getAllDanhMuc().get(i).getId() );
      out.write("\" >EDIT</a>|<a href=\"");
      out.print("DanhMucServlet?action=del&id=" + dmd.getAllDanhMuc().get(i).getId() );
      out.write("\" >DEL</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery Version 1.11.0 -->\n");
      out.write("    <script src=\"js/jquery-1.11.0.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Morris Charts JavaScript -->\n");
      out.write("    <script src=\"js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins/morris/morris.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins/morris/morris-data.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Flot Charts JavaScript -->\n");
      out.write("    <!--[if lte IE 8]><script src=\"js/excanvas.min.js\"></script><![endif]-->\n");
      out.write("    <script src=\"js/plugins/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"js/plugins/flot/jquery.flot.tooltip.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"js/plugins/flot/jquery.flot.pie.js\"></script>\n");
      out.write("    <script src=\"js/plugins/flot/flot-data.js\"></script>\n");
      out.write("</body>\n");
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
