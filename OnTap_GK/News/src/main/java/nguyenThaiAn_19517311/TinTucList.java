package nguyenThaiAn_19517311;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class TinTucList {
	private DataSource datasource;

	public TinTucList(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	public List<TinTuc> getTinTuc() throws Exception {
		List<TinTuc> tintuc = new ArrayList<>();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
//			1. get Connection
			myConn = datasource.getConnection();
			// 2. create sql
			String sql = "Select * from TinTuc";
			myStmt = myConn.createStatement();
			// 3. Excute
			myRs = myStmt.executeQuery(sql);
			while (myRs.next()) {
				String maTT = myRs.getString("maTT");
				String tieuDe = myRs.getString("tieuDe");
				String noiDungTT = myRs.getString("noiDungTT");
				String lienKet = myRs.getString("lienKet");
				String maDM = myRs.getString("maDM");
				TinTuc tinTuc = new TinTuc(maTT, tieuDe, noiDungTT, lienKet, maDM);
				tintuc.add(tinTuc);

			}

		} finally {
			close(myConn, myStmt, myRs);
		}

		return tintuc;

	}

	private void close(Connection myCon, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myCon != null) {
				myCon.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addTinTuc(TinTuc tinTuc) throws Exception {
		Connection myConn = null;
		PreparedStatement myStm = null;
		try {
			// 1. get Connection
			myConn = datasource.getConnection();
			// 2. Create Statement
			String sql = "insert into TinTuc " + "(tieuDe, noiDungTT, lienKet, maDM) " + "values (?,?,?,?)";
			myStm = myConn.prepareStatement(sql);
			myStm.setString(1, tinTuc.getTieuDe());
			myStm.setString(2, tinTuc.getNoiDungTT());
			myStm.setString(3, tinTuc.getLienKet());
			myStm.setString(4, tinTuc.getMaDM());
			myStm.execute();

		} finally {
			// TODO: handle finally clause
			close(myConn, myStm, null);
		}

	}

	public void deleteTinTuc(String tinTucId) throws Exception {
		Connection myConn = null;
		PreparedStatement myStm = null;
		try {
			// 1. Lấy kết nối đến cơ sở dữ liệu
			myConn = datasource.getConnection();

			// 2. Tạo câu lệnh SQL để xóa tin tức dựa trên ID
			String sql = "DELETE FROM TinTuc WHERE maTT=?";

			// 3. Tạo PreparedStatement và thiết lập giá trị tham số
			myStm = myConn.prepareStatement(sql);
			myStm.setString(1, tinTucId);

			// 4. Thực hiện lệnh xóa
			myStm.executeUpdate();
		} finally {
			// Đóng tài nguyên kết nối
			close(myConn, myStm, null);
		}

	}

	public TinTuc getTinTucID(String tintucID) throws Exception {
		Connection myCon = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		TinTuc theNew = null;
		int id = Integer.parseInt(tintucID);
		try {
			myCon = datasource.getConnection();
			String sql = "select * from TinTuc where maTT=?";
			myStmt = myCon.prepareStatement(sql);
			myStmt.setInt(1, id);

			myRs = myStmt.executeQuery();
			if (myRs.next()) {
				String maTT = myRs.getString("maTT");
				String tieuDe = myRs.getString("tieuDe");
				String noiDungTT = myRs.getString("noiDungTT");
				String lienKet = myRs.getString("lienKet");
				String maDM = myRs.getString("maDM");
				theNew = new TinTuc(maTT, tieuDe, noiDungTT, lienKet, maDM);

			} else {
				throw new Exception("Could not find id " + tintucID);
			}
			return theNew;

		} finally {
			close(myCon, myStmt, myRs);
		}

	}

}
