package ru.netology.coroutines.dto

import coroutines.entity.Author
import coroutines.entity.Comment

data class CommentDto(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0
)

fun CommentDto.fromDto(author: Author) =
    Comment(
        this.id,
        author,
        this.content,
        this.published,
        this.likedByMe,
        this.likes
    )
