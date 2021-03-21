package coroutines.entity

import ru.netology.coroutines.dto.CommentDto

data class Comment(
    val id: Long,
    val author: Author,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0
)



