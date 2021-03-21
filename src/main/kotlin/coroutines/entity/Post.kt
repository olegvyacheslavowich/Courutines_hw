package coroutines.entity

import ru.netology.coroutines.dto.PostDto

data class Post(
    val id: Long,
    val author: Author,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
