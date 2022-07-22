package netology.dto.repository

import androidx.lifecycle.LiveData
import netology.dto.Post

interface PostRepository {
    fun get(): LiveData <Post>
    fun like()
    fun repost()
}