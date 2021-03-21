package ru.netology.coroutines.dto

import coroutines.entity.Author
import coroutines.entity.Post

data class PostDto(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)


fun PostDto.fromDto(author: Author) =
    Post(
        this.id,
        author,
        this.content,
        this.published,
        this.likedByMe,
        this.likes
    )


