package com.postman.designpatterns.structural.adapter

class ChargePhone {

    var charger: MyCharger? = null

    fun chargePhone(input: String){
        charger?.pluginIntoAnyHolder(input)
    }
}