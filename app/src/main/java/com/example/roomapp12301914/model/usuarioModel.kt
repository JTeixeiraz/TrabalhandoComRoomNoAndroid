package com.example.roomapp12301914.model
import androidx.room.Entity;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
@Entity(tableName = "Usuario")
class usuarioModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_usuario")
    var id_usuario: Int = 0

    @ColumnInfo(name = "nome")

    var nome: String = ""

    @ColumnInfo(name = "idade")
    var idade:Int = 0
}