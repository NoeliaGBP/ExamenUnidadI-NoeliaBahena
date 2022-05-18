package objects

import java.util.*

class Main {
    val sc: Scanner = Scanner(System.`in`);
    var cookingCourses: MutableList<CookingCourse> = mutableListOf()
    var programingCourses: MutableList<ProgramingCourse> = mutableListOf()

    fun addProgramingCourse(): ProgramingCourse {
        println("Ingresa el nombre del curso: ")
        var id = programingCourses.size + 1
        var name = sc.nextLine()
        println("Ingresa la descripción del curso: ")
        var description = sc.nextLine()
        var course = ProgramingCourse(id, name, description)
        return course
    }

    fun addCookingCourse(): CookingCourse {
        println("Ingresa el nombre del curso: ")
        var id = cookingCourses.size + 1
        var name = sc.nextLine()
        println("Ingresa la descripción del curso: ")
        var description = sc.nextLine()
        var course = CookingCourse(id, name, description)
        return course
    }

    fun updateCookingCourse(nameSearch: String) {
        var course = getOneCookingCourse(nameSearch)
        if (course != null) {
            println("Ingresa el nuevo nombre del curso: ")
            var name = sc.nextLine()
            println("Ingresa la nueva descripción del curso: ")
            var description = sc.nextLine()
            var course = CookingCourse(course.id, name, description)
        }
    }

    fun updateProgramingCourse(nameSearch: String) {
        var course = getOneprogramingCourse(nameSearch)
        if (course != null) {
            println("Ingresa el nuevo nombre del curso: ")
            var name = sc.nextLine()
            println("Ingresa la nueva descripción del curso: ")
            var description = sc.nextLine()
            course = ProgramingCourse(course.id, name, description)
        }
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
            if (programingCourse.name.equals(nameSearch))
                return programingCourse
        }
        return null
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
                    println("1 -> Registrar")
                    println("2 -> Actualizar")
                    println("3 -> Eliminar")
                    println("4 -> Buscar")
                    println("5 -> Regresar al menú principal")
                    println("Ingrese su opción:")
                    var opc: Int = main.sc.nextInt()
                    when (opc) {
                        1 -> {
                            var course = main.addCookingCourse()
                            if (course != null) main.cookingCourses.add(course) else println()
                        }
                        2 -> {
                            println("Ingresa el nombre del curso que desea actualizar")
                            main.updateProgramingCourse(main.sc.nextLine())
                        }
                        3 -> {

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
                    println("1 -> Registrar")
                    println("2 -> Actualizar")
                    println("3 -> Eliminar")
                    println("4 -> Buscar")
                    println("5 -> Regresar al menú principal")
                    println("Ingrese su opción:")
                    var opc: Int = main.sc.nextInt()
                    when (opc) {
                        1 -> {
                            var course = main.addProgramingCourse()
                            if (course != null) main.programingCourses.add(course) else println()
                        }
                        2 -> {
                            println("Ingresa el nombre del curso que desea actualizar")
                            main.updateCookingCourse(main.sc.nextLine())
                        }
                        3 -> {

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
