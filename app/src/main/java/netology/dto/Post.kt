package netology.dto

data class Post(
    val id: Long = 0,
    val header: String,
    val authorAvatar: String,
    val time: String,
    val story: String,
    val liked: Boolean = false,
    val reposts: Int = 0,
    val views: Int = 0,
    val likes: Int = 0
)