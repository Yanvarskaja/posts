class GraffitiAttachment(
    override val type: String = "graffiti",
    val graffiti: Graffiti = Graffiti(1, 1, "1", "1"),

    ) : Attachment


class Graffiti(
    val id: Int,
   val ownerId: Int,
    val photo130: String,
    val photo604: String
)