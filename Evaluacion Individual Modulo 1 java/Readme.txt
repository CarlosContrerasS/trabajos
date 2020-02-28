
Se realizaron las clase segun los solicitado en el Problema, es decir con sus atributos y metodos.

Se tuvo mayor cuidado en el metodo de cambio de precio, debido a que deseaba implementar este metodo para usar un Electrodomestico cualquiera, se utilizo un switch para el caso de las letras debido al consumo de energetico y un if secuencial para los peso y sus correspondietes aumento de precio.

En la clase de electrodomestico se comprueba el color y la letra del consumo energetico al momento de crear el objeto, para ello los metodos fueron considerados como privados y se implementan en el constructor que crea el objeto.

Se crearon las Subclases Televisores y Lavadoras, con sus atributos unicos y metodos, se utilizo la herencia en los atributos y en el metodo de precio final.

Luego se creo el Main ejecutable.

Se creo el arreglo de 10 objetos utilizando la super clase de Electrodomesticos,

Los primero 3 objetos creados fueron Electrodomesticos comunes y corrientes.

Luego los otros 3 objetos son Televisores.

Luego los otros 4 objetos son Lavadoras.

Se tuvo cuidado al crearlos como se definieron los constructores.

Luego se muestran los objetos que pertenecen a cada clase: Electrodomesticos, Lavadoras y Television.

Como la clase Electrodomesticos es la super clase, aparece el elementos tanto en la subclase como en la superclase

por lo que decidi tanbien imprimir solo con las clases hijas.

Luego Imprimo los precios de los objetos sin aplicar el metodo de Precio Final

Actualizo los Precio utilizando el metodo de Precio final que toma en consideracion el peso, Consumo Energetico. Y si es televisor, además toma en cuenta la resolucion y si tiene sintetizador o no.

Actualizo los precios con los cambios de precio final.

Luego sumo los precios utilizando las instancias de las clases para que quede de manera generica.

Debo recordar que como todos los elementos corresponde a la clase Electrodomesticos debido a que es la clase padre.
Al sumar los elementos de esta clase tengo la suma de todos los precios.

Por lo que debos restar el total con los televisores y la lavadoras para tener los que solo son electrodomesticos

Finalmente Imprimo los valores.





