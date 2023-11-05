package com.fit.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class CartServlet
 */
@WebServlet(name = "ShoppingCartServlet", urlPatterns = { "/products", "/viewProductDetails", "/addToCart",
"/viewCart" })
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CART_ATTRIBUTE = "cart";

	private List<Product> products = new ArrayList<>();
	private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {
		products.add(new Product(1, "Áo Thun", BigDecimal.valueOf(120.250)));
		products.add(new Product(2, "Áo Sơ mi", BigDecimal.valueOf(399.900)));
		products.add(new Product(3, "Quần Short", BigDecimal.valueOf(229.390)));
		products.add(new Product(4, "Quần Dài", BigDecimal.valueOf(392.550)));
		products.add(new Product(5, "Quần Kaki", BigDecimal.valueOf(692.550)));
		products.add(new Product(6, "Áo Dài", BigDecimal.valueOf(492.550)));
		products.add(new Product(7, "Áo Khoác", BigDecimal.valueOf(792.550)));
	}

	public CartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String uri = request.getRequestURI();
		if (uri.endsWith("/products")) {
			sendProductList(response);
		} else if (uri.endsWith("/viewProductDetails")) {
			sendProductDetails(request, response);
		} else if (uri.endsWith("viewCart")) {
			showCart(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		// add to cart
		int productId = 0;
		int quantity = 0;
		try {
			productId = Integer.parseInt(request.getParameter("id"));
			quantity = Integer.parseInt(request.getParameter("quantity"));
		} catch (NumberFormatException e) {
		}

		Product product = getProduct(productId);
		if (product != null && quantity >= 0) {
			ListProduct listProduct = new ListProduct(product, quantity, quantity);
			HttpSession session = request.getSession();
			List<ListProduct> cart = (List<ListProduct>) session.getAttribute(CART_ATTRIBUTE);
			if (cart == null) {
				cart = new ArrayList<ListProduct>();
				session.setAttribute(CART_ATTRIBUTE, cart);
			}
			cart.add(listProduct);
		}
		sendProductList(response);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

	private void sendProductList(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>" + "<html><head><title>San pham</title>" + "</head><body><h2>San Pham</h2>");
		writer.println("<ul>");
		for (Product product : products) {
			writer.println("<li>" + product.getProductName() + "(" + currencyFormat.format(product.getPride()) + ") ("
					+ "<a href='viewProductDetails?id=" + product.getId() + "'>Chi tiet san pham</a>)");
		}
		writer.println("</ul>");
		writer.println("<a href='viewCart'>View Cart</a>");
		writer.println("</body></html>");

	}

	private Product getProduct(int productId) {
		for (Product product : products) {
			if (product.getId() == productId) {
				return product;
			}
		}
		return null;
	}

	private void sendProductDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int productId = 0;
		try {
			productId = Integer.parseInt(request.getParameter("id"));
		} catch (NumberFormatException e) {
		}
		Product product = getProduct(productId);

		if (product != null) {
			writer.println("<html><head>" + "<title>Chi Tiet San Pham</title></head>" + "<body><h2>Chi Tiet San Pham</h2>"
					+ "<form method='post' action='addToCart'>");
			writer.println("<input type='hidden' name='id' " + "value='" + productId + "'/>");
			writer.println("<table>");
			writer.println("<tr><td>Ten san pham:</td><td>" + product.getProductName() + "</td></tr>");
			writer.println("<tr>" + "<tr>" + "<td><input name='quantity'/></td>"
					+ "<td><input type='submit' value='Mua'/>" + "</td>" + "</tr>");
			writer.println("<tr><td colspan='2'>" + "<a href='products'>Danh Sach San Pham</a>" + "</td></tr>");
			writer.println("</table>");
			writer.println("</form></body>");
		} else {
			writer.println("Khong tim thay san pham");
		}
	}
	

	private void showCart(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>" + "<html><head><title>Gio Hang</title>"
				+ "<style>table, td {border:1px solid green;}</style>" + "</head>");
		writer.println("<body><a href='products'>" + "Product List</a>");
		HttpSession session = request.getSession();
		List<ListProduct> cart = (List<ListProduct>) session.getAttribute(CART_ATTRIBUTE);
		if (cart != null) {
			writer.println("<table>");
			writer.println("<tr><td style='width:150px'>Quantity" + "</td>" + "<td style='width:150px'>San Pham</td>"
					+ "<td style='width:150px'>Gia Tien</td>" + "<td>Gia Tien</td>" + "<td>Tac vu</td>");
			BigDecimal total = BigDecimal.ZERO;
			for (ListProduct listProduct : cart) {
				Product product = listProduct.getProduct();
				int quantity = listProduct.getQuantity();
				if (quantity != 0) {
					BigDecimal price = product.getPride();
					writer.println("<tr>");
					writer.println("<td>" + quantity + "</td>");
					writer.println("<td>" + product.getProductName() + "</td>");
					writer.println("<td>" + currencyFormat.format(price) + "</td>");
					writer.println("<td><input type='button' value='Xoa' onclick='deleteFunction''/>" + "</td>");
					BigDecimal subtotal = price.multiply(BigDecimal.valueOf(quantity));

					writer.println("<td>" + currencyFormat.format(subtotal) + "</td>");
					total = total.add(subtotal);
					writer.println("</tr>");
				}
			}
			writer.println("<tr><td colspan='4' " + "style='text-align:right'>" + "Tong tien:"
					+ currencyFormat.format(total) + "</td></tr>");
			writer.println("</table>");
		}
		writer.println("</table></body></html>");
	}

}
