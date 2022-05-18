package objects

import java.util.*

class Main {
    fun main(args : Array<String>){
        var sc : Scanner = Scanner(System.`in`);
        println("~~~~~~~~~~Sistema de cursos~~~~~~~~~~")
        do {
            println("Menú de opciones")
            println("1 -> Registro de curso de cocina")
            println("2 -> Registro de curso de programación")
            println("3 -> Obtener Todos")
            println("4 -> Salir")
            println("Ingrese su opción:")
            var opcion: Int = sc.nextInt()
            when (opcion) {
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
        }while(opcion!=4)
    }
}