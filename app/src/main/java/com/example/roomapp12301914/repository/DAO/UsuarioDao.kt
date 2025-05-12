package com.example.roomapp12301914.repository.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.roomapp12301914.model.usuarioModel

@Dao
interface UsuarioDao {
    @Insert
    fun insertUser(usuario:usuarioModel): Long
    @Update
    fun updateUser(usuario: usuarioModel): Int
    @Delete
    fun deleteUser(usuario: usuarioModel): Int
    @Query("SELECT * FROM Usuario WHERE id_usuario = :id")
    fun get(id:Int):usuarioModel
    @Query("SELECT * FROM Usuario")
    fun getAll(): List<usuarioModel>
}