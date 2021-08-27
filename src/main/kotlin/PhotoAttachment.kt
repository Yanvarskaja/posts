class PhotoAttachment (
        override val type: String = "photo",
        val photo: Photo = Photo(1, 1, 1, 1, "1", 1, 1, 1, 1)


) : Attachment

class Photo (
        val id: Int,
        val ownerId: Int,
        val albomId: Int,
        val userId: Int,
        val text: String?,
        val date: Int,
        val sizes: Any,
        val width: Int,
        val height: Int
)