package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.AddressVo;

@Component("addressDao")
public class AddressDao{
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	//----------------------------------------------------------------
	//							주소 입력
	//----------------------------------------------------------------
	
	public int insert(AddressVo addressVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO address(name, userName, id, phone, zip_num, address1, address2, result)"
					+ " VALUES(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, addressVo.getName());
			pstmt.setString(2, addressVo.getUserName());
			pstmt.setString(3, addressVo.getId());
			pstmt.setString(4, addressVo.getPhone());
			pstmt.setString(5, addressVo.getZip_num());
			pstmt.setString(6, addressVo.getAddress1());
			pstmt.setString(7, addressVo.getAddress2());
			pstmt.setString(8, addressVo.getResult());
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
	}


	//----------------------------------------------------------------
	//							주소 목록
	//----------------------------------------------------------------
	public ArrayList<AddressVo> addressList(String id) throws Exception {
		conn = ds.getConnection();
		ArrayList<AddressVo> addressList = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM address WHERE ID = ?");
			pstmt.setString(1, id);
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				addressList.add(new AddressVo().setNo(rs.getInt("no"))
												.setName(rs.getString("name"))
												.setUserName(rs.getString("userName"))
												.setId(rs.getString("id"))
												.setPhone(rs.getString("phone"))
												.setZip_num(rs.getString("zip_num"))
												.setAddress1(rs.getString("address1"))
												.setAddress2(rs.getString("address2"))
												.setResult(rs.getString("result")));

			}
			return addressList;
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
	}
	
	//----------------------------------------------------------------
	//							주소 선택
	//----------------------------------------------------------------
	public AddressVo selectOne(int no) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM address WHERE NO=? ");
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				AddressVo address = new AddressVo().setNo(rs.getInt("no"))
										.setName(rs.getString("name"))
										.setUserName(rs.getString("userName"))
										.setId(rs.getString("id"))
										.setPhone(rs.getString("phone"))
										.setZip_num(rs.getString("zip_num"))
										.setAddress1(rs.getString("address1"))
										.setAddress2(rs.getString("address2"))
										.setResult(rs.getString("result"));
				
				return address;
									   
			}
		} catch (Exception e) {
			throw e;
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return null;
	}
	
	
	//----------------------------------------------------------------
	//						주소 업데이트
	//----------------------------------------------------------------
	public int update(AddressVo addressVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("UPDATE address SET NAME=?, USERNAME=?, PHONE=?, ADDRESS1=?, ADDRESS2=?, RESULT=? WHERE NO=? AND ID=?");
			pstmt.setString(1, addressVo.getName());
			pstmt.setString(2, addressVo.getUserName());
			pstmt.setString(3, addressVo.getPhone());
			pstmt.setString(4, addressVo.getAddress1());
			pstmt.setString(5, addressVo.getAddress2());
			pstmt.setString(6, addressVo.getResult());
			pstmt.setInt(7, addressVo.getNo());
			pstmt.setString(8, addressVo.getId());
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
			
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	//----------------------------------------------------------------
	//							result 선택
	//----------------------------------------------------------------
	public AddressVo selectResult(String id) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT RESULT FROM address WHERE ID=? ");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				AddressVo address = new AddressVo().setResult(rs.getString("result"));
				
				return address;
									   
			}
		} catch (Exception e) {
			throw e;
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return null;
	}
	/*
	//----------------------------------------------------------------
	//							주소 찾기
	//----------------------------------------------------------------
	public ArrayList<AddressVo> address(String dong) throws Exception {
		ArrayList<AddressVo> address = new ArrayList<>();
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM ZIPCODE WHERE DONG LIKE '%"+ dong +"%'");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				AddressVo adVo = new AddressVo();
				adVo.setSeq(rs.getInt("seq"));
				adVo.setZipcode(rs.getString("zipcode"));
				adVo.setSido(rs.getString("sido"));
				adVo.setGugun(rs.getString("gugun"));
				adVo.setDong(rs.getString("dong"));
				adVo.setRi(rs.getString("ri"));
				adVo.setBldg(rs.getString("bldg"));
				adVo.setBunji(rs.getString("bunji"));
				address.add(adVo);
			}
			
			return address;
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
	}
	*/
	

	
	//----------------------------------------------------------------
	//						주소 삭제
	//----------------------------------------------------------------
	public int delete(int num) throws Exception {
		conn = ds.getConnection();

		try {
			pstmt = conn.prepareStatement("DELETE FROM address WHERE NO=?");
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return 0;

	}
	
}
