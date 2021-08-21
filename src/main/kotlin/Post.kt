import java.util.*

data class Post (
    val id : Int,
    val ownerId : Int,
    val fromId : Int,
    val createdBy : Int,
    val date : Int,
    val text : String,
    val replyOwnerId : Int,
    val friendsOnly : Boolean,
    val comments : Any,
    val copyright : Any,
    val likes : Any,
    val reposts : Any,
    val views : Any,
    val postType : String,
    val signerId : Int,
    val canPin : Boolean,
    val canDelete : Boolean,
    val canEdit : Boolean,
    val isPinned : Boolean,
    val markedAsAdds : Boolean,
    val isFavorite : Boolean,
    val donut : Any,
    val postponedId : Int
        )

class WallService {
    private var posts = emptyArray<Post>()
    private fun add(post: Post): Post {
        posts += post
        return post
    }

    fun update (post: Post, id: Int) : Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(text = "Bye")
            }
        }
        return true
    }
}