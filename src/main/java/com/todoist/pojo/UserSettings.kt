package com.todoist.pojo

open class UserSettings(
    open val reminderPush: Boolean,
    open val reminderDesktop: Boolean,
    open val reminderEmail: Boolean,
    open val completedSoundDesktop: Boolean,
    open val completedSoundMobile: Boolean
)
