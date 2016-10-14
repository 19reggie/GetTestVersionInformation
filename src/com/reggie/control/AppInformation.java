package com.reggie.control;

public class AppInformation {
	/**
	 * 
	 * TODO<ͨ��Ӧ�õİ�������ȡӦ�õİ汾��>
	 * 
	 * @param packageName
	 * @return
	 * @throw
	 * @return String
	 */
	public String getAppVersion(String packageName) {
		String command = "adb shell dumpsys package " + packageName + " | grep versionName";
		String result = new PublicMethod().execute(command);
		// System.out.println("--"+result);// versionName=1.0.1610081825
		String appVersion = null;
		if (result.equals("")) {
			// System.out.println(appVersion);
			appVersion = "not exist!";
			return appVersion;
		} else {
			appVersion = result.split("=")[1].trim();
			return appVersion;
		}
	}
}
