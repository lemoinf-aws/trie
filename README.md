# Trie
> THE AUTHOR DISCLAIMS ALL OTHER WARRANTIES EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION, ANY IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE EXCEPT TO THE EXTENT THAT ANY WARRANTIES IMPLIED BY LAW CANNOT BE VALIDLY WAIVED.

Proyecto Java Maven con una implementación ilustrativa de la estructura de datos Trie. Una vez que se ha clonado el repositorio, para ejecutarlo solo se requiere el siguiente comando:
```
mvn compile exec:java --quiet
```
A continuación se muestra un ejemplo de la ejecución:
```
$ mvn clean compile exec:java --quiet
Prefijo (para terminar, introduce un punto): Aust
Sugerencias de autocomplete...
	(Aust)ralia
	(Aust)ria
Prefijo (para terminar, introduce un punto): Ale
Sugerencias de autocomplete...
	(Ale)mania
Prefijo (para terminar, introduce un punto): Bul
No se encontró sugerencia alguna
Prefijo (para terminar, introduce un punto): Ru
Sugerencias de autocomplete...
	(Ru)sia
	(Ru)mania
Prefijo (para terminar, introduce un punto): Z
Sugerencias de autocomplete...
	(Z)aire
	(Z)imbawe
Prefijo (para terminar, introduce un punto): .
$ 
```
Se recomienda ver el código de las clases `Trie` y `Node` y las pruebas unitarias correspondientes. Para ejecutarlas, basta con el comando convencional de Maven como se ilustra a continuación (intencionalmente se ha omitido parte de la salida):
```
$ mvn test
-------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TrieTests
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.075 s - in TrieTests
[INFO] Running NodeTests
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s - in NodeTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.651 s
[INFO] Finished at: 2020-10-10T22:23:41-06:00
[INFO] ------------------------------------------------------------------------
$
```
