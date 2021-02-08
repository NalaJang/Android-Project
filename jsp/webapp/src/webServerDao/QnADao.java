package webServerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import projectControls.Component;
import webServerDto.QnaVo;

@Component("qnaDao")
public class QnADao {
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	//----------------------------------------------------------------
	//						      문의 목록
	//----------------------------------------------------------------
	public ArrayList<QnaVo> qnaList(String id) throws Exception {
		ArrayList<QnaVo> qnaList = new ArrayList<>();
		conn = ds.getConnection();
		
		System.out.println("try 밖");
		
		try {
			
			
			pstmt = conn.prepareStatement("SELECT * FROM QNA WHERE ID=? ORDER BY NUM DESC");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			System.out.println("tes1");
			
			while(rs.next()) {
				QnaVo qnaVo = new QnaVo();
				qnaVo.setNum(rs.getInt("num"));
//				qnaVo.setId(rs.getString("id"));
				qnaVo.setEmail(rs.getString("email"));
				qnaVo.setSubject(rs.getString("subject"));
				qnaVo.setTitle(rs.getString("title"));
				qnaVo.setContent(rs.getString("content"));
				qnaVo.setIndate(rs.getTimestamp("indate"));
				qnaVo.setResult(rs.getString("result"));
				qnaList.add(qnaVo);
			}
			
			System.out.println("test2");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러");
			throw e;
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				
			}
		}
		return qnaList;
	}


	//----------------------------------------------------------------
	//							문의 등록
	//----------------------------------------------------------------
	public void insertqna(QnaVo qnaVo, String id) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO QNA (subject, title, content, id, email) VALUES(?,?,?,?,?)");
			pstmt.setString(1, qnaVo.getSubject());
			pstmt.setString(2, qnaVo.getTitle());
			pstmt.setString(3, qnaVo.getContent());
			pstmt.setString(4, id);
			pstmt.setString(5, qnaVo.getEmail());
			
			pstmt.executeUpdate();

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
	//						문의 내역 보기
	//----------------------------------------------------------------
	public QnaVo getContent(int num) throws Exception {
		conn = ds.getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM QNA WHERE NUM=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new QnaVo().setEmail(rs.getString("email"))
									.setSubject(rs.getString("subject"))
									.setTitle(rs.getString("title"))
									.setContent(rs.getString("content"))
									.setIndate(rs.getTimestamp("indate"))
									.setResult(rs.getString("result"));
						

			}
		} catch(Exception e) {
			throw e;
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				
			}
		}
		return null;
	}


}
