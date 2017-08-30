@echo off
echo Kompilierte Klassen loeschen...
for /D %%s in (.\*) do (
cd %%s
echo %%s
del /Q /S *.class
cd ..
)
echo Fertig!