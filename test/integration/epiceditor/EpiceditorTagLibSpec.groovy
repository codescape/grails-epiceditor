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

    void "display with id attribute renders invisible textarea with inner-id"() {
        when:
        template = """<epiceditor:display id="test"/>"""

        then:
        output ==~ /.*<textarea.*id="test-inner".*>.*/
    }

    void "display without id attribute defaults to id 'epiceditor'"() {
        when:
        template = """<epiceditor:display />"""

        then:
        output ==~ /.*<div id="epiceditor".*/
        output ==~ /.*<textarea.*id="epiceditor-inner".*>.*/
    }

}
