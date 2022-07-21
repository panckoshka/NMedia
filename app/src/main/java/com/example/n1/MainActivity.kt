package com.example.Nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Nmedia.databinding.ActivityMainBinding
import netology.dto.Post
import netology.utils.countFinish

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val post = Post(
            header = "Нетология. Университет интернет-профессий будущего",
            authorAvatar = "",
            time = "18 мая в 18:36",
//            repost = 1260,
//            likeNum = 999,
//            views = 10,
            story = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb"
        )
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            header.text = post.header
            time.text = post.time
            story.text = post.story
            repostCount.text = post.repost.toString()
            viewsCount.text = post.views.toString()
            likeCount.text = post.likeNum.toString()

            repost.setOnClickListener {

                post.repost++
                repostCount.text = countFinish(post.repost)
            }
            like.setOnClickListener {
                post.liked = !post.liked

                if (post.liked) {
                    post.likeNum++
                    likeCount.text = countFinish(post.likeNum)
                } else {
                    post.likeNum--
                    likeCount.text = countFinish(post.likeNum)
                }

                like.setImageResource(
                    if (post.liked) {
                        R.drawable.ic_liked
                    } else {
                        R.drawable.ic_like
                    }
                )
            }
        }
    }
}