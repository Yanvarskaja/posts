class Document (
        override val id: Int,
        override val ownerId: Int,
        val title: String,
        val size: Int,
        val ext: String,
        val url: String,
        val date: Int,
        val type: Int,
        val preview: Array<Preview>
        ): Attachment(id, ownerId)

        class Preview(
                val photo : Array<Photo>,
                val graffiti : Array<Graffiti>,
                val audioMessage: Array<Audio>
        )