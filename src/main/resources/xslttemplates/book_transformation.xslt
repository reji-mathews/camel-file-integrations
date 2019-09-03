<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:output method="xml" indent="yes" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <book>
            <author><xsl:value-of select="/book/author"/></author>
            <bookname><xsl:value-of select="/book/title"/></bookname>
            <cost><xsl:value-of select="/book/price"/></cost>
            <content><xsl:value-of select="/book/description"/></content>
        </book>
    </xsl:template>
</xsl:stylesheet>