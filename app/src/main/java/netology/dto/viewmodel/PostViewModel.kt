package netology.dto.viewmodel

import androidx.lifecycle.ViewModel
import netology.dto.repository.InMemoryPostReposirory
import netology.dto.repository.PostRepository

class PostViewModel : ViewModel() {
    private val repository: PostRepository = InMemoryPostReposirory()
    val data = repository.get()

    fun likesCount(){
        repository.like()
    }
    fun repostsCount(){
        repository.repost()
    }
}