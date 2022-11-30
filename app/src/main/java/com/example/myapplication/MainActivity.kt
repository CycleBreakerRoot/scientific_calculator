package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pi = 3.14159265359


        val B0:Button = findViewById(R.id.b0)
        val B1:Button = findViewById(R.id.b1)
        val B2:Button = findViewById(R.id.b2)
        val B3:Button = findViewById(R.id.b3)
        val B4:Button = findViewById(R.id.b4)
        val B5:Button = findViewById(R.id.b5)
        val B6:Button = findViewById(R.id.b6)
        val B7:Button = findViewById(R.id.b7)
        val B8:Button = findViewById(R.id.b8)
        val B9:Button = findViewById(R.id.b9)
        val Bdot:Button = findViewById(R.id.bdot)
        val Bplus:Button = findViewById(R.id.bplus)
        val Bmin:Button = findViewById(R.id.bmin)
        val Bmul:Button = findViewById(R.id.bmul)
        val Bequal:Button = findViewById(R.id.bequal)
        val Blog:Button = findViewById(R.id.blog)
        val Bln:Button = findViewById(R.id.bln)
        val Bac:Button = findViewById(R.id.bac)
        val Bc:Button = findViewById(R.id.bc)
        val Btan:Button = findViewById(R.id.btan)
        val Bsin:Button = findViewById(R.id.bsin)
        val Bcos:Button = findViewById(R.id.bcos)
        val BB1:Button = findViewById(R.id.bb1)
        val BB2:Button = findViewById(R.id.bb2)
        val Bfact:Button = findViewById(R.id.bfact)
        val Bsquare:Button = findViewById(R.id.bsqaure)
        val Bsqrt:Button = findViewById(R.id.bsqrt)
        val Binv:Button = findViewById(R.id.binv)
        val Bdiv:Button = findViewById(R.id.bdiv)
        val Bpi:Button = findViewById(R.id.bpi)

        val tvmain:TextView = findViewById(R.id.tvmain)
        val tvsec:TextView = findViewById(R.id.tvsec)


        B0.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "0")
        }

        B1.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "1")
        }

        B2.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "2")
        }

        B3.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "3")
        }

        B4.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "4")
        }

        B5.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "5")
        }

        B6.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "6")
        }

        B7.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "7")
        }

        B8.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "8")
        }

        B9.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "9")
        }

        Bdot.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + ".")
        }

        Bac.setOnClickListener{
            tvmain.setText("")
            tvsec.setText("")
        }

        Bc.setOnClickListener{
            val str:String = tvmain.text.toString()
            val SubStr = str.subSequence(0 , str.length -1)
            tvmain.setText(SubStr)
        }

        Bplus.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "+")
        }

        Bmin.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "-")
        }

        Bmul.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "*")
        }

        Bdiv.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "/")
        }

        Bsqrt.setOnClickListener{
            val str = tvmain.text.toString()
            val r:Double = Math.sqrt(str.toDouble())
            tvmain.setText(r.toString())
        }

        BB1.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "(")
        }

        BB2.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + ")")
        }

        Bpi.setOnClickListener{
            tvsec.setText(Bpi.text)
            tvmain.setText(tvmain.text.toString() + pi.toString())
        }

        Bsin.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "sin")
        }

        Btan.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "tan")
        }

        Bcos.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "cos")
        }

        Bfact.setOnClickListener{
            val amount:Int = tvmain.text.toString().toInt()

            val res = fact(amount)
            tvmain.setText(res.toString())
            tvsec.setText(amount.toString() + "!")
        }
        
        Bsquare.setOnClickListener{
            val amount = tvmain.text.toString().toInt()
            val res = amount * amount
            tvmain.setText(res.toString())
            tvsec.setText(amount.toString() + "²")
        }

        Bequal.setOnClickListener{
            val amount = tvmain.text.toString()
            val res = calc.eval(amount)
            tvmain.setText(res.toString())
            tvsec.setText(amount)
        }

        Bln.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "ln")
        }

        Blog.setOnClickListener{
            tvmain.setText(tvmain.text.toString() + "log")
        }

        Binv.setOnClickListener{
            val amount = tvmain.text.toString().toDouble()
            val res = 1 / amount
            tvmain.setText(res.toString())
        }












    }

    fun fact(n:Int): Int {
        if (n == 0 || n == 1){
            return 1
        }
        else{
            return n * fact(n - 1)
        }
    }
}

