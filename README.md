# Ejercicios de repaso de programación

Conjunto de ejercicios de repaso de programación (tipos de datos y
sentencias de control, arrays, Strings, listas y conjuntos, archivos,
programación orientada a objetos y excepciones), tema que se imparte
en la asignatura Análisis y Diseño de Software (ADSW) del Grado en
Ingeniería de Tecnologías y Servicios de Telecomunicación.

Este repositorio contiene las **soluciones** a los ejercicios, todas
en un único proyecto de Eclipse, en orden de dificultad creciente.
Intenta resolver cada ejercicio por tu cuenta antes de mirar el código
en `src/`; consúltalo solo para comprobar tu propia solución, no como
punto de partida.

## Cómo importar el proyecto

Clona este repositorio e impórtalo en Eclipse como proyecto existente
(`.project` y `.classpath` ya están incluidos).

## Documentación

Los enunciados están en [`docs/Ejercicios-Repaso_Programacion.pdf`](docs/Ejercicios-Repaso_Programacion.pdf),
generado automáticamente a partir de su fuente LaTeX en Overleaf.

## Estructura de paquetes

Cada ejercicio tiene su propia solución en el paquete
`es.upm.dit.repaso.ejXYY`, donde `X` es el número de la sección del
enunciado y `YY` el número de ejercicio dentro de esa sección (con dos
dígitos, para conservar el orden). Por ejemplo, `ej304` es el
ejercicio 4 de la sección 3 (Arrays).

La sección 5 (Conjuntos y listas) pide primero repetir todos los
ejercicios de la sección 3 (Arrays) usando `List` o `Set` en lugar de
arrays, y después añade 8 ejercicios nuevos propios. Para no romper la
correspondencia de números con la sección 3, esas repeticiones usan el
paquete `es.upm.dit.repaso.ej5reYY` (`re` de "repetido"), con `YY`
igual al número del ejercicio original en la sección 3. Los 8
ejercicios nuevos de la sección 5 sí siguen el esquema normal:
`ej501`–`ej508`.

## Licencia

Este proyecto se distribuye bajo licencia MIT. Consulta
[`LICENSE.md`](LICENSE.md).
