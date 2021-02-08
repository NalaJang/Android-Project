package webServerDto;

import java.sql.Timestamp;

public class PointVo {

	private String id;
	private int pseq;
	private Timestamp indate;
	private String pname;
	private int point;
	
	public PointVo() {}
	
	public PointVo(String id, int pseq, Timestamp indate, String pname, int point) {
		super();
		this.id = id;
		this.pseq = pseq;
		this.indate = indate;
		this.pname = pname;
		this.point = point;
	}


	public String getId() {
		return id;
	}

	public PointVo setId(String id) {
		this.id = id;
		return this;
	}

	public int getPseq() {
		return pseq;
	}

	public PointVo setPseq(int pseq) {
		this.pseq = pseq;
		return this;
	}

	public Timestamp getIndate() {
		return indate;
	}

	public PointVo setIndate(Timestamp indate) {
		this.indate = indate;
		return this;
	}

	public String getPname() {
		return pname;
	}

	public PointVo setPname(String pname) {
		this.pname = pname;
		return this;
	}

	public int getPoint() {
		return point;
	}

	public PointVo setPoint(int point) {
		this.point = point;
		return this;
	}

	
	
}
