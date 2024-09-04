package br.edu.mouralacerda.projetoaula01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val botao = findViewById<Button>(R.id.btnTela3)

        botao.setOnClickListener {

            val cursoDigitado = findViewById<EditText>(R.id.edtCurso)
            val periodoDigitado = findViewById<EditText>(R.id.edtPeriodo)

            val pacote = intent.extras

            if(pacote != null) {
                pacote.putString("curso", cursoDigitado.text.toString())
                pacote.putString("periodo", periodoDigitado.text.toString())

                val intencao = Intent(this, Tela3::class.java)

                intencao.putExtras(pacote)

                startActivity(intencao)
            }
        }
    }
}