package epiceditor

import grails.plugin.spock.GroovyPagesSpec

class EpiceditorTagLibSpec extends GroovyPagesSpec {

    void "display renders empty div"() {
        when:
        template = "<epiceditor:display/>"

        then:
        output ==~ /.*<div.*><\/div>.*/
    }

    void "display renders invisible textarea"() {
        when:
        template = "<epiceditor:display/>"

        then:
        output ==~ /.*<textarea.*style="display: none;".*>.*<\/textarea>.*/
    }

}
