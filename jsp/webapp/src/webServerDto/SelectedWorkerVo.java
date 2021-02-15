package webServerDto;

public class SelectedWorkerVo {

	private int num;
	private String id;
	private int workerNum;
	private String userName;
	private String workerId;
	private String content;
	private String profilePhoto;
	private String result;
	
	
	@Override
	public String toString() {
		return "SelectedWorkerVo [num=" + num + ", id=" + id + ", workerNum=" + workerNum + ", userName=" + userName
				+ ", workerId=" + workerId + ", content=" + content + ", profilePhoto=" + profilePhoto + ", result="
				+ result + "]";
	}


	public SelectedWorkerVo() {}


	public SelectedWorkerVo(int num, String id, int workerNum, String userName, String workerId,
			String content, String profilePhoto, String result) {
		super();
		this.num = num;
		this.id = id;
		this.workerNum = workerNum;
		this.userName = userName;
		this.workerId = workerId;
		this.content = content;
		this.profilePhoto = profilePhoto;
		this.result = result;
	}

	public int getNum() {
		return num;
	}

	public SelectedWorkerVo setNum(int num) {
		this.num = num;
		return this;
	}

	public String getId() {
		return id;
	}

	public SelectedWorkerVo setId(String id) {
		this.id = id;
		return this;
	}

	public int getWorkerNum() {
		return workerNum;
	}

	public SelectedWorkerVo setWorkerNum(int workerNum) {
		this.workerNum = workerNum;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public SelectedWorkerVo setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getWorkerId() {
		return workerId;
	}

	public SelectedWorkerVo setWorkerId(String workerId) {
		this.workerId = workerId;
		return this;
	}

	public String getContent() {
		return content;
	}

	public SelectedWorkerVo setContent(String content) {
		this.content = content;
		return this;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public SelectedWorkerVo setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
		return this;
	}

	public String getResult() {
		return result;
	}

	public SelectedWorkerVo setResult(String result) {
		this.result = result;
		return this;
	}


	
}
