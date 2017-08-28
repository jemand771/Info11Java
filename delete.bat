echo Loesche Verzeichnisse...
for /D %%s in (.\*) do (
rmdir /S /Q %%s
)