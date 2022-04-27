#03_Input&Output.py
from math import pi
'''
##Formated string litterals

#Ejemplo 1
print(f"The value of pi is approximately {pi:.3f}")



##str.format()
#Ejemplo 1
votos = 2_342_710
votos_nulos = 1_234_120
porcentaje = votos_nulos/votos
print('De un total de {:-7} votos, el {:.2%} fueron votos nulos'.format(votos, porcentaje))


#Ejemplo 2
alumno = "Juan"
materia = "Historia"
print("El alumno", alumno, "lleva la materia", materia)
print("El alumno {} lleva la materia {}".format(alumno, materia))

#Ejemplo 3
print(" {0} y {1}".format('manzanas', 'peras', 'sandia'))
print("{1} y {0}".format('manzanas', 'peras'))


## rjust, ljust, center.
nombre = "Carlos"
apellido = "Martínez"
universidad = "Instituto Tecnológico Autónomo de México"


print(nombre.rjust(100))
print(apellido.ljust(10))
print(universidad.center(100))




###### Ejercicios ######


#1. Imprimir los primeros 10 decimales de pi

print(f'Los primeros 10 decimales de pi {pi:.10f}')

#2. Cristiano Ronaldo ha metido 123 goles en el Manchester, 450 en el Real Madrid, 101 en la Juventus.
## Mostrar el porcentaje de goles que ha metido en el Real Madrid con precision de 2 decimales.
# Goles Equipo
# 123 MU
# 450 RM
# 101 Ju

golesRM = 450
golesMU = 123
golesJuv = 101

golesTotales = golesRM + golesMU + golesJuv

porcentaje = golesRM / golesTotales

print('Cristiano Ronaldo ha metido en el real madrid', golesRM, 'y es un porcentaje ', porcentaje, 'de sus goles totales')
print(f'Cristiano Ronaldo ha metido en el real madrid {golesRM}, y es un porcentaje {porcentaje:.2%}')
print('Cristiano Ronaldo ha metido en el real madrid {:-3} y es un porcentaje {:.2%}'.format(golesRM,porcentaje))



#3. Imprime la siguiente piramide 

print("*")
print("**")
print("***")
print("****")

#3.1 Resuelve el ejercicio anterior con una sola linea de código.
print("*\n**\n***\n****")



#4. Imprime el valor y su cuadrado de los numeros 1, 2, 3, 4 y 5 en forma de tabla

print("1", "1")
print("2", "4")
print("3", "9")
print("4", "16")
print("5", "25")

print("\n\n\n")


#1234512345
#**1** -> center(5)
#1***** -> ljust(5)
#*****1 -> rjust(5)
#str.format()
print("1".center(5), "1".center(5))
print("2", "4".rjust(2))
print("3", "9".rjust(2))
print("4", "16".rjust(2))
print("5", "25".rjust(2))


print("\n\n\n")

print("1", "1".rjust(2), "\n", "2", "4".rjust(2),  "\n", "3", "9".rjust(2))


#Utiliza rjust para mostrar los resultados de una forma mas legible


#¿Se puede realizar en una sola linea?

'''
#5. Imprimir la siguiente ventana


print("+ - - - + - - - +")
print("|       |       |")
print("|       |       |")
print("|       |       |")
print("+ - - - + - - - +")
print("|       |       |")
print("|       |       |")
print("|       |       |")
print("+ - - - + - - - +")


#Una sola linea linea
print("+ - - - + - - - +\n", "|       |       |")

# Solucion

print('+', '-', '-', '-', '+', '-', '-', '-', '+')
print('|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|')
print('|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|')
print('|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|')
print('+', '-', '-', '-', '+', '-', '-', '-', '+')
print('|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|')
print('|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|')
print('|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|')
print('+', '-', '-', '-', '+', '-', '-', '-', '+')
