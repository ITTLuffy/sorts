# Selection Sort

## riempiVettore
Metodo che prende come argomento il vettore e lo riempie con interi, chiesti ogni volta all’utente.

## stampaVettore
Metodo che prende come argomento il vettore e lo stampa con i numeri inseriti + uno spazio e l’aggiunta delle due parentesi quadre.

## ordina
Il metodo `ordina` prende come argomento un vettore.  
Creata una variabile contatore `j`, che parte da `1`, si crea un ciclo (`for` o `while`) che scorre tutto l’array.  

All’interno di esso si crea un altro ciclo, che scorre l’array a partire dal contatore, e si vanno a confrontare i valori in posizione `j` con quelli del contatore del ciclo.  
In questo modo, si confronta un singolo elemento con tutto l’array e poi si sposta nel caso sia in posizione sbagliata; questo ci permette ogni volta di aggiustare il primo numero dell’array.  

In seguito, ad ogni iterazione il contatore `j` viene incrementato e, finito il ciclo `while`, viene aggiornato con la somma di `j` + il contatore del ciclo grande.  

Ad ogni iterazione viene stampato il risultato.

## ordina2
Questo metodo prende come argomento un vettore.  

Dopo aver creato un ciclo che scorre tutto l’array e un ciclo interno che scorre l’array a partire dal contatore del ciclo grande, si vanno a trovare l’elemento minimo e la sua posizione.  

Successivamente, basta confrontare l’elemento dell’array in posizione contatore del ciclo grande e scambiarlo con l’elemento minimo.  

Questo algoritmo permette di sistemare l’elemento minimo al primo posto dell’array in ogni iterazione.  

Ad ogni iterazione viene stampato il risultato.

