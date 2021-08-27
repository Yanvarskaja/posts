class DocumentAttachment (
        override val type: String = "document",
        val document: Document = Document(1, 1, "1", 1, "1", "1", 1, 1, 1),


        ): Attachment

        class Document(
                val id: Int,
                val ownerId: Int,
                val title: String,
                val size: Int,
                val ext: String,
                val url: String,
                val date: Int,
                val type: Int,
                val preview: Any
        )