package com.example.ejercicio_03

class Persona(val nombre: String, val edad: Int, val trabajo: String?="No indica", val referencia: Persona?){

    override fun toString():String{
        val ref : String

        if(referencia==null) ref = "Sin referencia"
            else ref = referencia.toString()

        val cadena = "Nombre: $nombre Edad: $edad Trabajo: $trabajo Referencia: $ref"
        return cadena
    }
    fun mostrardatos(){
        println(this).toString()
    }
}

fun main(){
    val juanito = Persona(nombre = "Juanito", 12, trabajo = "Estudiante", referencia = null)
    val pedrito = Persona("Pedrito", 12, "Astronauta", juanito)
    val chavela = Persona("Chavela", 12, "Profesora", pedrito)
    juanito.mostrardatos()
    pedrito.mostrardatos()
    chavela.mostrardatos()
}
