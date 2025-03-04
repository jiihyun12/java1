package vo;

import java.util.Objects;

public class MemberVO {
	private Long id;
	private String memderid;
	private String memberPassword;
	private String memberName;
	private String memberAddress;
	private String memberRecommenderId;
	
	public MemberVO() {;}

	public MemberVO(Long id, String memderid, String memberPassword, String memberName, String memberAddress,
			String memberRecommenderId) {
		super();
		this.id = id;
		this.memderid = memderid;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.memberRecommenderId = memberRecommenderId;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memderid=" + memderid + ", memberPassword=" + memberPassword + ", memberName="
				+ memberName + ", memberAddress=" + memberAddress + ", memberRecommenderId=" + memberRecommenderId
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemderid() {
		return memderid;
	}

	public void setMemderid(String memderid) {
		this.memderid = memderid;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberRecommenderId() {
		return memberRecommenderId;
	}

	public void setMemberRecommenderId(String memberRecommenderId) {
		this.memberRecommenderId = memberRecommenderId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, memberAddress, memberName, memberPassword, memberRecommenderId, memderid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(memberAddress, other.memberAddress)
				&& Objects.equals(memberName, other.memberName) && Objects.equals(memberPassword, other.memberPassword)
				&& Objects.equals(memberRecommenderId, other.memberRecommenderId)
				&& Objects.equals(memderid, other.memderid);
	}

}


