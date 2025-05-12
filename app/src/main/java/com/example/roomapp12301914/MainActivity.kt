package com.example.roomapp12301914

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.roomapp12301914.model.usuarioModel
import com.example.roomapp12301914.repository.UsuarioDataBase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usuarioDatabase = UsuarioDataBase.getDataBase(this).usuarioDAO()
        val retornoInsert = usuarioDatabase.insertUser(usuarioModel().apply {
            this.nome = "João Pedro"
            this.idade = 19
        })

        val retornoSelectMultiplo = usuarioDatabase.getAll()

        for(item in retornoSelectMultiplo){
            Log.d("Retorno Multiplo", "id_usuario: ${item.id_usuario}, nome: ${item.nome}, idade:${item.idade}")
        }

    }
}