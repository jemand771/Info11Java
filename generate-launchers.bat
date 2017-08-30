@echo off
SETLOCAL EnableDelayedExpansion
echo generiere Starter...
for /R %%s in (*.class) do (
SET var1=%%s
SET var=!var1:~0,-6!
echo java !var!.class > !var!.bat
)
pause