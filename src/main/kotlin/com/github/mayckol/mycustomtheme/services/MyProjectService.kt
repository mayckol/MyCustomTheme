package com.github.mayckol.mycustomtheme.services

import com.intellij.openapi.project.Project
import com.github.mayckol.mycustomtheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
