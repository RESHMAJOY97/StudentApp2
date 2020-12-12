package com.example.studentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun register(view: View) {
        var getname=findViewById<EditText>(R.id.name)
        var getrno=findViewById<EditText>(R.id.rno)
        var getano=findViewById<EditText>(R.id.ano)
        var getclg=findViewById<EditText>(R.id.clg)
        var getpname=findViewById<EditText>(R.id.pname)
        var getpemail=findViewById<EditText>(R.id.pemail)
        var getpnum=findViewById<EditText>(R.id.pnum)
        var getuname=findViewById<EditText>(R.id.uname)
        var getpswrd=findViewById<EditText>(R.id.pswrd)
        var getcpswrd=findViewById<EditText>(R.id.cpswrd)
        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getrno.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getano.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getclg.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpnum.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpemail.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getuname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpswrd.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getcpswrd.text.toString(),Toast.LENGTH_LONG).show()

    }
}