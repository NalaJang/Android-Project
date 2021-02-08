package webServerDto;

public class BodyProfileVo {

	private int num;
	private String id;
	private String shoulder;
	private String arm;
	private String bust;
	private String waist;
	private String totalUpperBody;
	private String hip;
	private String thigh;
	private String calf;
	private String totalLowerBody;
	private String foot;
	private String height;
	private String weight;
	private String indate;
	
	public BodyProfileVo() {}

	public BodyProfileVo(int num, String id, String shoulder, String arm, String bust, String waist,
			String totalUpperBody, String hip, String thigh, String calf, String totalLowerBody, String foot,
			String height, String weight, String indate) {
		super();
		this.num = num;
		this.id = id;
		this.shoulder = shoulder;
		this.arm = arm;
		this.bust = bust;
		this.waist = waist;
		this.totalUpperBody = totalUpperBody;
		this.hip = hip;
		this.thigh = thigh;
		this.calf = calf;
		this.totalLowerBody = totalLowerBody;
		this.foot = foot;
		this.height = height;
		this.weight = weight;
		this.indate = indate;
	}

	public int getNum() {
		return num;
	}

	public BodyProfileVo setNum(int num) {
		this.num = num;
		return this;
	}

	public String getId() {
		return id;
	}

	public BodyProfileVo setId(String id) {
		this.id = id;
		return this;
	}

	public String getShoulder() {
		return shoulder;
	}

	public BodyProfileVo setShoulder(String shoulder) {
		this.shoulder = shoulder;
		return this;
	}

	public String getArm() {
		return arm;
	}

	public BodyProfileVo setArm(String arm) {
		this.arm = arm;
		return this;
	}

	public String getBust() {
		return bust;
	}

	public BodyProfileVo setBust(String bust) {
		this.bust = bust;
		return this;
	}

	public String getWaist() {
		return waist;
	}

	public BodyProfileVo setWaist(String waist) {
		this.waist = waist;
		return this;
	}

	public String getTotalUpperBody() {
		return totalUpperBody;
	}

	public BodyProfileVo setTotalUpperBody(String totalUpperBody) {
		this.totalUpperBody = totalUpperBody;
		return this;
	}

	public String getHip() {
		return hip;
	}

	public BodyProfileVo setHip(String hip) {
		this.hip = hip;
		return this;
	}

	public String getThigh() {
		return thigh;
	}

	public BodyProfileVo setThigh(String thigh) {
		this.thigh = thigh;
		return this;
	}

	public String getCalf() {
		return calf;
	}

	public BodyProfileVo setCalf(String calf) {
		this.calf = calf;
		return this;
	}

	public String getTotalLowerBody() {
		return totalLowerBody;
	}

	public BodyProfileVo setTotalLowerBody(String totalLowerBody) {
		this.totalLowerBody = totalLowerBody;
		return this;
	}

	public String getFoot() {
		return foot;
	}

	public BodyProfileVo setFoot(String foot) {
		this.foot = foot;
		return this;
	}

	public String getHeight() {
		return height;
	}

	public BodyProfileVo setHeight(String height) {
		this.height = height;
		return this;
	}

	public String getWeight() {
		return weight;
	}

	public BodyProfileVo setWeight(String weight) {
		this.weight = weight;
		return this;
	}

	public String getIndate() {
		return indate;
	}

	public BodyProfileVo setIndate(String indate) {
		this.indate = indate;
		return this;
	}
	
	
	
}
