package com.reggie.entity;

import java.io.Serializable;

public class Application implements Serializable {

	/**
	 * version
	 */
	private static final long serialVersionUID = 1L;
	// entity实体类
	private String packageName;// 包名
	private String appVersion;// 版本号

	// 无参数的构造器
	public Application() {

	}

	// 有参数的构造器
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
