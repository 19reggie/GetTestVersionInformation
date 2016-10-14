package com.reggie.control;

import java.util.ArrayList;

import com.reggie.entity.MobileDevice;

public class GetMobileDevice {

	public static void main(String[] args) {
		ArrayList<String> arr=test01();
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	}

	public static ArrayList<String> test01() {
		MobileDevice mobileDevice = new MobileDevice();
		mobileDevice.setDeviceId(new DeviceInformation().getDeviceId());
		mobileDevice.setAndroidVersion(new DeviceInformation().getAndroidVersion());
		mobileDevice.setProductName(new DeviceInformation().getProductName());
		mobileDevice.setProductVersion(new DeviceInformation().getProductVersion());

		ArrayList<String> arr = new ArrayList<String>();
		arr.add(mobileDevice.getDeviceId());
		arr.add(mobileDevice.getAndroidVersion());
		arr.add(mobileDevice.getProductName());
		arr.add(mobileDevice.getProductVersion());
		return arr;
	}

}
