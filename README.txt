PROYECTO CALCULADORA JORGE PASCUAL MONJE

El siguiente proyecto se ha realizado en java usando awt y al ejecutarlo se iniciará una calculadora.

Consta de 15 botones: 10 para los numeros del 0 al 9, 4 para las distintas operaciones aritméticas y un último botón para el resultado.
Así como una pantalla de texto que mustra tanto los numeros introducidos como el resultado.

Estos 16 elementos se encuentran divididos en 3 panenel diferentes, organizados mediante el uso de un BorderLayout para que dichos elementos se encontraran claramente
separados y aislados dentro de su propia zona:
El panel "display" consta de simplemente la pantalla de texto, la cual no se puede editar mediante el teclado, solo con los botones.
El panel "numbers" muestra todos los números dentro de un GridLayout.
El panel "operations" muestra las operaciones y el botón de resultado, también en un GridLayout.

El frame en sí está organizado con un FlowLayout, como una opción estética para que los elementos no estén tán separados.

Si se didive cualquier número entre cero, la calculadora dará error.

El programa funciona asignando diferentes valores a diferentes valores de String e int.

Los resultados de las operaciones se almecenan en la variable n, mientras que los digitos usados en las operaciones se almacenan en los valores
s1 y s2. Las variables s3, s4 y s5 se utilizan para recibir el nuevo dígito que surge al pulsar uno de los botones, almacenar la cadena de dígitos
ya presente en campo de texto y juntar ambos en uno, respectivamente.

La variable o, por su parte, se encarga de indicar al programa, una vez el botón de resultado es pulsado, cuál es la operación que debe
realizar, tras lo cual el programa extraerá los valores int de las variables string s1 y s2, y los combinará en la variable n dependiendo de la
operación elegida.