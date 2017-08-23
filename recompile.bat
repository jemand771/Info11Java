@echo off
echo alles rekompilieren...
for /D %%s in (.\*) do (
cd %%s
echo %%s
javac *.java
cd ..
)
echo Fertig!