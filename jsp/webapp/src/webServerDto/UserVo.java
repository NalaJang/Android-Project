package webServerDto;

//JavaBean
public class UserVo { // JavaBean Object(VO, DTO)
	
	private String id;
	private String name;
	private String pw;
	private String email;
	private String phone;
	private String content;
	private String profilePhoto;
	private int point;
	
	public UserVo() {}
	
	
	
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", name=" + name + ", pw=" + pw + ", email=" + email + ", phone=" + phone
				+ ", content=" + content + ", profilePhoto=" + profilePhoto + ", point=" + point + "]";
	}



	public UserVo(String id, String name, String pw, String email, String phone, String content, String profilePhoto, int point) {
		
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
		this.content = content;
		this.profilePhoto = profilePhoto;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public UserVo setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public UserVo setName(String name) {
		this.name = name;
		return this;
	}

	public String getPw() {
		return pw;
	}

	public UserVo setPw(String pw) {
		this.pw = pw;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UserVo setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public UserVo setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getContent() {
		return content;
	}

	public UserVo setContent(String content) {
		this.content = content;
		return this;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public UserVo setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
		return this;
	}

	public int getPoint() {
		return point;
	}

	public UserVo setPoint(int point) {
		this.point = point;
		return this;
	}
	
	
	
	
	

}
