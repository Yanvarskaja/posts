class Video (
        override val id: Int,
        override val ownerId: Int,
        val tytle: String,
        val description: String?,
        val duration: Int,
        val image: Array<ImageVideo>,
        val firstFrame: Array<FirstFrameVideo>,
        val date: Int,
        val addingDate: Int,
        val views: Int?,
        val localViews: Int?,
        val comments: Int?,
        val player: String,
        val platform: String?,
        val canAdd: Boolean,
        val isPrivate: Boolean,
        val accessKey: String,
        val processing: Boolean,
        val isFavorite: Boolean,
        val canComment: Boolean,
        val canEdit: Boolean,
        val canLike: Boolean,
        val canRepost: Boolean,
        val canSubscribe: Boolean,
        val canAddToFaves: Boolean,
        val canAttachLink: Boolean,
        val weight: Int,
        val height: Int,
        val userId: Int,
        val converting: Boolean,
        val added: Boolean,
        val isSubscribed: Boolean,
        val repeat: Boolean,
        val type: String,
        val balance: Int,
        val liveStatus: String,
        val live: Boolean,
        val upcoming: Boolean,
        val spectators: Int,
        val likes:Array<LikesVideo>,
        val reposts: Array<RepostsVideo>
) : Attachment(id, ownerId)

class ImageVideo (
        val height: Int,
        val url: String,
        val weight: Int,
        val withPadding: Boolean
        )

class FirstFrameVideo (
        val height: Int,
        val url: String,
        val weight: Int
        )

class LikesVideo (
        val count: Int,
        val userLikes: Boolean
        )

class RepostsVideo (
        val count: Int,
        val wallCount: Int,
        val mailCount: Int,
        val userReposted: Int
        )