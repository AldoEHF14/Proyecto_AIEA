<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:template match="/">
            <html><body><table border="1px">
            <tr>
                <th>Id</th> 
                <th>Precio</th>
                <th>Descripcion</th> 
                <th>Tamanio</th>
                <th>Tipo</th>
            </tr>
            <xsl:for-each select="nodo/deportes/deporte">
                <tr>
                    <td><xsl:value-of select="id"/></td> 
                    <td><xsl:value-of select="precio"/></td>
                    <td><xsl:value-of select="descripcion"/></td> 
                    <td><xsl:value-of select="tamanio"/></td>
                    <td><xsl:value-of select="tipo"/></td>
                </tr>
            </xsl:for-each>
            </table></body></html>
        </xsl:template>
    </xsl:stylesheet>