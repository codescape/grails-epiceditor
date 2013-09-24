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

    dependencies {
        test 'org.spockframework:spock-grails-support:0.7-groovy-2.0'
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.2.1") {
            export = false
        }
        test(":spock:0.7") {
            export = false
            exclude "spock-grails-support"
        }
        runtime ":resources:1.1.6"
    }

}
