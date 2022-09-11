package com.postman.designpatterns.creational.builder

class PhoneBuilder(

)
{
    private var OS: String? = null
    private var battery: Int? = null
    private var screenSize: Double?= null
    private var processor: String? = null


    fun setOS(os: String?) : PhoneBuilder{
        this.OS = os
        return this
    }
    fun setBattery(battery: Int?) : PhoneBuilder{
        this.battery = battery
        return this
    }
    fun setScreenSize(screenSize: Double?) : PhoneBuilder{
        this.screenSize = screenSize
        return this
    }
    fun setProcessor(processor: String?) : PhoneBuilder{
        this.processor = processor
        return this
    }
    fun getPhone(): Phone {
        return Phone(OS, battery, screenSize, processor)
    }
}