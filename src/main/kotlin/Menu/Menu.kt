package Menu

import Emocion.Emocion
import Emocion.EmocionDAOImpl
import Familia.FamiliaDAOImpl
import Grupo_Terapeuta.Grupo_TerapeutaDAOImpl
import Individuo.Individuo
import Individuo.IndividuoDAOImpl
import Metodologia.MetodologiaDAOImpl
import Rol.RolDAOImpl
import Sesion.SesionDAOImpl
import Sesion_Emocion.Sesion_EmocionDAOImpl
import Tecnica.TecnicaDAOImpl
import Terapeuta.TerapeutaDAOImpl

class Menu {
    val ACCION1 = 1
    val ACCION2 = 2
    val ACCION3 = 3
    val ACCION4 = 4
    val ACCION5 = 5
    val ACCION6 = 6
    val TABLA1 = 1
    val TABLA2 = 2
    val TABLA3 = 3
    val TABLA4 = 4
    val TABLA5 = 5
    val TABLA6 = 6
    val TABLA7 = 7
    val TABLA8 = 8
    val TABLA9 = 9
    val TABLA10 = 10
    val TABLA11 = 11



    var eleccionTabla = readln().toInt()
    var accionTabla = readln().toInt()

    fun imprimirMenuPrincipal(){
        do {
            println("*****¿Que deseas hacer?*****")
            println("1.Buscar informacion \n 2.Sacar información \n 3.Insertar \n 4.Modificar \n 5.Borrar \n 6.Salir")
        }while (accionTabla >= 6)
    }

    fun imprimirMenuSecundario(){
        do {
            println("¿A que tabla deseas acceder?")
            println("1.Individuo \n 2.Familia \n 3.Emocion \n 4.Terapeuta \n 5.Tecnica \n 6.Grupo \n 7.Metododologia \n 8.Rol \n 9.Sesion \n 10.Sesion_Emocion \n 11.Salir")
        }while (eleccionTabla >= 12)
    }


    fun accesoTabla(){
        when{
            accionTabla == ACCION1 && eleccionTabla == TABLA1 -> IndividuoDAOImpl().buscarIndividuo()
            accionTabla == ACCION2 && eleccionTabla == TABLA1 -> IndividuoDAOImpl().sacarIndividuo()
            accionTabla == ACCION3 && eleccionTabla == TABLA1 -> IndividuoDAOImpl().insertarIndividuo()
            accionTabla == ACCION4 && eleccionTabla == TABLA1 -> IndividuoDAOImpl().modificarIndividuo()
            accionTabla == ACCION5 && eleccionTabla == TABLA1 -> IndividuoDAOImpl().borrarIndividio()
            accionTabla == ACCION1 && eleccionTabla == TABLA2 -> FamiliaDAOImpl().buscarFamilia()
            accionTabla == ACCION2 && eleccionTabla == TABLA2 -> FamiliaDAOImpl().sacarFamilia()
            accionTabla == ACCION3 && eleccionTabla == TABLA2 -> FamiliaDAOImpl().insertarFamilia()
            accionTabla == ACCION4 && eleccionTabla == TABLA2 -> FamiliaDAOImpl().modificarFamilia()
            accionTabla == ACCION5 && eleccionTabla == TABLA2 -> FamiliaDAOImpl().borrarFamilia()
            accionTabla == ACCION1 && eleccionTabla == TABLA3 -> EmocionDAOImpl().buscarEmocion()
            accionTabla == ACCION2 && eleccionTabla == TABLA3 -> EmocionDAOImpl().sacarEmociones()
            accionTabla == ACCION3 && eleccionTabla == TABLA3 -> EmocionDAOImpl().insertarEmocion()
            accionTabla == ACCION4 && eleccionTabla == TABLA3 -> EmocionDAOImpl().modificarEmocion()
            accionTabla == ACCION5 && eleccionTabla == TABLA3 -> EmocionDAOImpl().borrarEmocion()
            accionTabla == ACCION1 && eleccionTabla == TABLA4 -> TerapeutaDAOImpl().buscarTerapeuta()
            accionTabla == ACCION2 && eleccionTabla == TABLA4 -> TerapeutaDAOImpl().sacarTerapeuta()
            accionTabla == ACCION3 && eleccionTabla == TABLA4 -> TerapeutaDAOImpl().insertarTerapeuta()
            accionTabla == ACCION4 && eleccionTabla == TABLA4 -> TerapeutaDAOImpl().modificarTerapeuta()
            accionTabla == ACCION5 && eleccionTabla == TABLA4 -> TerapeutaDAOImpl().borrarTerapeuta()
            accionTabla == ACCION1 && eleccionTabla == TABLA5 -> TecnicaDAOImpl().buscarTecnica()
            accionTabla == ACCION2 && eleccionTabla == TABLA5 -> TecnicaDAOImpl().sacarTecnica()
            accionTabla == ACCION3 && eleccionTabla == TABLA5 -> TecnicaDAOImpl().insertarTecnica()
            accionTabla == ACCION4 && eleccionTabla == TABLA5 -> TecnicaDAOImpl().modificarTecnica()
            accionTabla == ACCION5 && eleccionTabla == TABLA5 -> TecnicaDAOImpl().borrarTecnica()
            accionTabla == ACCION1 && eleccionTabla == TABLA6 -> Grupo_TerapeutaDAOImpl().buscarGrupo()
            accionTabla == ACCION2 && eleccionTabla == TABLA6 -> Grupo_TerapeutaDAOImpl().sacarGrupo()
            accionTabla == ACCION3 && eleccionTabla == TABLA6 -> Grupo_TerapeutaDAOImpl().insertarGrupo()
            accionTabla == ACCION4 && eleccionTabla == TABLA6 -> Grupo_TerapeutaDAOImpl().modificarGrupo()
            accionTabla == ACCION5 && eleccionTabla == TABLA6 -> Grupo_TerapeutaDAOImpl().borrarGrupo()
            accionTabla == ACCION1 && eleccionTabla == TABLA7 -> MetodologiaDAOImpl().buscarMetodologia()
            accionTabla == ACCION2 && eleccionTabla == TABLA7 -> MetodologiaDAOImpl().sacarMetodologia()
            accionTabla == ACCION3 && eleccionTabla == TABLA7 -> MetodologiaDAOImpl().insertarMetodologia()
            accionTabla == ACCION4 && eleccionTabla == TABLA7 -> MetodologiaDAOImpl().modificarMetodologia()
            accionTabla == ACCION5 && eleccionTabla == TABLA7 -> MetodologiaDAOImpl().borrarMetodologia()
            accionTabla == ACCION1 && eleccionTabla == TABLA8 -> RolDAOImpl().buscarRol()
            accionTabla == ACCION2 && eleccionTabla == TABLA8 -> RolDAOImpl().sacarRol()
            accionTabla == ACCION3 && eleccionTabla == TABLA8 -> RolDAOImpl().insertaarRol()
            accionTabla == ACCION4 && eleccionTabla == TABLA8 -> RolDAOImpl().modificarRol()
            accionTabla == ACCION5 && eleccionTabla == TABLA8 -> RolDAOImpl().borrarRol()
            accionTabla == ACCION1 && eleccionTabla == TABLA9 -> SesionDAOImpl().buscarSesion()
            accionTabla == ACCION2 && eleccionTabla == TABLA9 -> SesionDAOImpl().sacarSesion()
            accionTabla == ACCION3 && eleccionTabla == TABLA9 -> SesionDAOImpl().insertarSesion()
            accionTabla == ACCION4 && eleccionTabla == TABLA9 -> SesionDAOImpl().modificarSesion()
            accionTabla == ACCION5 && eleccionTabla == TABLA9 -> SesionDAOImpl().borrarSesion()
            accionTabla == ACCION1 && eleccionTabla == TABLA10 -> Sesion_EmocionDAOImpl().buscarSesionEmocion()
            accionTabla == ACCION2 && eleccionTabla == TABLA10 -> Sesion_EmocionDAOImpl().sacarSesionEmocion()
            accionTabla == ACCION3 && eleccionTabla == TABLA10 -> Sesion_EmocionDAOImpl().insertarSesionEmo()
            accionTabla == ACCION4 && eleccionTabla == TABLA10 -> Sesion_EmocionDAOImpl().modificarSesionEmo()
            accionTabla == ACCION5 && eleccionTabla == TABLA10 -> Sesion_EmocionDAOImpl().borrarSesionEmo()
        }
    }
}