package com.shawn.springmvc.entity;
// Generated Oct 21, 2016 3:11:59 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * Client generated by hbm2java
 */
public class Client implements java.io.Serializable {

	private int clientId;
	private String password;
	private String mobileNumber;
	private Integer idType;
	private String idNumber;
	private String openId;
	private String gender;
	private Date birthDate;
	private String emailAddress;
	private Date createTimestamp;
	private Date lastUpdateTimestamp;
	private Integer clientStatus;

	public Client() {
	}

	public Client(int clientId) {
		this.clientId = clientId;
	}

	public Client(int clientId, String password, String mobileNumber,
			Integer idType, String idNumber, String openId,
			String gender, Date birthDate, String emailAddress,
			Date createTimestamp, Date lastUpdateTimestamp,
			Integer clientStatus) {
		this.clientId = clientId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.idType = idType;
		this.idNumber = idNumber;
		this.openId = openId;
		this.gender = gender;
		this.birthDate = birthDate;
		this.emailAddress = emailAddress;
		this.createTimestamp = createTimestamp;
		this.lastUpdateTimestamp = lastUpdateTimestamp;
		this.clientStatus = clientStatus;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getLastUpdateTimestamp() {
		return this.lastUpdateTimestamp;
	}

	public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

	public Integer getClientStatus() {
		return this.clientStatus;
	}

	public void setClientStatus(Integer clientStatus) {
		this.clientStatus = clientStatus;
	}

}
