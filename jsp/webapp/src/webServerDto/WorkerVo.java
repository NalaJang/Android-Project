package webServerDto;

public class WorkerVo {

	private int num;
	private String name;
	private String id;
	private String pw;
	private String phone;
	private String profilePhoto;
	private String content;
	
	public WorkerVo() {}
	
	

	@Override
	public String toString() {
		return "WorkerVo [num=" + num + ", name=" + name + ", id=" + id + ", pw=" + pw + ", phone=" + phone
				+ ", profilePhoto=" + profilePhoto + ", content=" + content + "]";
	}



	public WorkerVo(int num, String name, String id, String pw, String phone, String profilePhoto, String content) {
		super();
		this.num = num;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.profilePhoto = profilePhoto;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public WorkerVo setNum(int num) {
		this.num = num;
		return this;
	}

	public String getName() {
		return name;
	}

	public WorkerVo setName(String name) {
		this.name = name;
		return this;
	}

	public String getId() {
		return id;
	}

	public WorkerVo setId(String id) {
		this.id = id;
		return this;
	}

	public String getPw() {
		return pw;
	}

	public WorkerVo setPw(String pw) {
		this.pw = pw;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public WorkerVo setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public WorkerVo setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
		return this;
	}

	public String getContent() {
		return content;
	}

	public WorkerVo setContent(String content) {
		this.content = content;
		return this;
	}
	
	
}
