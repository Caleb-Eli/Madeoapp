package com.example.madeoapp.models

data class notifications(
    var notif_id : Int,
    var user_id : Int,
    var task_id : Int,
    var message : String,
    var is_read : Boolean,
)
