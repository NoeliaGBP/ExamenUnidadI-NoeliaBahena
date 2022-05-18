package objects

open class Course (var id: Int, var name: String, var description: String){

    open fun add():String {
        return ""
    }

    open fun update(): Int {
        return 1
    }

    open fun remove():Int {
        return 1
    }

    open fun get(){

    }

}