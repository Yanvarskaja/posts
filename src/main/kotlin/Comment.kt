import java.lang.RuntimeException

class Comment (
    var id: Int,
    val fromId: Int,
    val idPost: Int,
    val date: Int,
    val text: String,
    val donut: Any,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachment: Any,
    val parentsStack: Any,
    val thread: Any
        )

