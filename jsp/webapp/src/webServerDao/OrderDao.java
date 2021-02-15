package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.OrderVo;

@Component("orderDao")
public class OrderDao {

	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	
	//----------------------------------------------------------------
	//							주문 추가
	//----------------------------------------------------------------
	public int addOrder(String email) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		conn = ds.getConnection();
		
		try {			
			pstmt = conn.prepareStatement("INSERT INTO ORDERS(EMAIL) VALUES(?)");
			pstmt.setString(1, email);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
	//----------------------------------------------------------------
	//							주문 추가(바로 구매)
	//----------------------------------------------------------------
	public int addOrder_direct(String email) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO ORDERS(EMAIL) VALUES(?)");
			pstmt.setString(1, email);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	//----------------------------------------------------------------
	//							주문 번호 가져오기
	//----------------------------------------------------------------
	public int getOseq(String email) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		conn = ds.getConnection();
		
		int oseq = 0;
		try {
			pstmt = conn.prepareStatement("SELECT OSEQ FROM ORDERS WHERE EMAIL=?");
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getInt("oseq") > oseq) {	//max 값(최근주문) 가져오기
					oseq = rs.getInt("oseq");
				}
			}
			
			return oseq;
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	//----------------------------------------------------------------
	//						주문 후 장바구니 주문상품 없애기
	//----------------------------------------------------------------
	public int newUpdateCart(String email, List<Integer> pseq) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		conn = ds.getConnection();
		
		try {
			
			for(int i = 0; i<pseq.size(); i++) {
				pstmt = conn.prepareStatement("UPDATE CART SET RESULT = 2 WHERE EMAIL =? AND PSEQ=?");
				
				pstmt.setString(1, email);
				pstmt.setInt(2, pseq.get(i));
				
				return pstmt.executeUpdate();
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return -1;
	}

	//----------------------------------------------------------------
	//							주문 내역
	//----------------------------------------------------------------
	public ArrayList<OrderVo> orderList(String id) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		conn = ds.getConnection();
		
		ArrayList<OrderVo> orderList = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM ORDER_VIEW WHERE ID=? order by oseq desc");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
			while (rs.next()) { // 주문수가 다수라서 while 로
				OrderVo orderVo = new OrderVo();
				orderVo.setOseq(rs.getInt("oseq"));
				orderVo.setId(rs.getString("id"));
				orderVo.setIndate(rs.getTimestamp("indate"));
				orderVo.setPseq(rs.getInt("pseq"));
				orderVo.setQuantity(rs.getInt("quantity"));
				orderVo.setUname(rs.getString("uname"));
				orderVo.setPhone(rs.getString("phone"));
//				orderVo.setZip_num(rs.getString("zip_num"));
//				orderVo.setAddress1(rs.getString("address1"));
//				orderVo.setAddress2(rs.getString("address2"));
				orderVo.setPname(rs.getString("pname"));
				orderVo.setPrice2(rs.getInt("price2"));
				orderVo.setImage(rs.getString("image1"));
				orderVo.setContent(rs.getString("content"));
				orderVo.setResult(rs.getString("result"));
				
				orderList.add(orderVo);
				
			}
			
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		
		return orderList;
	}

	//----------------------------------------------------------------
	//							주문 상세내역
	//----------------------------------------------------------------
	public int newOrder_detail(int oseq, List<Integer> pseq, List<Integer> quantity) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		conn = ds.getConnection();
		
		try {
			for(int i = 0; i<pseq.size(); i++) {
				pstmt = conn.prepareStatement("INSERT INTO ORDER_DETAIL(OSEQ, PSEQ, QUANTITY) VALUES(?,?,?)");
				pstmt.setInt(1, oseq); //고유의 주문번호 이기 때문에 get(i) X
				pstmt.setInt(2, pseq.get(i));
				pstmt.setInt(3, quantity.get(i));
			
				return pstmt.executeUpdate();
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return -1;
	}
	
	
	
	//----------------------------------------------------------------
	//						   주문현황 업데이트
	//----------------------------------------------------------------
	public int updateResult(int oseq) throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = null;
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("UPDATE ORDER_DETAIL SET RESULT =2 WHERE OSEQ =?");
			pstmt.setInt(1, oseq);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

}
