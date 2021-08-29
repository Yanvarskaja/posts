import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val result = service.add(Post(1,
            1,
            1,
            1,
            1,
            "text",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1))

        assertEquals(1, result.id)
    }

    @Test
    fun updateExiting() {
        val service = WallService()
        service.add(Post(1,
            1,
            1,
            1,
            1,
            "text",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1))
        service.add(Post(2,
            2,
            2,
            2,
            2,
            "text",
            2,
            friendsOnly = true,
            2,
            2,
            2,
            2,
            2,
            "postType",
            2,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            2,
            2))
        val update = Post(2,
            1,
            1,
            1,
            1,
            "Hello",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1)

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun notUpdateExiting() {
        val service = WallService()
        service.add(Post(1,
            1,
            1,
            1,
            1,
            "text",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1))
        service.add(Post(2,
            2,
            2,
            2,
            2,
            "text",
            2,
            friendsOnly = true,
            2,
            2,
            2,
            2,
            2,
            "postType",
            2,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            2,
            2))
        val update = Post(33,
            1,
            1,
            1,
            1,
            "Hello",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1)

        val result = service.update(update)

        assertFalse(result)
    }
    @Test
    fun addComment() {
        val service = WallService()
        service.add(Post(1,
            1,
            1,
            1,
            1,
            "text",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1))
       val result = service.createComment(Comment(1, 1, 1, 1, "1", 1, 1, 1, 1, 1, 1))
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        // здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
        val service = WallService()
        service.add(Post(1,
            1,
            1,
            1,
            1,
            "text",
            1,
            friendsOnly = true,
            1,
            1,
            1,
            1,
            1,
            "postType",
            1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAdds = true,
            isFavorite = true,
            1,
            1))
        val result = service.createComment(Comment(1, 1, 2, 1, "1", 1, 1, 1, 1, 1, 1))
    }

}