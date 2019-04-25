package com.todoist.pojo

open class Section @JvmOverloads constructor(
        id: Long,
        open var name: String,
        open var projectId: Long,
        open var sectionOrder: Int = 0,
        open var isCollapsed: Boolean = false,
        open var dateAdded: Long = 0,
        open var isArchived: Boolean = false,
        open var dateArchived: Long? = null,
        deleted: Boolean = false
) : TodoistObject(id, deleted)