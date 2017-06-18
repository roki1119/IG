@echo off
cls
:start
javac Main.java

@echo Hi, this is a program which reversing a sentences.
java Main

@echo Both sentences are working correct.

@echo You can write your sentence again.
set choice=
set /p choice="Do you want to restart? Press 'Y' button and enter for accept: "
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='Y' goto start

@echo Please press any button to close the program.
pause>nul