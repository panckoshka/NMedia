package netology.dto.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import netology.dto.Post

class InMemoryPostReposirory : PostRepository {

    var post = Post(
        header = "Нетология. Университет интернет-профессий будущего",
        authorAvatar = "",
        time = "18 мая в 18:36",
//            repost = 1260,
//            likeNum = 999,
//            views = 10,
        story = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb"
    )
    private val data = MutableLiveData(post)

    override fun get(): LiveData<Post> = data

    override fun like() {
        post = post.copy(
            liked = !post.liked,
            likes = if (post.liked) post.likes - 1 else post.likes + 1
        )
        data.value = post
    }

    override fun repost() {
        post = post.copy(
            reposts = post.reposts +1
        )
        data.value = post
    }
}