class GrailsEpiceditorGrailsPlugin {

    // plugin version
    def version = "0.1"
    
    // supported grails versions
    def grailsVersion = "2.2 > *"
    
    // resources to exclude from packaging
    def pluginExcludes = [
        "grails-app/views/index.gsp",
        "grails-app/views/layouts/main.gsp"
    ]

    // plugin name
    def title = "Grails EpicEditor Plugin"
    def description = '''Integrates the fabulous EpicEditor with your Grails project'''

    // author name and email
    def author = "Stefan Glase"
    def authorEmail = "stefan.glase@googlemail.com"

    // further authors involved in the plugin
    def developers = [
            [ name: "Roland Schneider" ],
            [ name: "Torsten Mandry" ]
    ]

    // license
    def license = "APACHE"

    // url to documentation
    def documentation = "http://grails.org/plugin/grails-epiceditor"

    // url to issue tracker     
    def issueManagement = [ system: "GitHub", url: "https://github.com/codescape/grails-epiceditor/issues" ]
    
    // url to source code
    def scm = [ url: "https://github.com/codescape/grails-epiceditor" ]

}
