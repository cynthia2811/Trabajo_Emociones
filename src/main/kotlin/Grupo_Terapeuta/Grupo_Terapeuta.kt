package Grupo_Terapeuta

class Grupo_Terapeuta{
    var id_grupo:Int = 0
    var id_terapeuta:Int = 0

    constructor(id_grupo: Int, id_terapeuta: Int) {
        this.id_grupo = id_grupo
        this.id_terapeuta = id_terapeuta
    }

    constructor(id_terapeuta: Int) {
        this.id_terapeuta = id_terapeuta
    }


    override fun toString(): String {
        return "Grupo_Terapeuta(id_grupo=$id_grupo, id_terapeuta=$id_terapeuta)"
    }
}