package webServerDto;

public class AddressVo {

	private int no;
	private String name;
	private String userName;
	private String id;
	private String phone;
	private String zip_num;
	private String address1;
	private String address2;
	private String result;
	
	
	
	@Override
	public String toString() {
		return "AddressVo [no=" + no + ", name=" + name + ", userName=" + userName + ", id=" + id + ", phone=" + phone
				+ ", zip_num=" + zip_num + ", address1=" + address1 + ", address2=" + address2 + ", result=" + result
				+ "]";
	}

	public AddressVo() {}
	
	public AddressVo(int no, String name, String userName, String id, String phone, String zip_num, String address1,
			String address2, String result) {
		super();
		this.no = no;
		this.name = name;
		this.userName = userName;
		this.id = id;
		this.phone = phone;
		this.zip_num = zip_num;
		this.address1 = address1;
		this.address2 = address2;
		this.result = result;
	}

	
	
	public int getNo() {
		return no;
	}

	public AddressVo setNo(int no) {
		this.no = no;
		return this;
	}

	public String getName() {
		return name;
	}

	public AddressVo setName(String name) {
		this.name = name;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public AddressVo setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getId() {
		return id;
	}

	public AddressVo setId(String id) {
		this.id = id;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public AddressVo setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getZip_num() {
		return zip_num;
	}

	public AddressVo setZip_num(String zip_num) {
		this.zip_num = zip_num;
		return this;
	}

	public String getAddress1() {
		return address1;
	}

	public AddressVo setAddress1(String address1) {
		this.address1 = address1;
		return this;
	}

	public String getAddress2() {
		return address2;
	}

	public AddressVo setAddress2(String address2) {
		this.address2 = address2;
		return this;
	}

	public String getResult() {
		return result;
	}

	public AddressVo setResult(String result) {
		this.result = result;
		return this;
	}
	
	
	
	
}
