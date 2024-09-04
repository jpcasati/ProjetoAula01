package br.edu.mouralacerda.projetoaula01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoProximo = findViewById<Button>(R.id.btnTela2)

        val nomeDigitado = findViewById<EditText>(R.id.edtNome)
        val raDigitado = findViewById<EditText>(R.id.edtRa)

        botaoProximo.setOnClickListener {

            val intencao = Intent(this, Tela2::class.java)

            val pacote = Bundle()
            pacote.putString("nome", nomeDigitado.text.toString())
            pacote.putString("ra", raDigitado.text.toString())

            intencao.putExtras(pacote)

            startActivity(intencao)
        }
    }
}