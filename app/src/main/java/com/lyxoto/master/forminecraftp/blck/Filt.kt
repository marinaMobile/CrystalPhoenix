package com.lyxoto.master.forminecraftp.blck

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.lyxoto.master.forminecraftp.R
import com.lyxoto.master.forminecraftp.wht.GameStart
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.*

class Filt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filt)
        val txtEr: TextView = findViewById(R.id.inviteTxt)
        runBlocking {

            val job: Job = GlobalScope.launch(Dispatchers.IO) {
                getAsync(applicationContext)
            }
            job.join()
            val jsoup: String? = Hawk.get(Const.asyncResult, "")
            Log.d("cora", "cora $jsoup")

            txtEr.text = jsoup

            if (jsoup == "s4X1") {
                Intent(applicationContext, GameStart::class.java).also { startActivity(it) }
            } else {
                Intent(applicationContext, Web::class.java).also { startActivity(it) }
            }
            finish()
        }
    }
    private suspend fun getAsync(context: Context) {
        val asyncKey = Jsou(context)
        val asyncResult = asyncKey.getDocSecretKey()
        Hawk.put(Const.asyncResult, asyncResult)
    }
}