package objects

import java.util.*

class Main {
    val sc: Scanner = Scanner(System.`in`);
    var cookingCourses: MutableList<CookingCourse> = mutableListOf()
    var programingCourses: MutableList<ProgramingCourse> = mutableListOf()

    fun addProgramingCourse(): ProgramingCourse {
        var id = programingCourses.size + 1
        var name: String
        do {
            println("Ingresa el nombre del curso: ")
            name = sc.nextLine()
            var comparison = (getOneprogramingCourse(name) != null)
            if (comparison) println("Ese nombre ya existe")
        } while (comparison)
        println("Ingresa la descripción del curso: ")
        var description = sc.nextLine()
        return ProgramingCourse(id, name, description)
    }

    fun addCookingCourse(): CookingCourse {
        var id = cookingCourses.size + 1
        var name: String
        do {
            println("Ingresa el nombre del curso: ")
            name = sc.nextLine()
            var comparison = (getOneprogramingCourse(name) != null)
            if (comparison) println("Ese nombre ya existe")
        } while (comparison)
        println("Ingresa la descripción del curso: ")
        var description = sc.nextLine()
        return CookingCourse(id, name, description)
    }

    fun updateCookingCourse(nameSearch: String): CookingCourse? {
        var course = getOneCookingCourse(nameSearch)
        if (course != null) {
            var name: String
            do {
                println("Ingresa el nuevo nombre del curso: ")
                name = sc.nextLine()
                var comparison = (getOneprogramingCourse(name) != null)
                if (comparison) println("Ese nombre ya existe")
            } while (comparison)
            println("Ingresa la nueva descripción del curso: ")
            var description = sc.nextLine()
            var course = CookingCourse(course.id, name, description)
        }
        return course
    }

    fun updateProgramingCourse(nameSearch: String): ProgramingCourse? {
        var course = getOneprogramingCourse(nameSearch)
        if (course != null) {
            var name: String
            do {
                println("Ingresa el nuevo nombre del curso: ")
                name = sc.nextLine()
                var comparison = (getOneprogramingCourse(name) != null)
                if (comparison) println("Ese nombre ya existe")
            } while (comparison)
            println("Ingresa la nueva descripción del curso: ")
            var description = sc.nextLine()
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
                    var course : CookingCourse? = null
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
                            if (course != null) main.cookingCourses.add(course) else println()
                        }
                        2 -> {
                            println("Ingresa el nombre del curso que desea actualizar")
                            course = main.updateCookingCourse(main.sc.nextLine())
                            if (course != null) main.cookingCourses.add(course) else println()
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
