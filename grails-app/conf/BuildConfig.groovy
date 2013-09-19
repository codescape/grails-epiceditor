grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"
    legacyResolve false

    repositories {
        grailsCentral()
        mavenCentral()
    }

    dependencies { }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.2.1") {
            export = false
        }
        runtime ":resources:1.1.6"
    }

}
