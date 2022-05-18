package objects

import objects.Main.Companion.MENSAJE_ERROR_ADD
import objects.Main.Companion.MENSAJE_ERROR_UPDATE
import objects.Main.Companion.MENSAJE_SUCCES_ADD
import objects.Main.Companion.MENSAJE_SUCCES_UPDATE
import java.util.*

class Main {
    //Mensajes (error, succes, info)
    companion object {

        //CookingCourse, ProgramingCourse
        //Add
        const val MENSAJE_SUCCES_ADD = "El curso  ha sido agregado correctamente."
        const val MENSAJE_ERROR_ADD = "Error, el elemento no ha sido agreagado."
        const val MENSJE_INFO_ADD = "Es posible que el elemento no haya sido agregado."

        //Update
        const val MENSAJE_SUCCES_UPDATE = "El curso ha sido actualizado correctamente."
        const val MENSAJE_ERROR_UPDATE = "Error, el elemento no pudo ser actualizado."
        const val MENSJE_INFO_UPDATE = "Es posible que el elemento no haya sido actualizado."

        //Eliminar
        const val MENSAJE_SUCCES_ELIMINAR = "El curso ha sido eliminado correctamente."
        const val MENSAJE_ERROR_ELIMINAR = "Error, el elemento no ha sido eliminado."
        const val MENSJE_INFO_ELIMINAR = "Es posible que el elemento no haya sido eliminado."


        //Get
        const val MENSAJE_SUCCES_GET = "El curso ha sido consultado correctamente."
        const val MENSAJE_ERROR_GET = "Error, el elemento no ha sido consultado."
        const val MENSJE_INFO_GET = "Es posible que el elemento no haya sido consultado."
    }

    val sc: Scanner = Scanner(System.`in`);
    var cookingCourses: MutableList<CookingCourse> = mutableListOf()
    var programingCourses: MutableList<ProgramingCourse> = mutableListOf()
    val companionObj: CompanionObject = CompanionObject()
    fun addProgramingCourse(): ProgramingCourse {
        var id = programingCourses.size + 1
        var name: String
        sc.nextLine()
        do {
            println("Ingresa el nombre del curso: ")
            name = sc.nextLine()
            var comparison: Boolean = (getOneprogramingCourse(name) != null)
            if (comparison) println(MENSJE_INFO_ADD)
        } while (comparison)
        println("Ingresa la descripción del curso: ")
        var description = sc.next()
        return ProgramingCourse(id, name, description)
    }

    fun addCookingCourse(): CookingCourse {
        var id = cookingCourses.size + 1
        var name: String
        sc.nextLine()
        do {
            println("Ingresa el nombre del curso: ")
            name = sc.nextLine()
            var comparison: Boolean = (getOneCookingCourse(name) != null)
            if (comparison) println(MENSJE_INFO_ADD)
        } while (comparison)
        println("Ingresa la descripción del curso: ")
        var description = sc.next()
        return CookingCourse(id, name, description)
    }

    fun updateCookingCourse(nameSearch: String): CookingCourse? {
        var course = getOneCookingCourse(nameSearch)
        if (course != null) {
            var name: String
            sc.nextLine()
            do {
                println("Ingresa el nuevo nombre del curso: ")
                name = sc.nextLine()
                var comparison = (getOneCookingCourse(name) != null)
                if (comparison) println("Ese nombre ya existe")
            } while (comparison)
            println("Ingresa la nueva descripción del curso: ")
            var description = sc.next()
            course = CookingCourse(course.id, name, description)
        }
        return course
    }

    fun updateProgramingCourse(nameSearch: String): ProgramingCourse? {
        var course = getOneprogramingCourse(nameSearch)
        if (course != null) {
            var name: String
            sc.nextLine()
            do {
                println("Ingresa el nuevo nombre del curso: ")
                name = sc.nextLine()
                var comparison = (getOneprogramingCourse(name) != null)
                if (comparison) println("Ese nombre ya existe")
            } while (comparison)
            println("Ingresa la nueva descripción del curso: ")
            var description = sc.next()
            course = ProgramingCourse(course.id, name, description)
        }
        return course
    }

    fun getOneCookingCourse(nameSearch: String): CookingCourse? {
        for (cookingCourse in cookingCourses) {
            if (cookingCourse.name.equals(nameSearch))
                return cookingCourse
        }
        return null
    }

    fun getOneprogramingCourse(nameSearch: String): ProgramingCourse? {
        for (programingCourse in programingCourses) {
            if (programingCourse.name == nameSearch)
                return programingCourse
        }
        return null
    }

    fun getOneCookingCourseById(id: Int): Int {
        for (cookingCourse in cookingCourses) {
            if (cookingCourse.id.equals(id))
                return cookingCourses.indexOf(cookingCourse)
        }
        return 0
    }

    fun getOneprogramingCourseById(id: Int): Int {
        for (programingCourse in programingCourses) {
            if (programingCourse.id == id)
                return programingCourses.indexOf(programingCourse)
        }
        return 0
    }
    fun getAll() {
        for (cookingCourse in cookingCourses) {
            println("Curso : ${cookingCourse.name} ${cookingCourse.description}")
        }
        for (programingCourse in programingCourses) {
            println("Curso : ${programingCourse.name} ${programingCourse.description}")
        }
    }

    fun getOneCookingCourseById2(id: Int): CookingCourse? {
        for (cookingCourse in cookingCourses) {
            if (cookingCourse.id.equals(id))
                return cookingCourse
        }
        return null
    }

    fun removeCookingCourse(id: Int) {
        var course = getOneCookingCourseById2(id)
        if (course != null) {
            cookingCourses.remove(course)
        }
    }
    fun getOneProgramingCourseById2(id: Int): ProgramingCourse? {
        for (programingCourses in programingCourses) {
            if (programingCourses.id.equals(id))
                return programingCourses
        }
        return null
    }

    fun removeProgramingCourse(id: Int) {
        var course = getOneProgramingCourseById2(id)
        if (course != null) {
            programingCourses.remove(course)
        }
    }

}

fun main(args: Array<String>) {
    var main = Main()
    println("~~~~~~~~~~Sistema de cursos~~~~~~~~~~")
    do {
        println("Menú de opciones")
        println("1 -> Registro de curso de cocina")
        println("2 -> Registro de curso de programación")
        println("3 -> Obtener Todos")
        println("4 -> Salir")
        println("Ingrese su opción:")
        var option: Int = main.sc.nextInt()
        when (option) {
            1 -> {
                println("\nCurso de cocina")
                do {
                    var course: CookingCourse? = null
                    println("1 -> Registrar")
                    println("2 -> Actualizar")
                    println("3 -> Eliminar")
                    println("4 -> Buscar")
                    println("5 -> Regresar al menú principal")
                    println("Ingrese su opción:")
                    var opc: Int = main.sc.nextInt()
                    when (opc) {
                        1 -> {
                            course = main.addCookingCourse()
                            if (course != null) {
                                main.cookingCourses.add(course)
                                println(MENSAJE_SUCCES_ADD)
                            } else println(MENSAJE_ERROR_ADD)
                        }
                        2 -> {
                            println("Ingresa el nombre del curso que desea actualizar")
                            course = main.updateCookingCourse(main.sc.next())
                            if (course != null) {
                                main.getOneCookingCourseById(course.id)
                                println(MENSAJE_SUCCES_UPDATE)
                            } else println(MENSAJE_ERROR_UPDATE)
                        }
                        3 -> {
                            println("Ingresa el id")
                            var id = main.removeCookingCourse(main.sc.nextInt())
                        }
                        4 -> {
                        }
                        else -> println("Opción inválida")
                    }
                } while (opc != 5)
            }
            2 -> {
                println("\nCurso de programación")
                do {
                    var course: ProgramingCourse? = null
                    println("1 -> Registrar")
                    println("2 -> Actualizar")
                    println("3 -> Eliminar")
                    println("4 -> Buscar")
                    println("5 -> Regresar al menú principal")
                    println("Ingrese su opción:")
                    var opc: Int = main.sc.nextInt()
                    when (opc) {
                        1 -> {
                            course = main.addProgramingCourse()
                            if (course != null) {
                                val index = main.programingCourses.add(course)
                                println(MENSAJE_SUCCES_ADD)
                            } else println(MENSAJE_ERROR_ADD)
                        }
                        2 -> {
                            println("Ingresa el nombre del curso que desea actualizar")
                            course = main.updateProgramingCourse(main.sc.next())
                        }
                        3 -> {
                            println("Ingresa el id")
                            var id = main.removeProgramingCourse(main.sc.nextInt())
                        }
                        4 -> {
                        }
                        else -> println("Opción inválida")
                    }
                } while (opc != 5)
            }
            3 -> {
                println("Listar todos")
            }
            4 -> println("Hasta pronto")
            else -> println("Opción inválida")
        }
    } while (option != 4)
}
