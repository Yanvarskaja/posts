class Photo (
        override val id: Int,
        override val ownerId: Int,
        val albomId: Int,
        val userId: Int,
        val text: String?,
        val date: Int,
        val sizes: Array<PhotoSize>,
        val width: Int,
        val height: Int

) : Attachment(id, ownerId)

class PhotoSize (
        val type: String,
        val url: String,
        val width: Int,
        val height: Int
)