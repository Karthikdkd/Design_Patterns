package com.postman.designpatterns.creational.builder

class Phone(
    private var OS: String?,
    private var battery: Int?,
    private var screenSize: Double?,
    private var processor: String?
) {

    override fun toString(): String {
        return "Phone(OS=$OS, battery=$battery, screenSize=$screenSize, processor=$processor)"
    }

}