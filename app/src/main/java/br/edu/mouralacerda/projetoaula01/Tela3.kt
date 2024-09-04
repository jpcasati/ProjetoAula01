package br.edu.mouralacerda.projetoaula01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val pacote = intent.extras

        if(pacote != null) {
            findViewById<TextView>(R.id.txtNome).text = pacote.getString("nome")
            findViewById<TextView>(R.id.txtRa).text = pacote.getString("ra")
            findViewById<TextView>(R.id.txtCurso).text = pacote.getString("curso")
            findViewById<TextView>(R.id.txtPeriodo).text = pacote.getString("periodo")
        }

    }
}