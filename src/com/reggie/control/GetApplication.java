package com.reggie.control;

import java.util.ArrayList;

import com.reggie.entity.ActivityName;
import com.reggie.entity.Application;

public class GetApplication {

	public static void main(String[] args) {
		String[][] arr = test01();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

	public static String[][] test01() {
		ArrayList<String> arr = new ActivityName().testPackageName();
		int j = 2;
		String[][] str = new String[arr.size()][j];
		for (int i = 0; i < arr.size(); i++) {
			Application application = new Application();
			application.setPackageName(arr.get(i));// APP°üÃû
			application.setAppVersion(new AppInformation().getAppVersion(arr.get(i)));// APP°æ±¾ºÅ
			str[i][0] = application.getPackageName();
			str[i][1] = application.getAppVersion();
		}
		return str;
	}

}
