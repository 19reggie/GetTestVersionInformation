package com.reggie.entity;

import java.io.Serializable;

public class Application implements Serializable {

	/**
	 * version
	 */
	private static final long serialVersionUID = 1L;
	// entityʵ����
	private String packageName;// ����
	private String appVersion;// �汾��

	// �޲����Ĺ�����
	public Application() {

	}

	// �в����Ĺ�����
	public Application(String packageName, String appVersion) {
		this.packageName = packageName;
		this.appVersion = appVersion;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
