# Bubble sort
La versione base contiene 3 funzioni:

## riempiVettore
Metodo che prende come argomento il vettore e lo riempie con interi, chiesti ogni volta all’utente.

## stampaVettore
Metodo che prende come argomento il vettore e lo stampa con i numeri inseriti + uno spazio e l’aggiunta delle due parentesi quadre.

## ordina
Metodo che prende come argomento il vettore; creata una variabile intera da usare come temporanea, si fa un ciclo (`for` o `while`) che scorre tutto il vettore.  
Al suo interno si crea un altro ciclo, che scorra l’array, ma non per la sua interezza, bensì `dim - 1`.  
All’interno di questo ciclo si vanno a confrontare gli elementi dell’array a coppie (`pos(x)` e `pos(x+1)`, motivo per il quale il ciclo interno è `dim - 1`) e, se rispettano la condizione, ovvero se il primo numero è maggiore del secondo, si cambiano di posizione, utilizzando la variabile temporanea creata.  
Infine si chiama ogni volta il metodo `stampaVettore`, per vedere man mano i passaggi che avvengono.

---

# Versione Avanzata

## riempiVettore
Metodo che prende come argomento il vettore e un intero, e riempie il vettore con l’intero, chiesto ogni volta all’utente.

## stampaVettore
Metodo che prende come argomento il vettore e lo stampa con i numeri inseriti e l’aggiunta delle due parentesi quadre iniziali.

## ordinaAvanzata
È sostanzialmente uguale alla funzione `ordina()`, solo che si crea una variabile booleana, inizializzata a `false`, che fa terminare il ciclo, con un `break`, nel caso non ci siano scambi.

---

# Versione Suprema

## riempiVettore
Metodo che prende come argomento il vettore e un intero, e riempie il vettore con l’intero, chiesto ogni volta all’utente.

## stampaVettore
Metodo che prende come argomento il vettore e lo stampa con i numeri inseriti e l’aggiunta delle due parentesi quadre iniziali.

## ordinaSuprema
È sostanzialmente uguale alla funzione `ordinaAvanzata()`, solo che, dato che a ogni iterazione l’elemento maggiore finisce alla fine, si può bypassare l’ultimo elemento di ogni iterazione.  
Per fare questo, basta creare una variabile contatore, inizializzata a `1`, che va sottratta alla lunghezza dell’array ad ogni iterazione, nel ciclo più interno, ed incrementata alla fine del ciclo “grande”, quello esterno.

---

# Parte Comune - Main

- Creare un array  
- Riempirlo con la funzione `riempiVettore()`  
- Visualizzarlo con la funzione `stampaVettore()`  
- Ordinarlo con le funzioni `ordina`
