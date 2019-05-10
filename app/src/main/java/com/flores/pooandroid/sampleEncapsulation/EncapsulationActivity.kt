package com.flores.pooandroid.sampleEncapsulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.R

class EncapsulationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encapsulation)

        val examNotes = ExamNotes()
        //examNotes.note=2.3 -- incorrect
        examNotes.setNotes(2.3)
        examNotes.getNoteOfExam()
        examNotes.exam = "nombre de examen"

    }
}
