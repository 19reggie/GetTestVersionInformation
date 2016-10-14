package com.reggie.entity;

import java.io.Serializable;

public class MobileDevice implements Serializable {

	/**
	 * version
	 */
	private static final long serialVersionUID = 1L;

	private String deviceId;// �豸id
	private String androidVersion;// Android�汾��
	private String productName;// ��Ŀ��
	private String productVersion;// ��Ŀ�汾��

	public MobileDevice() {

	}

	public MobileDevice(String deviceId, String androidVersion, String productName, String productVersion) {
		this.deviceId = deviceId;
		this.androidVersion = androidVersion;
		this.productName = productName;
		this.productVersion = productVersion;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
