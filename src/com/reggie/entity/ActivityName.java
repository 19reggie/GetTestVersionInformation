package com.reggie.entity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * TODO<����Ӧ�õ�ActivityName>
 * 
 * @author: Reggie
 * @data: 2016��10��12�� ����11:10:32
 * @version: V1.0
 */
public class ActivityName {

	/**
	 * 
	 * TODO<ʹ��HashMap���洢> HashMap��ʹ�÷���
	 * �ο�http://www.trinea.cn/android/hashmap-loop-performance/
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
	 * TODO<ʹ��ArrayList���洢>
	 * 
	 * @return
	 * @throw
	 * @return ArrayList<String>
	 */
	public ArrayList<String> testData2() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("com.android.dialer/com.android.dialer.DialtactsActivity");// �绰
		arr.add("com.android.mms/com.android.messaging.ui.conversationlist.ConversationListActivity");// ��Ϣ
		arr.add("com.android.settings/com.android.settings.Settings");// ����
		arr.add("com.android.deskclock/com.android.deskclock.DeskClock");// ʱ��
		arr.add("com.android.netmannager/com.android.netmannager.MainActivity");// ��������
		arr.add("com.android.contacts/com.android.contacts.activities.PeopleActivity");// ��ϵ��
		arr.add("com.talpa.battery/com.talpa.battery.activity.MainActivity");// ʡ�����
		return arr;
	}

	public ArrayList<String> testPackageName() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("com.android.dialer");// �绰
		arr.add("com.android.mms");// ��Ϣ
		arr.add("com.android.settings");// ����
		arr.add("com.android.deskclock");// ʱ��
		arr.add("com.android.netmannager");// ��������
		arr.add("com.android.contacts");// ��ϵ��
		arr.add("com.talpa.battery");// ʡ�����
		arr.add("tran.com.android.taplaota");// OTA
		arr.add("com.android.systemui");// ������֪ͨ��
		arr.add("com.google.android.setupwizard");// ������
		return arr;

	}

	// ��Ӧ�ô���
	public int testCycle() {
		return 15;
	}

}
