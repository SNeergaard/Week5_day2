package com.example.week5_day2.model.datasource

import com.example.week5_day2.model.gitUser.GitSteven
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface GitUserService {
    companion object{
        fun createService() : GitUserService =
            RetrofirHelper().getRetrofitInstance().create(GitUserService::class.java)
    }

    @GET("SNeergaard")
    fun getGitSteven()
            : Observable<GitSteven>
}