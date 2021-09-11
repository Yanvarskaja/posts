interface  CrudServiceNote<E> {
    fun add(entity: E) : Note
     fun delete(noteId: Int)
     fun edit(entity: E)
     fun get(entity: E)
     fun getById(noteId: Int)
}

interface  CrudServiceComment<E> {
    fun createComment(entity: E, noteId: Int) : NoteComment
    fun deleteComment(noteId: Int) : NoteComment
    fun editComment(entity: E)
    fun getComment(entity: E)
    fun restoreComment(commentId: Int)
}

class Note(
    var title: String,
    val text: String,
    var noteId: Int = 1
)

class NoteComment(
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

    override fun edit(note: Note) {
    for ((index, note) in notes.withIndex())
        if (note.noteId == notes.indexOf(note)) {
//           note.title =
//           note.text =     
        }

            return
    }

    override fun editComment(entity: NoteComment) {
        TODO("Not yet implemented")
    }

    override fun get(note: Note) {
    notes.getOrNull(note.noteId)
    }

    override fun getById(noteId: Int) {
        notes.getOrNull(noteId)
    }

    override fun getComment(comment: NoteComment) {
        comments.getOrNull(comment.commentId)
    }

    override fun restoreComment(commentId: Int) {
       comments.add(deleteComment(commentId))
    }

}