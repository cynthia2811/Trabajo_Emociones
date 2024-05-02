package Emocion

class Emocion {
    var id_emocion:Int = 0
    lateinit var nombre:String

    constructor(id_emocion: Int, nombre: String) {
        this.id_emocion = id_emocion
        this.nombre = nombre
    }

    constructor(nombre: String) {
        this.nombre = nombre
    }


    override fun toString(): String {
        return "Emocion(id_emocion=$id_emocion, nombre='$nombre')"
    }
}