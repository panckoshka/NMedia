package netology.dto

data class Post(
    val id: Long = 0,
    val header: String,
    val authorAvatar: String,
    val time: String,
    val story: String,
    var liked: Boolean = false,
    var repost: Int = 0,
    var views: Int = 0,
    var likeNum: Int = 0
)