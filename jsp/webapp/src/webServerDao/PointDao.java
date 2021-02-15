package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.PointVo;

@Component("pointDao")
public class PointDao {
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	
	//----------------------------------------------------------------
	//						      포인트 목록
	//----------------------------------------------------------------
	public ArrayList<PointVo> pointList(String id) throws Exception {
		
		ArrayList<PointVo> pointList = new ArrayList<>();
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM POINT_VIEW WHERE ID=? ORDER BY INDATE DESC");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PointVo pointVo = new PointVo();
				pointVo.setId(rs.getString("id"));
				pointVo.setPseq(rs.getInt("pseq"));
				pointVo.setIndate(rs.getTimestamp("indate"));
				pointVo.setPname(rs.getString("pname"));
				pointVo.setPoint(rs.getInt("point"));
				
				pointList.add(pointVo);
			}
			
		}catch(SQLException e) {
			System.out.println("DB 에러");
			throw e;
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				
			}
		}
		return pointList;
	}

}
