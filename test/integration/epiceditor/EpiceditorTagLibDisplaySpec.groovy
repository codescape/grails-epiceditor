package epiceditor

import grails.plugin.spock.GroovyPagesSpec

class EpiceditorTagLibDisplaySpec extends GroovyPagesSpec {

    void "renders an invisible textarea followed by an empty div"() {
        when:
        template = "<epiceditor:display/>"

        then:
        output ==~ /.*<textarea.*style="display: none;".*>.*<\/textarea>.*<div.*\/>.*/
    }

    void "uses defined id for the empty div"() {
        when:
        template = """<epiceditor:display id="test"/>"""

        then:
        output ==~ /.*<div id="test".*/
    }

    void "uses defined id with postfix '-textarea' for the invisible textarea"() {
        when:
        template = """<epiceditor:display id="test"/>"""

        then:
        output ==~ /.*<textarea.*id="test-textarea".*>.*/
    }

    void "uses 'epiceditor' as default id if none is defined"() {
        when:
        template = """<epiceditor:display />"""

        then:
        output ==~ /.*<div id="epiceditor".*/
        output ==~ /.*<textarea.*id="epiceditor-textarea".*>.*/
    }

    void "uses content as content of the invisible textarea"() {
        when:
        template = "<epiceditor:display>Abc content xyz.</epiceditor:display>"

        then:
        output ==~ /.*<textarea.*>Abc content xyz.<\/textarea>.*/
    }


}
