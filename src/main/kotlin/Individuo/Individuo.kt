package Individuo

class Individuo(val id_individuo:Int, val nombre:String, val apellido1:String, val apellido2:String, val id_rol:Int, val id_familia:Int) {

    override fun toString(): String {
        return "Individuo(id_individuo=$id_individuo, nombre='$nombre', apellido1='$apellido1', apellido2='$apellido2', id_rol=$id_rol, id_familia=$id_familia)"
    }
}