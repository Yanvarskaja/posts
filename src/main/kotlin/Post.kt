import java.lang.RuntimeException
import java.util.*

data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String?,
    val replyOwnerId: Int,
    val friendsOnly: Boolean,
    val comments: Any?,
    val copyright: Any,
    val likes: Any?,
    val reposts: Any?,
    val views: Any?,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAdds: Boolean,
    val isFavorite: Boolean,
    val donut: Any?,
    val postponedId: Int,
)

class WallService {
    private var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        posts += post
        val idLastPost = if (posts.isNotEmpty()) post.copy(posts.last().id + 1) else posts.last().id = 0
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (post.id == postInArray.id) {
                posts[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }

    private var comments = emptyArray<Comment>()
    fun createComment(comment: Comment): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (postInArray.id == comment.idPost) {
                comments += comment
                return true
            } else {
                throw PostNotFoundException("Поста с таким id не существует")

            }
        }
        return false
    }
}

class PostNotFoundException(message: String) : RuntimeException(message)