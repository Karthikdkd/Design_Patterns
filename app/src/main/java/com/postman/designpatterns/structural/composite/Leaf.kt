package com.postman.designpatterns.structural.composite

class Leaf(
    private val name: String? = null,
    private val price: Int? = null
) : Component {

    override fun showPrice() {
        println(this.name + " : " + this.price+ " in side Leaf, "+ this.name)
    }

}