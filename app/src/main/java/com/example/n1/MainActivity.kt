package com.example.Nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.Nmedia.databinding.ActivityMainBinding
import netology.dto.viewmodel.PostViewModel
import netology.utils.countFinish

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel by viewModels<PostViewModel>()

//        binding.root.setOnClickListener{
//            println("yyy")
//        }
//
//        binding.avatarNM.setOnClickListener {
//            println("xxx")
//        }

        binding.ivReposts.setOnClickListener {
            viewModel.repostsCount()
        }
        binding.ivLikes.setOnClickListener {
            viewModel.likesCount()
        }

        viewModel.data.observe(this) { post ->
            with(binding) {
                header.text = post.header
                time.text = post.time
                story.text = post.story

                viewsCount.text = post.views.toString()
                val fileImageID = if (post.liked) {
                    R.drawable.ic_liked
                } else {
                    R.drawable.ic_like
                }
                ivLikes.setImageResource(fileImageID)

//                likeCount.text = post.likeNum.toString()
                tvLikes.text = countFinish(post.likes)
                tvReposts.text = countFinish(post.reposts)
            }
        }
    }
}