/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grulla;

/**
 *
 * @author Julia
 */
import java.util.Scanner;

public class GRULLA {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

// --- MOMENTO 1: Variables, Tipos de datos y Constantes ---
double medidaAncho = 0, medidaAlto;
boolean paso1Material = false;
boolean paso2Base = false;
boolean grullaTerminada = false; // Variable de Bandera para controlar el ciclo

// Variables de Uso Especial (Conteo y Sumatoria)
int contadorPasos = 0;
double sumatoriaTiempo = 0.0;

// --- MOMENTO 2: Sentencia de repetición condicionada al final (do-while) ---
do {
System.out.println("\n--- MENU DEL SIMULADOR DE ORIGAMI ---");
System.out.println("1. Validar medidas del papel (Ancho y Alto)");
System.out.println("2. Realizar pliegues de la Base Preliminar");
System.out.println("3. Terminar la Grulla (Cuello, alas y cola)");
System.out.println("4. Salir del programa");
System.out.print("Seleccione una opcion: ");
int opcion = teclado.nextInt();

// Sentencia de decisión múltiple (switch)
switch (opcion) {
case 1:
System.out.print("Ingrese el ancho del papel (cm): ");
medidaAncho = teclado.nextDouble();
System.out.print("Ingrese el alto del papel (cm): ");
medidaAlto = teclado.nextDouble();

// Operadores aritméticos, relacionales y lógicos combinados
if (medidaAncho > 0 && medidaAlto > 0 && medidaAncho == medidaAlto) {
System.out.println("¡Papel correcto! Es un cuadrado perfecto.");
paso1Material = true;
contadorPasos = contadorPasos + 1; // Conteo
sumatoriaTiempo = sumatoriaTiempo + 1.5; // Sumatoria
} else {
System.out.println("Error: El papel de origami debe ser cuadrado.");
}
break;


case 2:
// Sentencia de decisión anidada (Evalúa si ya se hizo el paso 1)
if (paso1Material == true) {
System.out.println("Haciendo dobleces diagonales y colapsando el rombo...");
System.out.println("¡Base Preliminar completada!");
paso2Base = true;
contadorPasos = contadorPasos + 1; // Conteo
sumatoriaTiempo = sumatoriaTiempo + 3.0; // Sumatoria
} else {
System.out.println("Bloqueo: Primero debes validar el papel en la opcion 1.");
}
break;
case 3:
if (paso2Base == true) {
System.out.println("Plegando las alas, el cuello estirado y la cabeza...");
System.out.println("¡FELICIDADES! Tu grulla de papel esta terminada.");
contadorPasos = contadorPasos + 1;
sumatoriaTiempo = sumatoriaTiempo + 2.0;
// Mostrar el resumen final usando estructuras simples (Arreglos)
String[] reporte = {"Pasos hechos: " + contadorPasos, "Tiempo total: " + sumatoriaTiempo + " min"};

System.out.println("\n=== REPORTE DEL PROYECTO ===");
// Iteración ascendente condicionada al comienzo (ciclo for)
for (int i = 0; i < 2; i++) {
System.out.println(reporte[i]);
}

grullaTerminada = true; // Cambia la bandera para salir
} else {
System.out.println("Bloqueo: No puedes terminar la grulla sin la Base (Opcion 2).");
}
break;

case 4:
grullaTerminada = true; // Activa la bandera de salida
System.out.println("Saliendo del simulador.");
break;

default:
System.out.println("Opcion no valida.");
}

} while (grullaTerminada == false); // Operador relacional en la condición del ciclo
teclado.close();
}
}
