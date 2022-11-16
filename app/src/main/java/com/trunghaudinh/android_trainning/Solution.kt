package com.trunghaudinh.android_trainning

fun main() {
    val dieselEngine = DieselEngine()
    val electricEngine = ElectricEngine()

    val bmwCar = Car(dieselEngine)
    bmwCar.start()

    val vinFastCar = Car(electricEngine)
    vinFastCar.start()
}

class Car(private val engine: Engine) {
    fun start() {
        engine.startEngine()
    }
}

class DieselEngine : Engine {
    override fun startEngine() {
        println("Start with engine diesel")
    }
}

class ElectricEngine : Engine {
    override fun startEngine() {
        println("Start with engine electric")
    }
}


interface Engine {
    fun startEngine()
}