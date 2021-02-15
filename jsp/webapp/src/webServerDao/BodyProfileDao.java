package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.BodyProfileVo;

@Component("bodyDao")
public class BodyProfileDao {
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	
	
	//----------------------------------------------------------------
	//							바디 프로필 등록
	//----------------------------------------------------------------
	
	public int insert(BodyProfileVo bodyVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement
					("INSERT INTO bodyProfile (id) VALUES(?)");
			
			pstmt.setString(1, bodyVo.getId());
			
			
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
	//							회원 선택
	//----------------------------------------------------------------
	public BodyProfileVo selectOne(String id) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM bodyProfile WHERE ID=? ");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new BodyProfileVo().setId(rs.getString("id"));
									   
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
	//							바디 프로필 업데이트
	//----------------------------------------------------------------
	public int update(BodyProfileVo bodyVo) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement
					("UPDATE bodyProfile SET "
							+ "shoulder=?, arm=?, bust=?, waist=?, totalUpperBody=?, "
							+ "hip=?, thigh=?, calf=?, totalLowerBody=?, "
							+ "foot=?, height=?, weight=?, indate=? WHERE ID = ?");
			
			pstmt.setString(1, bodyVo.getShoulder());
			pstmt.setString(2, bodyVo.getArm());
			pstmt.setString(3, bodyVo.getBust());
			pstmt.setString(4, bodyVo.getWaist());
			pstmt.setString(5, bodyVo.getTotalUpperBody());
			pstmt.setString(6, bodyVo.getHip());
			pstmt.setString(7, bodyVo.getThigh());
			pstmt.setString(8, bodyVo.getCalf());
			pstmt.setString(9, bodyVo.getTotalLowerBody());
			pstmt.setString(10, bodyVo.getFoot());
			pstmt.setString(11, bodyVo.getHeight());
			pstmt.setString(12, bodyVo.getWeight());
			pstmt.setString(13, bodyVo.getIndate());
			pstmt.setString(14, bodyVo.getId());
			
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
	//							바디 프로필 내역
	//----------------------------------------------------------------
	public BodyProfileVo profileList(String id) throws Exception {
		conn = ds.getConnection();
		
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM BODYPROFILE WHERE ID=?");
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				BodyProfileVo bodyVo = new BodyProfileVo().setNum(rs.getInt("num"))
										 	.setId(rs.getString("id"))
										   .setShoulder(rs.getString("shoulder"))
										   .setArm(rs.getString("arm"))
										   .setBust(rs.getString("bust"))
										   .setWaist(rs.getString("waist"))
										   .setTotalUpperBody(rs.getString("totalUpperBody"))
										   .setHip(rs.getString("hip"))
										   .setThigh(rs.getString("thigh"))
										   .setCalf(rs.getString("calf"))
										   .setTotalLowerBody(rs.getString("totalLowerBody"))
										   .setFoot(rs.getString("foot"))
										   .setHeight(rs.getString("height"))
										   .setWeight(rs.getString("weight"))
										   .setIndate(rs.getString("indate"));
				
				return bodyVo;
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
}
