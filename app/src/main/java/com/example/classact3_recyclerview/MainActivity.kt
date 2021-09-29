package com.example.classact3_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var nameED:EditText
    lateinit var enterB:Button
    lateinit var rec_View:RecyclerView // عرفت القائمة
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameED=findViewById(R.id.editText)
        enterB=findViewById(R.id.button)
         var nameList=ArrayList<String>()
        rec_View=findViewById(R.id.recView)

        rec_View.adapter=recyclerVAdapter(nameList)
        rec_View.layoutManager=LinearLayoutManager(this)


       nameList.add("Atheer")
        nameList.add("Alahmari")

        enterB.setOnClickListener {
           var meg = nameED.text.toString()
                nameList.add(meg)
           // nameList.add(nameED.text.toString())
            nameED.text.clear()
            nameED.clearFocus()
            rec_View.adapter?.notifyDataSetChanged()
            rec_View.scrollToPosition(nameList.size-1) //يعرض لي اخر عنصر في اللست

        }


    }
}