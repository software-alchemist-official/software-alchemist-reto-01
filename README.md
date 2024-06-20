# Software-Alchemist | Reto 01

## 1. Introducción

Bienvenidos al reto01 de Software-Alchemist, en este pequeño compendio de retos se pondrán a prueba las habilidades que se han adquirido en el core de java. Los retos tienen la solución adjunta, no es la más óptima ni mucho menos, el objetivo es que la persona interesada sea capaz de indagar a través de distintos recursos para encontrar la solución; dicho de otra forma: estos retos ponen a prueba la capacidad del desarrollador para usar documentación, googlear y solucionar problemas en general. Cualquier solución (de momento) es completamente válida, lo importante es dar con una solución.

## 2. Problema

En la empresa `Patito-Corp` un mal desarrollador creó una clase que contenía un método para realizar determinadas operaciones. Esas operaciones incluían revisar en un servidor remoto la creación de un archivo llamado `flag.txt`. Cuando dicho `flag.txt` exisitía, significaba que algo había terminado de ejecutarse, nuestra aplicación Java, basándose en ese hecho, se sentía con la libertad de realizar ciertas operaciones en la base de datos, subir ciertos archivos a un servidor y gestionar ciertas labores de mantenimiento. Si bien el trabajo no era difícil, es costoso en cuanto a tiempo, por si fuera poco el desarrollador fue agregando métodos a dicha clase cuando se solicitaba una nueva funcionalidad que tenía la misma naturaleza. Al final del día, una clase terminó con cientos de métodos y sus respectivas `cien llamadas`, cada una con un costo de tiempo determinado. Ejecutar `100` llamadas de `5 segundos` cada una, es algo inaceptable, dale una solución a eso y evita hacer las 100 llamadas a mano.

Tu trabajo será clonar el presente proyecto y dar tu metodología, recuerda que no debes preocuparte si obtienes el mejor performance 

## Pistas
<details>
  <summary>Haz clic aquí para ver la pista (sólo si es necesario)</summary>
  Utiliza reflexión para hacer las llamadas de forma dinámica.
</details>

<details>
  <summary>Haz clic aquí para ver la pista (sólo si es necesario)</summary>
  Hacer 100 llamadas de 5 segundos es una tarea monstruosa, hablamos de una jornada laboral entera, utiliza threads (asume que el servidor es capaz de recibir esas 100 peticiones), dicho de otra forma: con reflexión obtenderás los 100 métodos, luego con 100 threads ejecuta las 100 tareas.
</details>