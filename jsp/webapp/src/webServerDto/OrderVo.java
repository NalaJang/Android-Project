package webServerDto;

import java.sql.Timestamp;

public class OrderVo {

	private int oseq;
	private String id;
	private Timestamp indate;
	private int pseq;
	private int quantity;
	private String uname; //주문자이름
	private String phone;
	private String zip_num;
	private String address1;
	private String address2;
	private String pname;
	private int price2;
	private String image;
	private String content;
	private String result;
	
	
	
	@Override
	public String toString() {
		return "OrderVo [oseq=" + oseq + ", id=" + id + ", indate=" + indate + ", pseq=" + pseq + ", quantity="
				+ quantity + ", uname=" + uname + ", phone=" + phone + ", zip_num=" + zip_num + ", address1=" + address1
				+ ", address2=" + address2 + ", pname=" + pname + ", price2=" + price2 + ", image=" + image
				+ ", content=" + content + ", result=" + result + "]";
	}


	public OrderVo() {}

	
	public OrderVo(int oseq, String id, Timestamp indate, int pseq, int quantity, String uname, String phone,
			String zip_num, String address1, String address2, String pname, int price2, String image, String content, String result) {
		super();
		this.oseq = oseq;
		this.id = id;
		this.indate = indate;
		this.pseq = pseq;
		this.quantity = quantity;
		this.uname = uname;
		this.phone = phone;
		this.zip_num = zip_num;
		this.address1 = address1;
		this.address2 = address2;
		this.pname = pname;
		this.price2 = price2;
		this.image = image;
		this.content = content;
		this.result = result;
	}


	public int getOseq() {
		return oseq;
	}

	public OrderVo setOseq(int oseq) {
		this.oseq = oseq;
		return this;
	}

	public String getId() {
		return id;
	}

	public OrderVo setId(String id) {
		this.id = id;
		return this;
	}

	public Timestamp getIndate() {
		return indate;
	}

	public OrderVo setIndate(Timestamp indate) {
		this.indate = indate;
		return this;
	}

	public int getPseq() {
		return pseq;
	}

	public OrderVo setPseq(int pseq) {
		this.pseq = pseq;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public OrderVo setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getUname() {
		return uname;
	}

	public OrderVo setUname(String uname) {
		this.uname = uname;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public OrderVo setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getZip_num() {
		return zip_num;
	}


	public OrderVo setZip_num(String zip_num) {
		this.zip_num = zip_num;
		return this;
	}


	public String getAddress1() {
		return address1;
	}

	public OrderVo setAddress1(String address1) {
		this.address1 = address1;
		return this;
	}

	public String getAddress2() {
		return address2;
	}

	public OrderVo setAddress2(String address2) {
		this.address2 = address2;
		return this;
	}

	public String getPname() {
		return pname;
	}

	public OrderVo setPname(String pname) {
		this.pname = pname;
		return this;
	}

	public int getPrice2() {
		return price2;
	}

	public OrderVo setPrice2(int price2) {
		this.price2 = price2;
		return this;
	}

	public String getImage() {
		return image;
	}

	public OrderVo setImage(String image) {
		this.image = image;
		return this;
	}
	

	public String getContent() {
		return content;
	}


	public OrderVo setContent(String content) {
		this.content = content;
		return this;
	}


	public String getResult() {
		return result;
	}

	public OrderVo setResult(String result) {
		this.result = result;
		return this;
	}
	
	
	
}
