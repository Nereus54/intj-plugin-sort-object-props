package com.github.nereus54.intjpluginsortobjectprops.services

import com.intellij.openapi.project.Project
import com.github.nereus54.intjpluginsortobjectprops.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
