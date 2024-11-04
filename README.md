# Proyecto de Ampliación de Contenidos Audiovisuales

## Universidad Politécnica Salesiana  
**Programación Orientada a Objetos**

---

## Descripción del Proyecto
Este proyecto tiene como objetivo ampliar y mejorar un sistema de gestión de contenidos audiovisuales en Java, utilizando conceptos avanzados de Programación Orientada a Objetos (POO). El sistema permite gestionar diversos tipos de contenidos, incluyendo películas, series de televisión, documentales, anuncios publicitarios y videos de YouTube, además de las personas involucradas en estos (actores e investigadores).

### Propósito
El propósito principal de esta aplicación es proporcionar una herramienta eficaz para listar, visualizar detalles, agregar y eliminar contenidos audiovisuales, facilitando así la organización y acceso a la información relevante para los usuarios.

## Nuevas Clases y Funcionalidades Añadidas
Durante el desarrollo del proyecto, se han añadido las siguientes clases y relaciones entre ellas:

- **Actor** ➜ **Película** (Asociación - Agregación)
- **Temporada** ➜ **SerieDeTV** (Asociación - Composición)
- **Investigador** ➜ **Documental** (Asociación - Agregación)
- Nuevas subclases:
  - **AnuncioPublicitario**
  - **VideoYoutube**


## Instrucciones de Instalación y Uso
### Clonación del Repositorio
1. Clona el repositorio utilizando el siguiente comando:
   ```bash
   git clone https://github.com/AndresUV7/poo-u2.git
cd poo-u2


### Uso de la Aplicación
Una vez ejecutada, podrás gestionar los contenidos audiovisuales mediante una interfaz de consola, donde podrás realizar las siguientes acciones:

- **Listar contenidos**
- **Visualizar detalles de un contenido específico**
- **Agregar nuevos contenidos**
- **Eliminar contenidos existentes**

### Optimización de Código
Se han realizado mejoras en la eficiencia y legibilidad del código utilizando **Lombok** para reducir la cantidad de código boilerplate.
