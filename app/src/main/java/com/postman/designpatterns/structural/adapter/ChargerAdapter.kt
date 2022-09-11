package com.postman.designpatterns.structural.adapter

//this adapter is giving connection bw MyCharger and SuperCharger
class ChargerAdapter : MyCharger {
    private val superCharger = SuperCharger()
    override fun pluginIntoAnyHolder(input: String) {
        superCharger.pluginIntoSocket(input)
    }
}