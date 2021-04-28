package com.github.wangsongbin001.ideplugintemplate.services

import com.github.wangsongbin001.ideplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
