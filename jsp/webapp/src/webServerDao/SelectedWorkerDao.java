package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.SelectedWorkerVo;

@Component("selectedWorkerDao")
public class SelectedWorkerDao {
	
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	
	//----------------------------------------------------------------
	//						선택한 코디네이터 목록
	//----------------------------------------------------------------
	public ArrayList<SelectedWorkerVo> selectedWorkerList(String id) throws Exception {

		conn = ds.getConnection();
		
		ArrayList<SelectedWorkerVo> selectedWorkerList = new ArrayList<>();
//		String sql = "SELECT * FROM selectedcounselorlist WHERE id= ?";
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM selectedCounselorList_view WHERE ID=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SelectedWorkerVo worker = new SelectedWorkerVo();
				
				worker.setNum(rs.getInt("no"));
				worker.setId(rs.getString("id"));
				worker.setWorkerId(rs.getString("workerId"));
				worker.setContent(rs.getString("content"));
				
				selectedWorkerList.add(worker);
			}
			
			
		} catch (SQLException e) {
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
		return selectedWorkerList;
		
	}
	
	//----------------------------------------------------------------
	//							회원  확인
	//----------------------------------------------------------------
	public SelectedWorkerVo exist(String id, String workerId) throws Exception {
		conn = ds.getConnection();
		
		try {
			
			pstmt = conn.prepareStatement("SELECT workerId FROM selectedCounselorList WHERE ID=? AND workerId=?");
			pstmt.setString(1, id);
			pstmt.setString(2, workerId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				SelectedWorkerVo worker = new SelectedWorkerVo().setWorkerId(rs.getString("workerId"));

				return worker;
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
	//							코디네이터 등록하기
	//----------------------------------------------------------------
	public int selectWorker(String id, int workerNum, String workerId) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO selectedCounselorList(ID, WORKERNUM, WORKERID) VALUES(?,?,?)");
			pstmt.setString(1, id);
			pstmt.setInt(2, workerNum);
			pstmt.setString(3, workerId);
			
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
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
	//						      코디네이터 삭제
	//----------------------------------------------------------------
	public int workerDelete(int num) throws Exception {
		conn = ds.getConnection();
		
		int flag = 0;
		
		try {
			pstmt = conn.prepareStatement("DELETE FROM selectedCounselorList WHERE NO =?");
			pstmt.setInt(1, num);
			
			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
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
		return flag;
	}
}
