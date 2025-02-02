# Versione Base con 3 Funzioni

## `riempiVettore`
Metodo che prende come argomento il vettore e lo riempie con interi, chiesti ogni volta all’utente.

## `stampaVettore`
Metodo che prende come argomento il vettore e lo stampa con i numeri inseriti, uno spazio e l'aggiunta delle due parentesi quadre.

## `ordina`
Metodo che prende come argomento il vettore. Viene creato un ciclo esterno (for o while) con partenza da 1. Si crea un elemento "iniziale", di partenza, che corrisponde all’elemento dell’array in posizione numero di ciclo. 

Poi si crea un contatore `c` per i confronti, che è uguale alla posizione del contatore del ciclo - 1. 

Fatto questo, si crea un altro ciclo (while) che verifica:
1. Se `c` è maggiore o uguale a zero.
2. Se l’elemento in posizione `c` nell’array è maggiore dell’elemento iniziale.

Se entrambe le condizioni sono vere, si procede scambiando l’elemento a destra di 1 e diminuendo ogni volta il contatore `c`.

Finito il ciclo while, si inserisce l’elemento iniziale in posizione `c + 1`, per poi stampare il risultato.