package com.example.koindependecyinjection

class Student(val course: SchoolCourse,val friend: Friend) {
    fun beSmart()
    {
        friend.play()
        course.study()
    }
}
class SchoolCourse{
    fun study()
    {
        println("I am studying")
    }
}
class Friend{
    fun play()
    {
        println("I am playing")
    }
}