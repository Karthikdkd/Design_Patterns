package com.postman.designpatterns.structural.composite

class Composite(
    private val name: String? = null
) : Component {

    private val listOfComponent: MutableList<Component> = arrayListOf()

    fun addComponent(component: Component) {
        listOfComponent.add(component)
    }

    override fun showPrice() {
        for (i in 0 until listOfComponent.size) {
            println(this.name + " : " + listOfComponent[i].showPrice() + " in side Composite, "+ listOfComponent[i])
        }
        println("/n")
    }

}