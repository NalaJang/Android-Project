package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import hotelDto.HotelMemberVo;
import projectControls.Component;
import webServerDto.UserVo;

@Component("userDao")
public class UserDao{
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	//----------------------------------------------------------------
	//							회원 가입
	//----------------------------------------------------------------
	
	public int insert(UserVo userVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO userList(ID, NAME, PW, EMAIL, PHONE, POINT) VALUES(?,?,?,?,?,?)");
			pstmt.setString(1, userVo.getId());
			pstmt.setString(2, userVo.getName());
			pstmt.setString(3, userVo.getPw());
			pstmt.setString(4, userVo.getEmail());
			pstmt.setString(5, userVo.getPhone());
			pstmt.setInt(6, 3000);
			
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
	//							회원 정보 확인
	//----------------------------------------------------------------
	public UserVo exist(String id, String pw) throws Exception {
		conn = ds.getConnection();
		
		try {
			
//			pstmt = conn.prepareStatement("SELECT * FROM HOTELMEMBER WHERE EMAIL=? AND PW=? AND USEYN LIKE '%"+ useyn +"%'");
			pstmt = conn.prepareStatement("SELECT * FROM userList WHERE ID=? AND PW=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				UserVo userVo = new UserVo().setId(rs.getString("id"))
						.setName(rs.getString("name"))
						.setPw(rs.getString("pw"))
						.setEmail(rs.getString("email"))
						.setPhone(rs.getString("phone"))
						.setContent(rs.getString("content"))
					    .setProfilePhoto(rs.getString("profilePhoto"))
					    .setPoint(rs.getInt("point"));

				return userVo;
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
	//						   회원 아이디 찾기
	//----------------------------------------------------------------
	public UserVo findId(String name, String phone) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT ID FROM USERLIST WHERE NAME =? AND PHONE =?");
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				UserVo userVo = new UserVo().setId(rs.getString("id"));
				
				return userVo;
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
	//						   회원 비밀번호 찾기
	//----------------------------------------------------------------
	public UserVo findPw(String id, String phone) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT PW FROM USERLIST WHERE ID =? AND PHONE =?");
			pstmt.setString(1, id);
			pstmt.setString(2, phone);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				UserVo userVo = new UserVo().setPw(rs.getString("pw"));
				
				return userVo;
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
	//							회원 선택
	//----------------------------------------------------------------
	public UserVo selectOne(String id) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM USERLIST WHERE ID=? ");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new UserVo().setId(rs.getString("id"))
										.setName(rs.getString("name"))
										.setPw(rs.getString("pw"))
										.setEmail(rs.getString("email"))
										.setPhone(rs.getString("phone"))
										.setContent(rs.getString("content"))
										.setProfilePhoto(rs.getString("profilePhoto"))
										.setPoint(rs.getInt("point"));
									   
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
	//						회원 정보 업데이트
	//----------------------------------------------------------------
	public int update(UserVo userVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("UPDATE USERLIST SET CONTENT=?, PW=?, EMAIL=?, PHONE=?, PROFILEPHOTO=? WHERE ID=?");
			pstmt.setString(1, userVo.getContent());
			pstmt.setString(2, userVo.getPw());
			pstmt.setString(3, userVo.getEmail());
			pstmt.setString(4, userVo.getPhone());
			pstmt.setString(5, userVo.getProfilePhoto());
			pstmt.setString(6, userVo.getId());
			
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
	//							회원 탈퇴
	//----------------------------------------------------------------
	public int useynUpdate(HotelMemberVo hotelMemberVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("UPDATE HOTELMEMBER SET USEYN='n' WHERE NO=?");
			pstmt.setInt(1, hotelMemberVo.getNo());
			
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
	
}
