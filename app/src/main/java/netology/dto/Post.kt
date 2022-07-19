package netology.dto

data class Post(
    val id: Long = 0,
    val header: String,
    val authorAvatar: String,
    val time: String,
    val story: String,
    var liked: Boolean = false,
//    val repost: String,
//    val views: String
)