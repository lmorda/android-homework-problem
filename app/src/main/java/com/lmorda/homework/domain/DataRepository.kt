package com.lmorda.homework.domain

import com.lmorda.homework.domain.model.GithubRepo

interface DataRepository {

    suspend fun getRepos(page: Int): List<GithubRepo>

    suspend fun getRepo(id: Long): GithubRepo
}
