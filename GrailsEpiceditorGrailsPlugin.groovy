class GrailsEpiceditorGrailsPlugin {

    def version = "0.1"
    def grailsVersion = "2.2 > *"
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grails EpicEditor Plugin"
    def author = "Stefan Glase"
    def authorEmail = "stefan.glase@googlemail.com"
    def description = '''\
Small and simple plugin that adds the fabulous EpicEditor to your Grails project.
'''

    def documentation = "http://grails.org/plugin/grails-epiceditor"
    // def license = "APACHE"
    // def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]
    // def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]
    // def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }

}
