package coroutines.entity

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)
