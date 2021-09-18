interface  CrudServiceNote<E> {
    fun add(entity: E) : Note
     fun delete(noteId: Int)
     fun edit(noteId: Int, title: String, text: String, entity: E)
     fun get(entity: E) : Note
     fun getById(noteId: Int)
}

interface  CrudServiceComment<E> {
    fun createComment(entity: E, noteId: Int) : NoteComment
    fun deleteComment(noteId: Int) : NoteComment
    fun editComment(commentId: Int, message: String, entity: E)
    fun getComment(entity: E) : NoteComment
    fun restoreComment(commentId: Int)
}

data class Note(
    var title: String,
    val text: String,
    var noteId: Int = 1
)

data class NoteComment(
    val message: String,
    val commentId: Int,
)

class NoteService: CrudServiceNote<Note>, CrudServiceComment<NoteComment> {
    var notes = mutableListOf<Note>()
    var comments = mutableListOf<NoteComment>()

    override fun add(note : Note) : Note {
    notes += note
        note.noteId = note.noteId++
        return notes.last()
    }

    override fun createComment(comment: NoteComment, noteId: Int) : NoteComment {
        if (comment.commentId == noteId ) {
            comments += comment
        }
        return comments.last()
    }

    override fun delete(noteId: Int) {
      notes.removeAt(noteId)
    }

    override fun deleteComment(commentId: Int): NoteComment {
       val deleteComment = comments.removeAt(commentId)
        return comments.last()
    }

    override fun edit(noteId: Int, title: String, text: String, note: Note) {
        val note = notes[noteId]
        if (note != null) {
            val newNote = note.copy(title = title, text = text)
            notes[noteId] = newNote
        }
    }

    override fun editComment(commentId: Int, message: String, entity: NoteComment) {
        val comment = comments[commentId]
        if (comment != null) {
            val newComment = comment.copy(message = message)
            comments[commentId] = newComment
        }
    }

    override fun get(note: Note) : Note {
    notes.getOrNull(note.noteId)
        return note
    }

    override fun getById(noteId: Int) {
        notes.getOrNull(noteId)
    }

    override fun getComment(comment: NoteComment) : NoteComment {
        comments.getOrNull(comment.commentId)
        return comment
    }

    override fun restoreComment(commentId: Int) {
       comments.add(deleteComment(commentId))
    }

}