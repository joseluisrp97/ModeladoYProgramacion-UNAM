Modelado y Programación 2024-1
Práctica 4

ChatGPTLovers
Allan Jimenez Hernandez 420003478
José Luis Raya Pérez 319659058
Alejandra Valentina Arias Villarroel 423490062

Ejecutar desde la terminal con el siguiente comandos:

bash run.bash

Patron usado: Builder
Optamos por el patrón de diseño Builder debido a su capacidad para construir objetos complejos paso a paso. Dado que el usuario tiene la opción de personalizar la nave según sus preferencias, el patrón Builder nos proporciona una estructura que permite ensamblar la nave de manera incremental, seleccionando componentes específicos en cada etapa. Esta flexibilidad elimina la necesidad de tener múltiples constructores o clases específicas para cada combinación posible de componentes de la nave. Además, el patrón Builder nos brinda una solución organizada y escalable, facilitando la adición de nuevos componentes en el futuro sin alterar la lógica existente. En resumen, elegimos el patrón Builder porque nos ofrecía una forma eficiente y modular de construir naves personalizadas, adaptándose a las decisiones del usuario y simplificando el proceso de diseño y construcción.