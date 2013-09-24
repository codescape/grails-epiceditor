package epiceditor

import grails.plugin.spock.GroovyPagesSpec

class EpiceditorTagLibSpec extends GroovyPagesSpec {

    void "display renders empty div"() {
        when:
        template = "<epiceditor:display/>"

        then:
        output ==~ /.*<div.*\/>.*/
    }

    void "display renders invisible textarea"() {
        when:
        template = "<epiceditor:display/>"

        then:
        output ==~ /.*<textarea.*style="display: none;".*>.*<\/textarea>.*/
    }

    void "display with id renders div with id"() {
        when:
        template = """<epiceditor:display id="test"/>"""

        then:
        output ==~ /.*<div id="test".*/
    }

    void "display with id attribute renders invisible textarea with id"() {
        when:
        template = """<epiceditor:display id="test"/>"""

        then:
        output ==~ /.*<textarea.*id="test-textarea".*>.*/
    }

    void "display without id attribute defaults to id 'epiceditor'"() {
        when:
        template = """<epiceditor:display />"""

        then:
        output ==~ /.*<div id="epiceditor".*/
        output ==~ /.*<textarea.*id="epiceditor-textarea".*>.*/
    }

    void "display with content renders textarea containing content"() {
        when:
        template = "<epiceditor:display>Abc content xyz.</epiceditor:display>"

        then:
        output ==~ /.*<textarea.*>Abc content xyz.<\/textarea>.*/
    }


}
