<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!-- García Godoy Víctor Saúl 2183042802-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 	<xsl:output version="4.0" indent="yes" method="html" />
	<xsl:template match="/">
		<html><body>
				<table border="1px">
					<tr>
						<th>Titulo</th>
						<th>Autor</th>
						<th>Fecha de Publicacion</th>
						<th>Descripción</th>
						<th>Precio</th>
					</tr>
					<xsl:for-each select="tienda/libros/libro">
						<tr>
							<td><xsl:value-of select="titulo"></xsl:value-of></td>
							<td><xsl:value-of select="autor"></xsl:value-of></td>
							<td><xsl:value-of select="fecha_publicacion"></xsl:value-of></td>
							<td><xsl:value-of select="descripcion"></xsl:value-of></td>
							<td><xsl:value-of select="precio"></xsl:value-of></td>
						</tr>
					</xsl:for-each>
				</table>
			</body></html>
	</xsl:template>
</xsl:stylesheet>