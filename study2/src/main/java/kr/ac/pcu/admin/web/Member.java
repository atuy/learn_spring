package kr.ac.pcu.admin.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Member {

	// 맴버변수는 낙타식 표기법 
	@NotBlank(message="아이디는 필수입니다.")
	@Size(min=4, max=20, message="아이디는 4글자 이상 20글자 이하입니다.")
	private String id = "";
	
	@NotBlank(message="이름은  필수입니다.")
	@Min(value=2, message="2글자 이상 입력하세요")
	private String name = "";
	private int point;
	
	@Pattern(regexp="\\d{4}-\\d{2}-\\d{2}", message="생년월일은 yyyy-mm-dd 형식 ")
	private String birth = "";
	private String tel = "";
	private String address = "";
	private String localeCd = "";
	private String regDate = "";
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocaleCd() {
		return localeCd;
	}
	public void setLocaleCd(String localeCd) {
		this.localeCd = localeCd;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
