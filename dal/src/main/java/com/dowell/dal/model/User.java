package com.dowell.dal.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author nanbo
 * @description 用户
 * @create 2018-11-07
 **/
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 现金金额
	 */
	private BigDecimal funds;

	/**
	 * 创建时间
	 */
	private Date createdAt;

	/**
	 * 修改时间
	 */
	private Date updatedAt;

	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：手机号
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}

	public BigDecimal getFunds() {
		return funds;
	}

	public void setFunds(BigDecimal funds) {
		this.funds = funds;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * 设置：创建时间
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
