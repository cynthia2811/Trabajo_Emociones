package Sesion

class Sesion{
    var id_sesion:Int = 0
    var id_grupo:Int = 0
    var id_familia:Int = 0

    constructor(id_sesion: Int, id_grupo: Int, id_familia: Int) {
        this.id_sesion = id_sesion
        this.id_grupo = id_grupo
        this.id_familia = id_familia
    }

    constructor(id_grupo: Int, id_familia: Int) {
        this.id_grupo = id_grupo
        this.id_familia = id_familia
    }

    override fun toString(): String {
        return "Sesion(id_sesion=$id_sesion, id_grupo=$id_grupo, id_familia=$id_familia)"
    }
}