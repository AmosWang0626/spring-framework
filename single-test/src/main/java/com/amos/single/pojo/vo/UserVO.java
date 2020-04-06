package com.amos.single.pojo.vo;

/**
 * DESCRIPTION: UserVO
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/6
 */
public class UserVO {

	private String username;
	private String description;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserVO{" +
				"username='" + username + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
