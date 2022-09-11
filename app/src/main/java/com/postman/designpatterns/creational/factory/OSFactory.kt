package com.postman.designpatterns.creational.factory

class OSFactory {
    fun getOS(osString: String): OS {
        return if (osString == "android") {
            Android()
        } else
            if (osString == "ios")
                IOS()
            else
                Windows()
    }
}