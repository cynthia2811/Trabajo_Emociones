package Tecnica

class Tecnica{

    var id_tecnica:Int = 0
    lateinit var descripcion:String
    var id_metodologia:Int = 0

    constructor(id_tecnica: Int, descripcion: String, id_metodologia: Int) {
        this.id_tecnica = id_tecnica
        this.descripcion = descripcion
        this.id_metodologia = id_metodologia
    }

    constructor(descripcion: String, id_metodologia: Int) {
        this.descripcion = descripcion
        this.id_metodologia = id_metodologia
    }


    override fun toString(): String {
        return "Tecnica(id_tecnica=$id_tecnica, descripcion='$descripcion', id_metodologia=$id_metodologia)"
    }
}