open class CompanionObject(){
    //Mensajes (error, succes, info)
    companion object{

        //CookingCourse, ProgramingCourse
            //Add
        private const val MENSAJE_SUCCES_ADD = "El curso  ha sido agregado correctamente."
        private const val MENSAJE_ERROR_ADD = "Error, el elemento no ha sido agreagado."
        private const val MENSJE_INFO_ADD = "Es posible que el elemento no haya sido agregado."

            //Update
        private const val MENSAJE_SUCCES_UPDATE = "El curso ha sido actualizado correctamente."
        private const val MENSAJE_ERROR_UPDATE = "Error, el elemento no pudo ser actualizado."
        private const val MENSJE_INFO_UPDATE = "Es posible que el elemento no haya sido actualizado."

            //Eliminar
        private const val MENSAJE_SUCCES_ELIMINAR = "El curso ha sido eliminado correctamente."
        private const val MENSAJE_ERROR_ELIMINAR  = "Error, el elemento no ha sido eliminado."
        private const val MENSJE_INFO_ELIMINAR  = "Es posible que el elemento no haya sido eliminado."


            //Get
        private const val MENSAJE_SUCCES_GET = "El curso ha sido consultado correctamente."
        private const val MENSAJE_ERROR_GET = "Error, el elemento no ha sido consultado."
        private const val MENSJE_INFO_GET = "Es posible que el elemento no haya sido consultado."

    }
}