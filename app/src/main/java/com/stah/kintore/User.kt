package com.stah.kintore

import java.util.*

class User {
    lateinit var name : String
}

class DeviceInfo{
    var deviceId  = UUID.randomUUID().toString()

}



class Mailer(){

    fun test(){
        val deviceInfo = DeviceInfo()
        deviceInfo.deviceId = "aa"
    }

    fun send(deviceInfo: DeviceInfo){

    }
}