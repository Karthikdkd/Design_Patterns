package com.postman.designpatterns

import com.postman.designpatterns.creational.builder.Phone
import com.postman.designpatterns.creational.builder.PhoneBuilder
import com.postman.designpatterns.creational.factory.OSFactory
import com.postman.designpatterns.structural.adapter.ChargePhone
import com.postman.designpatterns.structural.adapter.ChargerAdapter
import com.postman.designpatterns.structural.adapter.MyCharger
import com.postman.designpatterns.structural.composite.Component
import com.postman.designpatterns.structural.composite.Composite
import com.postman.designpatterns.structural.composite.Leaf

class MainClass {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            factoryPattern()

            builderPattern()

            adapterPattern()

            compositePattern()

        }

        private fun compositePattern() {
            //composite pattern
            /*
            Tree like structure - last nodes are called leaf, any other called composite.
            Any operation performed in leaf, needs to be performed in composite
             */
            val leafHardDrive: Component = Leaf("Hard Drive", 4000)
            val leafMouse: Component = Leaf("Mouse", 500)
            val leafMonitor: Component = Leaf("Monitor", 8000)
            val leafRam: Component = Leaf("Ram", 6000)

            val compositeMB = Composite("Mother Board")
            val compositeAccessories = Composite("Accessories")
            val compositeComputer = Composite("Computer")

            compositeMB.addComponent(leafHardDrive)
            compositeMB.addComponent(leafRam)

            compositeAccessories.addComponent(leafMouse)
            compositeAccessories.addComponent(leafMonitor)

            compositeComputer.addComponent(compositeMB)
            compositeComputer.addComponent(compositeAccessories)

            compositeComputer.showPrice()
        }

        private fun adapterPattern() {
            // adapter pattern
            val chargerAdapter = ChargerAdapter()
            val chargePhone = ChargePhone()
            chargePhone.charger = chargerAdapter
            chargePhone.chargePhone("iOS")
        }

        private fun builderPattern() {
            //this is not Builder Pattern
            val notBuilder = Phone("Android", 99, 6.5, "SnapDragon")
            println(notBuilder.toString())

            //builder pattern.. no need set all values
            val builder = PhoneBuilder().setOS("iOS").setBattery(100).getPhone()
            println(builder.toString())
        }

        private fun factoryPattern() {
            val factory: OSFactory = OSFactory()
            val os = factory.getOS("ios")
            println(os.specification())
        }
    }


}