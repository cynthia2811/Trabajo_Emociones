package Familia

class Familia {
    var id_familia:Int = 0
    lateinit var descripcion:String

    constructor(id_familia: Int, descripcion: String) {
        this.id_familia = id_familia
        this.descripcion = descripcion
    }

    constructor(descripcion: String) {
        this.descripcion = descripcion
    }


    override fun toString(): String {
        return "Familia(id_rol=$id_familia, descripcion='$descripcion')"
    }
}