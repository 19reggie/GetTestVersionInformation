package com.reggie.entity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * TODO<配置应用的ActivityName>
 * 
 * @author: Reggie
 * @data: 2016年10月12日 上午11:10:32
 * @version: V1.0
 */
public class ActivityName {

	/**
	 * 
	 * TODO<使用HashMap来存储> HashMap的使用方法
	 * 参考http://www.trinea.cn/android/hashmap-loop-performance/
	 * 
	 * @return
	 * @throw
	 * @return HashMap<String,String>
	 */
	public static HashMap<String, String> testData() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Phone", "com.android.dialer/com.android.dialer.DialtactsActivity");
		hashMap.put("Messaging", "com.android.mms/com.android.messaging.ui.conversationlist.ConversationListActivity");
		hashMap.put("Settings", "com.android.settings/com.android.settings.Settings");
		hashMap.put("Clock", "com.android.deskclock/com.android.deskclock.DeskClock");
		hashMap.put("Data traffic management", "com.android.netmannager/com.android.netmannager.MainActivity");
		hashMap.put("Contacts", "com.android.contacts/com.android.contacts.activities.PeopleActivity");
		return hashMap;
	}

	/**
	 * 
	 * TODO<使用ArrayList来存储>
	 * 
	 * @return
	 * @throw
	 * @return ArrayList<String>
	 */
	public ArrayList<String> testData2() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("com.android.dialer/com.android.dialer.DialtactsActivity");// 电话
		arr.add("com.android.mms/com.android.messaging.ui.conversationlist.ConversationListActivity");// 信息
		arr.add("com.android.settings/com.android.settings.Settings");// 设置
		arr.add("com.android.deskclock/com.android.deskclock.DeskClock");// 时钟
		arr.add("com.android.netmannager/com.android.netmannager.MainActivity");// 流量管理
		arr.add("com.android.contacts/com.android.contacts.activities.PeopleActivity");// 联系人
		arr.add("com.talpa.battery/com.talpa.battery.activity.MainActivity");// 省电管理
		return arr;
	}

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

	// 打开应用次数
	public int testCycle() {
		return 15;
	}

}
