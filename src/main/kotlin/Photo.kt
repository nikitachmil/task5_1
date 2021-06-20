
data class Photo (
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    //val myArray: Array<out Any> = arrayOf()
    val sizes : Sizes,
    val width : Int,
    val height : Int
    )
