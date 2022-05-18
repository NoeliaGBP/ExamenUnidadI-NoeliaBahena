package objects

open class ProgramingCourse(id:Int, name:String, description:String):Course(id, name, description) {
    override fun add(): String {
        return super.add()
    }

    override fun update(): Int {
        return super.update()
    }

    override fun remove(): Int {
        return super.remove()
    }
}