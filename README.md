# Lawn Mower
## Game coded in Java by levels (form https://catcoder.codingcontest.org/)

## Level 1
This level involves determining the number of times a direction is repeated in order:

- W => Up

- D => Right

- S => Down

- A => Left

For example, the input: **DDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAA**  
will produce the output in the form of w d s a, with w being the number of W's, and so on. The output for the given input would be: **0 48 7 48**

## Level 2
In this level, you need to determine the dimensions of the lawn (width and height) based on the string representing the directions.  
The output is presented in the form: width height

For the input: **DDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAA**,  
the corresponding output is: **13 8**

# Level 3
Level 3 involves determining if a string of directions is valid or invalid for traversing the lawn while respecting certain rules:

The mower must not leave the lawn

- It must not pass over the same point twice

- It must not cross the tree represented by X

- It must cover all points represented by .

- For this example:

13 8
.............  
.........X...  
.............  
.............  
.............  
.............  
.............  
.............  
**WWWWWWWDSDWDSDWDSDWDSDWDDSDWDSSAAAAAAAAAAASDDDDDDDDDDDSAAAAAAAAAAASDDDDDDDDDDDSAAAAAAAAAAASDDDDDDDDDDD**  

The output is: VALID




## Lawn Mowwer
## Jeu codé en Java par niveaux

## Niveau 1
Ce niveau consiste à déterminer le nombre de fois qu'une direction est répétée par ordre :

- W => Montée
- D => Droite
- S => Descente
- A => Gauche

Par exemple, l'entrée : **DDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAA**,  
produira une sortie sous forme w d s a, avec w le nombre de W, et ainsi de suite. La sortie pour l'entrée donnée serait :
**0 48 7 48**

## Niveau 2
Le niveau 2 consiste à déterminer les dimensions de la pelouse (largeur et hauteur) en se basant sur la chaîne représentant les directions. La sortie est présentée sous forme : largeur hauteur

Pour l'entrée : **DDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAASDDDDDDDDDDDDSAAAAAAAAAAAA**, la sorie crrespondante est : 
**13 8**

## Level 3

Le niveau 3 consiste à déterminer si une chaîne de directions est valide ou invalide pour parcourir la pelouse en respectant certaines règles :
- La tondeuse ne doit pas sortir de la pelouse
- Elle ne doit pas répasser par un même point
- Elle ne doit pas franchir l'arbre représenté par **X**
-Elle doit parcourir tous les points représentés par des **.**

Pour cet exemple :

13 8
.............  
.........X...  
.............  
.............  
.............  
.............  
.............  
.............  
**WWWWWWWDSDWDSDWDSDWDSDWDDSDWDSSAAAAAAAAAAASDDDDDDDDDDDSAAAAAAAAAAASDDDDDDDDDDDSAAAAAAAAAAASDDDDDDDDDDD**

La sortie est : **VALID**
