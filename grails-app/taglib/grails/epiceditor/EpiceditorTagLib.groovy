package grails.epiceditor

class EpiceditorTagLib {

    static namespace = 'epiceditor'

    // TODO add documentation for tag and possible and required parameters
    def display = { attrs, body ->
        def id = attrs.remove('id') ?: "epiceditor"
        def textareaId = "${id}-textarea"

        out << "<textarea id=\"$textareaId\" style=\"display: none;\">${body()}</textarea>"
        out << "<div id=\"$id\"/>"

        out << r.script(null) {
            out << "var opts = { textarea: '$textareaId', container: '$id' };"
            out << "new EpicEditor(opts).load();"
        }
    }

}
