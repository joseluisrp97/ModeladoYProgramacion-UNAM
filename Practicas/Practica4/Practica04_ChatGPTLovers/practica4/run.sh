#!/bin/bash

echo -e "Ejecutando...\n"

cd src
javac -sourcepath . -d ../class/ -cp .:../lib/* ./practica4/Imperio.java
cd ../class
java -cp .:../lib/* practica4.Imperio
