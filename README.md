# ADIVINA-EL-NUMERO-WITH-JAVA
El proyecto es un juego simple en el que el objetivo del usuario es adivinar un número generado aleatoriamente entre 1 y 100. Aquí está una descripción detallada de su funcionalidad:

1. **Inicio del Juego**:
   - Al iniciar el programa, el usuario recibe un mensaje de bienvenida y una explicación del juego. El mensaje incluye una nota sobre la dificultad y una regla para no pedir ayuda.

2. **Generación del Número Aleatorio**:
   - El programa genera un número aleatorio entre 0 y 100 (inclusive) que el usuario debe adivinar.

3. **Entrada del Usuario**:
   - El usuario ingresa un número en un rango del 1 al 100 tratando de adivinar el número generado aleatoriamente.

4. **Retroalimentación**:
   - El programa proporciona retroalimentación basada en la diferencia entre el número ingresado y el número premiado:
     - Si la diferencia es 10 o menor, el programa dice "Estás cerca".
     - Si la diferencia es 20 o menor, el programa dice "Muy cerca".
     - Si la diferencia es mayor a 20, el programa dice "Demasiado lejos de adivinar".
   - Además, indica al usuario si debe ingresar un número mayor o menor.

5. **Repetición del Intento**:
   - El juego sigue solicitando números hasta que el usuario adivine el número correcto.

6. **Fin del Juego**:
   - Una vez que el usuario adivina el número, el programa muestra un mensaje de felicitación.

7. **Continuación del Juego**:
   - Después de adivinar el número, el programa pregunta al usuario si desea seguir jugando. El usuario puede responder con `1` para sí o `0` para no.
   - Si el usuario elige continuar (`1`), el juego se reinicia con un nuevo número aleatorio. Si elige no continuar (`0`), el juego termina.

En resumen, el juego permite al usuario intentar adivinar un número generado aleatoriamente, proporcionando retroalimentación sobre la cercanía del intento y la dirección en la que debe buscar el número correcto. También ofrece la opción de jugar múltiples veces en una sola sesión.
