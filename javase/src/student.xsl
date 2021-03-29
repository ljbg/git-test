<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <center>
                    <h1>xml成绩表</h1>
                    <table border="1" >
                        <tr >
                            <th align="left">学号</th>
                            <th align="left">姓名</th>
                            <th align="left">班级</th>
                            <th align="left">成绩</th>
                        </tr>
                        <xsl:for-each select="xml成绩表/学生">
                            <xsl:choose>
                                <xsl:when test="成绩 &gt;= 90">
                                   <tr>
                                        <td><b><xsl:value-of select="学号"/></b></td>
                                        <td><b><xsl:value-of select="姓名"/></b></td>
                                        <td><b><xsl:value-of select="班级"/></b></td>
                                        <td><b><xsl:value-of select="成绩"/></b></td>
                                    </tr>
                                </xsl:when>
                                <xsl:when test="成绩 &lt;= 60">
                                    <tr>
                                        <td><font color="red"><xsl:value-of select="学号" /></font></td>
                                        <td><font color="red"><xsl:value-of select="姓名" /></font></td>
                                        <td><font color="red"><xsl:value-of select="班级" /></font></td>
                                        <td><font color="red"><xsl:value-of select="成绩" /></font></td>
                                    </tr>
                                </xsl:when>
                                <xsl:otherwise>
                                    <tr >
                                        <td><xsl:value-of select="学号" /></td>
                                        <td><xsl:value-of select="姓名"/></td>
                                        <td><xsl:value-of select="班级"/></td>
                                        <td><xsl:value-of select="成绩"/></td>
                                    </tr>
                                </xsl:otherwise>
                            </xsl:choose>
                        </xsl:for-each>
                    </table>
                </center>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>