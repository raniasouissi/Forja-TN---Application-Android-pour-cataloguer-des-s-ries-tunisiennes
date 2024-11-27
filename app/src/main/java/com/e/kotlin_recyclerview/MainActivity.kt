package com.e.kotlin_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.Model.News
import com.e.RecyclerAdapter.MyAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<News>
    private lateinit var imageArr: Array<Int>
    private lateinit var titleArr: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageArr = arrayOf(
            R.drawable.nsib,
            R.drawable.fal,
            R.drawable.elfond,
            R.drawable.mof,
            R.drawable.na,
            R.drawable.harga,
            R.drawable.makto,
            R.drawable.choff
        )

        titleArr = arrayOf(
            "Nsibti Laaziza",
            "Falloujah",
            "El Foundou",
            "Awled Moufida",
            "Naouret El Hawa",
            "Harga",
            "Maktoub",
            "Choufli Hal"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList = arrayListOf()
        getArrayData()
    }

    private fun getArrayData() {
        for (i in imageArr.indices) {
            val news = News(imageArr[i], titleArr[i])
            arrayList.add(news)
        }

        val adapter = MyAdapter(arrayList)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : MyAdapter.OnItemClickListener {
            override fun onItemClick(title: String) {
                val i = Intent(this@MainActivity, ItemClicked::class.java)
                i.putExtra("TITLE", title)
                startActivity(i)
            }
        })
    }
}
