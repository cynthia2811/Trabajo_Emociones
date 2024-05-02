package Sesion_Emocion

class Sesion_Emocion {

    var id_sesion:Int = 0
    var id_emocion:Int = 0

    constructor(id_sesion: Int, id_emocion: Int) {
        this.id_sesion = id_sesion
        this.id_emocion = id_emocion
    }



    override fun toString(): String {
        return "Sesion_Emocion(id_sesion=$id_sesion, id_emocion=$id_emocion)"
    }
}