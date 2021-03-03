package com.example.koindependecyinjection

import org.koin.core.module.Module
import org.koin.dsl.module

//creating modules for the list of dependency
val appModule:Module= module {
    single { SchoolCourse() } //single-same instance of SchoolCourse() will be created

    factory { Friend() } // different instance of the Friend() wil be created

    factory { Student(get(),get()) } // different instance of the Student() wil be created
}