package com.example.week5_day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week5_day2.model.datasource.GitUserService
import com.example.week5_day2.model.gitUser.GitSteven
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        populatemain()

    }

    fun populatemain() {
        GitUserService
            .createService()
            .getGitSteven()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object : Observer<GitSteven> {
                lateinit var gitSteven: GitSteven
                override fun onComplete() {
                    onReuslt(gitSteven)
                }

                override fun onError(e: Throwable) {
                }

                override fun onSubscribe(d: Disposable) {
                    Log.d("TAG", "Subscribed")
                }

                override fun onNext(t: GitSteven) {
                    gitSteven = t
                }
            })

    }
    fun onReuslt(gitSteven: GitSteven) {
        tvLogin.text = gitSteven.getLogin()
        tvCreatedAt.text = gitSteven.getCreatedAt()
        tvRepo.text = gitSteven.getPublicRepos().toString()
        Picasso.get().load(gitSteven.getAvatarUrl()).into(ivPicture)
    }
}
