package objects

import java.util.*

class Main {
    fun main(args : Array<String>){
        val sc : Scanner = Scanner(System.`in`);
        var cookingCourses : MutableList<CookingCourse> = mutableListOf()
        var programingCourse : MutableList<ProgramingCourse> = mutableListOf()
        println("~~~~~~~~~~Sistema de cursos~~~~~~~~~~")
        do {
            println("Menú de opciones")
            println("1 -> Registro de curso de cocina")
            println("2 -> Registro de curso de programación")
            println("3 -> Obtener Todos")
            println("4 -> Salir")
            println("Ingrese su opción:")
            var option: Int = sc.nextInt()
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
                        var opc: Int = sc.nextInt()
                        when (opc) {
                            1 -> {
                                addCookingCourse(sc)
                            }
                            2 -> {

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
                        var opc: Int = sc.nextInt()
                        when (opc) {
                            1 -> {
                               addProgramingCourse(sc)
                            }
                            2 -> {

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
        }while(option!=4)
    }

    fun addProgramingCourse(sc : Scanner){
        var course = ProgramingCourse();
        println("Ingresa el nombre del curso: ")
        course.id = programingCourse.size+1
        course.name = sc.nextLine()
        println("Ingresa la descripción del curso: ")
        course.description = sc.nextLine()
        programingCourse.add(course)
    }

    fun addCookingCourse(sc : Scanner){
        var course = CookingCourse();
        println("Ingresa el nombre del curso: ")
        course.id = cookingCourses.size+1
        course.name = sc.nextLine()
        println("Ingresa la descripción del curso: ")
        course.description = sc.nextLine()
        cookingCourses.add(course)
    }

    fun updateProgramingCourse(sc : Scanner){

    }
}