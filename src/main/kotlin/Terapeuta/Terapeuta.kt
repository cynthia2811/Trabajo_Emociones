package Terapeuta

class Terapeuta{

    var id_terapeuta:Int = 0
    lateinit var nombre:String
    lateinit var apellido1:String
    lateinit var apellido2:String
    var id_metodologia:Int = 0

    constructor(nombre: String, apellido1: String, apellido2: String) {
        this.nombre = nombre
        this.apellido1 = apellido1
        this.apellido2 = apellido2
    }

    constructor(id_terapeuta: Int, nombre: String, apellido1: String, apellido2: String, id_metodologia: Int) {
        this.id_terapeuta = id_terapeuta
        this.nombre = nombre
        this.apellido1 = apellido1
        this.apellido2 = apellido2
        this.id_metodologia = id_metodologia
    }


    override fun toString(): String {
        return "Terapeuta(id_terapeuta=$id_terapeuta, nombre='$nombre', apellido1='$apellido1', apellido2='$apellido2', id_metodologia=$id_metodologia)"
    }
}