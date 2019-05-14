package com.flores.pooandroid.sampleEncapsulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flores.pooandroid.R
import kotlinx.android.synthetic.main.activity_encapsulation.*

class EncapsulationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encapsulation)

        val examNotes = ExamNotes("nombre de examen")

        //examNotes.note = 2.3 -- incorrect
        examNotes.setNotes(2.3)

        //examNotes.namePerson = "Juancho" -- incorrect
        examNotes.setNamePerson("Juancho")

        tvDetails.text = examNotes.getExam() + "\n" +
                examNotes.getNamePerson() + "\n" +
                examNotes.getNoteOfExam()
    }

}
