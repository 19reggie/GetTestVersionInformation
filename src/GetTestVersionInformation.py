#!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
Created on 2016-10-13
 
@author: reggie

获取设备软件版本信息，包括设备ID、Android版本号、机型、软件版本号
获取APP版本号：
使用方法，需要查询哪个APP时，请将其包名配置到appPackage数组中
'''

import os,json

def getAppPackage():
    
    appPackage = ['com.android.dialer',
                  'com.android.mms',
                  'com.android.settings',
                  'com.android.deskclock',
                  'com.android.netmannager',
                  'com.android.contacts',
                  'com.talpa.battery',
                  'tran.com.android.taplaota',
                  'com.android.systemui',
                  'com.google.android.setupwizard']
    return appPackage

def getAppVersion(packageName):
    if platform.system() == 'Windows':
        seek = 'findstr'
    else:
        seek = 'grep'   
    tmp=os.popen('adb shell dumpsys package '+packageName+' | '+seek+' versionName').readline()
    #print tmp
    appVersion=""
    #判断读取到的内容是否为空
    if tmp=="":
        appVersion="null"
        #print "此版本中不包含tmp"
        return appVersion
    else:
        appVersion=tmp.strip().split('=')[1].strip()
        #print appVersion
        return appVersion

def deviceInformation():
    
    deviceId=os.popen('adb devices').read().split("\n")[1].split("\t")[0].strip()
    #print deviceId
    androidVersion=os.popen('adb shell getprop ro.build.version.release').readline().strip()
    #print androidVersion
    productName=os.popen('adb shell getprop ro.product.name').readline().strip()
    #print productName
    productVersion=os.popen('adb shell getprop ro.build.display.id').readline().strip()
    #print productVersion
    data={'deviceId':deviceId,
          'androidVersion':androidVersion,
          'productName':productName,
          'productVersion':productVersion}
    return data

def testAppVersion():
    appPackage =getAppPackage()
    for i in appPackage:
        appVersion=getAppVersion(i)
        print i+" version="+appVersion
        
        
def testDeviceInformation():
    data=deviceInformation()
    print json.dumps(data,skipkeys=True)


if __name__ == '__main__':
    
    print u'---获取设备软件版本信息---'
    testDeviceInformation()
    print u'---获取APP版本号---'
    testAppVersion()
    
    
