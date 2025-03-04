package com.example.madeoapp.models

import java.util.Date

data class tasks(
    var task_id : Int,
    var title : String,
    var description : String,
    var due_date : Date,
    var status : String,
    var user_id : Int,
    var project_id : Int,
)
