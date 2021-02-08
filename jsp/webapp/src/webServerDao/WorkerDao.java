package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.WorkerVo;

@Component("workerDao")
public class WorkerDao{
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	//----------------------------------------------------------------
	//							직원 목록
	//----------------------------------------------------------------
	public ArrayList<WorkerVo> workerList() throws Exception {
		conn = ds.getConnection();
		ArrayList<WorkerVo> workers = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM Counselor");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				workers.add(new WorkerVo().setNum(rs.getInt("num"))
										 	.setName(rs.getString("name"))
										   .setId(rs.getString("workerId"))
										   .setPw(rs.getString("pw"))
										   .setPhone(rs.getString("phone"))
										   .setProfilePhoto(rs.getString("profilePhoto"))
										   .setContent(rs.getString("content")));

			}
			return workers;
			
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
	//							직원 확인
	//----------------------------------------------------------------
	public WorkerVo exist(String id, String pw) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM COUNSELOR WHERE WORKERID=? AND PW=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {				
			return new WorkerVo().setName(rs.getString("name"))
								.setId(rs.getString("workerId"))
								.setPw(rs.getString("pw"))
								.setPhone(rs.getString("phone"));
								 
			}
		} catch(Exception e) {
			System.out.println("DB 에러");
			throw e;
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch(Exception e) {
				
			}
		}
		return null;
	}
	
}
