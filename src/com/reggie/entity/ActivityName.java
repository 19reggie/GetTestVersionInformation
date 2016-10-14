package com.reggie.entity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * TODO<APP的PackageName>
 * 
 * @author: Reggie
 * @data: 2016年10月12日 上午11:10:32
 * @version: V1.0
 */
public class ActivityName {

	/**
	 * 
	 * TODO<使用ArrayList来存储>
	 * 
	 * @return
	 * @throw
	 * @return ArrayList<String>
	 */
	public ArrayList<String> testPackageName() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("com.android.dialer");// 电话
		arr.add("com.android.mms");// 信息
		arr.add("com.android.settings");// 设置
		arr.add("com.android.deskclock");// 时钟
		arr.add("com.android.netmannager");// 流量管理
		arr.add("com.android.contacts");// 联系人
		arr.add("com.talpa.battery");// 省电管理
		arr.add("tran.com.android.taplaota");// OTA
		arr.add("com.android.systemui");// 锁屏和通知栏
		arr.add("com.google.android.setupwizard");// 开机向导
		return arr;

	}

}
