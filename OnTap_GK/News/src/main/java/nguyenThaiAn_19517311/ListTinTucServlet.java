package nguyenThaiAn_19517311;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;




/**
 * Servlet implementation class ListTinTucServlet
 */
@WebServlet("/ListTinTucServlet")
public class ListTinTucServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TinTucList tinTucList;
	@Resource(name = "jdbc/New")
	private DataSource dataSource;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		// create our student db util ... and pass in the conn pool / datasource
		try {
			tinTucList = new TinTucList(dataSource);
		} catch (Exception exc) {
			throw new ServletException(exc);
		}

	}
	
    public ListTinTucServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			// route to the appropriate method
			switch (theCommand) {
			case "LIST":
				listTinTuc(request, response);
				break;
			case "ADD":
				addTinTuc(request, response);
				break;
			case "DELETE":
				doDelete(request, response);
				break;
			default:
				throw new IllegalArgumentException("Unexpectedd value : " + theCommand);
			}
		} catch (Exception e) {
			throw new ServletException(e);
			// TODO: handle exception
		}

	}
	protected void listTinTuc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<TinTuc> tinTucs = tinTucList.getTinTuc();
		request.setAttribute("TINTUC_LIST", tinTucs);
		RequestDispatcher dispathcher = request.getRequestDispatcher("/listTT.jsp");
		dispathcher.forward(request, response);

	}
	
	protected void addTinTuc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String tieuDe = request.getParameter("tieuDe");
		String noiDungTT = request.getParameter("noiDungTT");
		String lienKet = request.getParameter("lienKet");
		String maDM = request.getParameter("maDM");
		TinTuc newTinTuc = new TinTuc(tieuDe, noiDungTT, lienKet, maDM);
		tinTucList.addTinTuc(newTinTuc);
		listTinTuc(request, response);
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String tinTucId = request.getParameter("tinTucId");

	    try {
	        tinTucList.deleteTinTuc(tinTucId);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    try {
			listTinTuc(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
