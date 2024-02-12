#!/bin/bash

cd src
javac -sourcepath . -d ../class/ -cp .:../lib/* ./practica3/Main.java
cd ../class
java -cp .:../lib/* practica3.Main
