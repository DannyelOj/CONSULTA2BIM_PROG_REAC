/*
SolidJS: El Framework reactivo

Se trata de un librería de JavaScript open source creada por Ryan Carniato, y 
lanzada por primera vez en 2020. Se enfoca en el rendimiento y la escalabilidad.
Está diseñada para ayudar a los desarrolladores a crear aplicaciones web rápidas, 
eficientes y reutilizables. Combina la sintaxis y la experiencia de desarrollo 
de React con el rendimiento de Frameworks como Svelte. Permite a los desarrolladores 
construir UIs con herramientas para mejorar los componentes de sus aplicaciones 
con reactividad, que es código JavaScript declarativo que vincula la interfaz de 
usuario con los datos que crea y utiliza. Está construido sobre herramientas 
establecidas como JSX y TypeScript , y está integrado con el ecosistema de Vite.

En SolidJS los componentes solo se ejecutan en una ocasión, que es cuando se 
renderizan por primera vez, en el caso de los hooks y bindings, solo cuando sus 
dependencias se actualizan.

Otro punto clave de SolidJS, es que en lugar de usar un Virtual DOM, compila sus 
plantillas a nodos reales del DOM y los actualiza con reactividad precisa. El 
compilador de código de SolidJS transforma el JSX en funciones que crean y 
actualizan los nodos del DOM según el estado reactivo.

-CARACTERISTICAS

SolidJS hace uso de una reactividad precisa. Utiliza este sistema para realizar 
un seguimiento de los cambios individuales en el estado de la aplicación a un 
nivel muy preciso, llevando a actualizaciones rápidas y eficientes

Los beneficios de la reactividad precisa en el rendimiento se hacen notar en 
benchmarks y en aplicaciones web que existan actualmente. El equipo de desarrollo 
de SolidJS explica que el motor de reactividad es mucho más rápido que el de 
otros Frameworks populares como React o Vue, especialmente en escenarios donde 
los componentes cuentan con una gran cantidad de datos y lógica.

Sin embarco, el equipo de SolidJS también comenta que el rendimiento no es el único 
beneficio de la programación reactiva. Con la actualización automática de la UI 
en base a los cambios, SolidJS hace que el desarrollo sea más rápido y más fácil, 
ya que los desarrolladores no van a necesitar escribir código para la gestión de 
cambios en el estado y actualizaciones en la UI.

Lo primero que deberíamos hacer sería conocer el concepto de reactividad, que es 
a la capacidad de reacción y respuesta a los cambios en los datos o estado de la 
aplicación. Por ejemplo, en el caso de React, en lugar de tener que manipular 
manualmente los elementos del DOM para reflejar los cambios, este se encarga de 
renderizar de nuevo el componente que contiene los datos cuando estos cambian.

En JavaScript, la reactividad no es una característica integrada, lo que significa
que cuando el estado cambia, la lógica y la vista asociadas no se actualizan 
automáticamente. Es tarea del Framework o del desarrollador garantizar la 
sincronización entre el modelo y la vista.

Lo que propone SolidJS en este caso es renderizar el componente una única vez, 
los cambios de datos o estado son controlados por los reactive primitives de 
SolidJS, que nos devuelven un getter y un setter. Lo que pasará con el componente 
a continuación, es que observará los datos de este primitivo y en caso de que el 
mismo cambie, solo se modificará donde esté localizado el mismo en el DOM, en 
lugar de renderizar de nuevo todo el componente, como ocurre con React.}

-OBSERVER

Observer es un patrón de diseño de comportamiento que te permite definir un 
mecanismo de suscripción para notificar a varios objetos sobre cualquier evento 
que le suceda al objeto que están observando.

Imagina que tienes dos tipos de objetos: un objeto Cliente y un objeto Tienda. 
El cliente está muy interesado en una marca particular de producto (digamos, un 
nuevo modelo de iPhone) que estará disponible en la tienda muy pronto.

El cliente puede visitar la tienda cada día para comprobar la disponibilidad del 
producto. Pero, mientras el producto está en camino, la mayoría de estos viajes 
serán en vano.

Por otro lado, la tienda podría enviar cientos de correos (lo cual se podría 
considerar spam) a todos los clientes cada vez que hay un nuevo producto disponible. 
Esto ahorraría a los clientes los interminables viajes a la tienda, pero, al mismo 
tiempo, molestaría a otros clientes que no están interesados en los nuevos productos.

Parece que nos encontramos ante un conflicto. O el cliente pierde tiempo comprobando
la disponibilidad del producto, o bien la tienda desperdicia recursos notificando
a los clientes equivocados.

Utiliza el patrón Observer cuando los cambios en el estado de un objeto puedan 
necesitar cambiar otros objetos y el grupo de objetos sea desconocido de antemano 
o cambie dinámicamente

-VENTAJAS

Principio de abierto/cerrado. Puedes introducir nuevas clases suscriptoras sin 
tener que cambiar el código de la notificadora (y viceversa si hay una interfaz 
notificadora).

Puedes establecer relaciones entre objetos durante el tiempo de ejecución

-DESVENTAJAS

Los suscriptores son notificados en un orden aleatorio.
*/