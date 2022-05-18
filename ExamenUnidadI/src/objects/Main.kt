package objects

import java.util.*

class Main {
    private val sc : Scanner = Scanner(System.`in`);
    private var cookingCourses : MutableList<CookingCourse> = mutableListOf()
    private var programingCourses : MutableList<ProgramingCourse> = mutableListOf()
    fun main(args : Array<String>){
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
                                addCookingCourse()
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
                               addProgramingCourse()
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

    fun addProgramingCourse(){
        println("Ingresa el nombre del curso: ")
        var id = programingCourses.size+1
        var name = sc.nextLine()
        println("Ingresa la descripción del curso: ")
        var description = sc.nextLine()
        var course = ProgramingCourse(id, name, description)
        programingCourses.add(course)
    }

    fun addCookingCourse(){
        println("Ingresa el nombre del curso: ")
        var id = cookingCourses.size+1
        var name = sc.nextLine()
        println("Ingresa la descripción del curso: ")
        var description = sc.nextLine()
        var course = CookingCourse(id, name, description)
        cookingCourses.add(course)
    }

    fun updateProgramingCourse(sc : Scanner){

    }
}