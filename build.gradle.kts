tasks.register("allDependencies") {
    dependsOn(
        subprojects.flatMap { subproject ->
            subproject.tasks.matching { it.name == "dependencies" }
        }
    )
}
