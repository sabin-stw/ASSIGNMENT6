package com.example.week6assignment

import android.widget.Toast
import com.example.week6assignment.Model.Student

private var listStudent = arrayListOf<Student>()
var loggedIn: Student? = null
class Storage {
    fun appendStudent(student: Student){
        listStudent.add(student)
        println(listStudent.size)
    }
    fun returnStudent():ArrayList<Student>{
        return listStudent
    }
    fun deleteStudent(student: Student){
        listStudent.remove(student)
    }
    public fun setLoggedIn(id: Student?){
        println(id)
        loggedIn = id
    }
    public fun getLoggedIn(): Student? {
        return loggedIn
    }
}