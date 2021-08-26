class Graffiti (
    override val id: Int,
    override val ownerId: Int,
    val photo130: String,
    val photo604: String
        ): Attachment(id, ownerId)