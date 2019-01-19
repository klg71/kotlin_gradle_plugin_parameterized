package de.klg71.kotlintestplugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

open class KotlinTestPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create<TestTask>("kotlinTestPlugin", TestTask::class.java).run {
            description = "Print test message"
            group = "TestPlugin"
        }
    }
}

open class TestTask : DefaultTask() {
    @TaskAction
    fun testAction() {
        println("Hello World")
    }

}

