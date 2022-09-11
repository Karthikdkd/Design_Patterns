package com.postman.designpatterns

import com.postman.designpatterns.creational.builder.Phone
import com.postman.designpatterns.creational.builder.PhoneBuilder
import com.postman.designpatterns.creational.factory.OSFactory
import com.postman.designpatterns.structural.adapter.ChargePhone
import com.postman.designpatterns.structural.adapter.ChargerAdapter
import com.postman.designpatterns.structural.adapter.MyCharger

class MainClass {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //factory Pattern
            val factory: OSFactory = OSFactory()
            val os = factory.getOS("ios")
            println(os.specification())

            //this is not Builder Pattern
            val notBuilder = Phone("Android", 99, 6.5, "SnapDragon")
            println(notBuilder.toString())

            //builder pattern.. no need set all values
            val builder = PhoneBuilder().setOS("iOS").setBattery(100).getPhone()
            println(builder.toString())

            // adapter pattern
            val chargerAdapter = ChargerAdapter()
            val chargePhone = ChargePhone()
            chargePhone.charger = chargerAdapter
            chargePhone.chargePhone("iOS")
        }
    }
}