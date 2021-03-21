package coroutines.dto

import coroutines.entity.Author

data class AuthorDto(
    val id: Long,
    val name: String,
    val avatar: String
)

fun AuthorDto.fromDto() =
    Author(
        this.id,
        this.name,
        this.avatar
    )

