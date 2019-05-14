package com.flores.pooandroid.sampleEncapsulation

class ExamNotes {

    private var exam: String = ""
    private var note: Double = 0.0
    private var namePerson: String = ""

    constructor(exam: String) {
        this.exam = exam
    }

    fun getExam(): String {
        return exam
    }

    fun setNotes(note: Double) {
        this.note = if (note < 0) 0.0 else note
    }

    fun getNoteOfExam(): Double {
        return note
    }

    fun setNamePerson(namePerson: String) {
        this.namePerson = namePerson
    }

    fun getNamePerson(): String {
        return namePerson
    }

}