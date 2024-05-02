package Tecnica

class Tecnica(int: Int, string: String, int1: Int) {

    var id_tecnica:Int = 0
    lateinit var descripcion:String
    var id_metodologia:Int = 0

    override fun toString(): String {
        return "Tecnica(id_tecnica=$id_tecnica, descripcion='$descripcion', id_metodologia=$id_metodologia)"
    }
}