package com.flores.pooandroid.sampleEncapsulation

class ExamNotes {

    private var note: Double = 0.0
    var exam: String = ""
    private var namePerson: String = ""

    fun setNotes(note: Double) {
        this.note = if (note < 0) 0.0 else note
    }

    fun getNoteOfExam(): Double {
        return note
    }

}