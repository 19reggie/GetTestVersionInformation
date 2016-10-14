package com.reggie.control;

import java.util.ArrayList;

public class DeviceInformation {

	// �豸id
	public String getDeviceId() {
		String command = "adb devices";
		String result = new PublicMethod().execute2(command);
		String deviceId = result.split("\n")[1].trim().split("\t")[0].trim();
		// System.out.println(deviceId);
		return deviceId;
	}

	// �豸�ͺ�
	public String getProductName() {
		String command = "adb shell getprop ro.product.name";
		String result = new PublicMethod().execute(command);
		// System.out.println(result);
		String productName = result.trim();
		// System.out.println( productName);//S31
		return productName;
	}

	// Android�汾��
	public String getAndroidVersion() {
		String command = "adb shell getprop ro.build.version.release";
		String result = new PublicMethod().execute(command);
		// System.out.println(result);
		String androidVersion = result.trim();
		// System.out.println( androidVersion);//6.0
		return androidVersion;
	}

	// �豸�汾��
	public String getProductVersion() {
		String command = "adb shell getprop ro.build.display.id";
		String result = new PublicMethod().execute(command);
		// System.out.println(result);
		String productVersion = result.trim();
		// System.out.println( productVersion);
		return productVersion;
	}
}
