# Premier cours

## Pré-requis
Pour faire du java on a besoin d'un IDE.
<ul>
<li>[Eclipse] (https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2019-03/R/eclipse-inst-win64.exe)</li>
<li>[intellij] (https://www.jetbrains.com/idea/download/#section=windows)</li>
</ul>

Tu auras aussi besoin de [git](https://git-scm.com/download/win) et d'une jdk on va prendre une [jdk8](https://adoptopenjdk.net/). 

## La base 

### les variables

En java pour définir une variable il suffit de faire : 

``` java
	int test = 0;
```

Avec ce code on définie une variable <b>test</b> qui aura une valeur <b>0</b> de type primitif <b>int</b>.
#### type de variable
Il y a deux types de variable, soit on donne é la variable un type primitif:

#### type primitive

<ul>
<li><b>byte</b> : (1 octet ) entiers compris entre -128 et +127 (-27 et 27-1)</li>
<li><b>short</b> : (2 octets ) entiers compris entre -32768 et +32767 (-215 et 215-1)</li>
<li><b>long</b>  : (8 octets ) entiers compris entre -9223372036854775808 et +9223372036854775807 (-263 et 263-1)</li>
<li><b>int</b> : (4 octets ) entiers compris entre -2147483648 et +2147483647 (-231 et 231-1)</li>
<li><b>float</b> : ( 4 octets )  dans ce cas max vaut 255 : ensemble des nombres [-3.40282347E38 .. -1.40239846E-45], 0, [1.40239846E-45 .. 3.40282347E38]</li>
<li><b>double</b> : ( 8 octets ) dans ce cas max vaut 2047 : ensemble des nombres [-1.79769313486231570E308 .. -4.94065645841246544E-324], 0, [4.94065645841246544E-324 .. 1.79769313486231570E308]</li>
<li><b>char</b> : Ensemble des valeurs unicode ( valeurs de é\u0000é é é\uffffé avec 4 chiffres obligatoires aprés é\ué) Les 128 premiers caractéres sont les codes ASCII et se notent entre apostrophes : éaé, é1é, é\é, é\né.
Compléments déinformation sur Unicode, et aussi ici.
Un caractére est représenté sur 2 octets.</li>
</ul>

#### type d'objet

Le type peut étre un Objet soit qu'on récupére dans une librairie soit une classe qu'on a cré. Par exemple : 

``` java
	String test = "coucou";
```


Avec ce code on définie une variable <b>test</b> qui aura une valeur <b>coucou</b> de type primitif <b>String</b> qui est une classe de la librairie <b>java.lang</b>.

### les conditions 

Les conditions en java sont gérés de cette maniére :

``` java
if(test!=0){
 // do something
}
```

on peut également faire un si la condition est respecté et si la condition n'est pas respecté de cette maniére :

``` java
if(test!=0){
 // do something
}else{
 // do something
}
```

on peut aussi faire une mécanique de si cette condition est respecté si une autre conditon est respecté ou sinon de cette mani?re :

``` java
if(test>0){
 // do something
}
else if(test ==0){
 // do something
}
else{
 // do something
}
```

on peut également faire des switch en java : 


``` java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
```



#### les différents opérateurs 

Comparaison :

<ul>
<li> < </li>
<li> <= </li>
<li> == </li>
<li> != </li>
<li> > </li>
<li> >= </li>
</ul>

Logique :

<ul>
<li>&&</li>
<li>||</li>
<li>!</li>
</ul>


### les boucles 

#### for 

``` java 
for(int i =0; i < 10; i++){
 // do something
}
```

#### foreach

``` java 
for( String s : list){
// do something
}
```

#### do while
``` java 
do {
			System.out.println(i);
			i++;
		} while (i <= 10);

```

#### while

``` java 
while (/* Condition */)
{
  //Instructions é répéter
}
```


## Lancer l'application 

pour builder et avoir un jar executable sur eclipse click droit sur le projet <b>Run as > maven install</b>.

Ouvrir une invite de commande dans target et taper

``` java 
java -jar RPGFight-0.0.1-SNAPSHOT.jar
```

un "yo" devrait apparaitre.

le code derriére éa est assez simple il est dans ma classe Main.java 


``` java 
public class Main {
	
	public static void main(String[] args) {
		System.out.println("yo");
	}
}
```

Cette classe Main sera la classe qui va permettre de lancer notre projet.

# Exercice 1

Faire bouger un personnage sur un terrain.

Faire un terrain de 5 X 5. Ce terrain sera un tableau de deux dimensions.
Exemple de tableau en deux dimensions en java : 
``` java

char[][] terrain = new char[4][4];

```
### Premiere étape : 

afficher le terrain dans la console. Chaque case sera représenté par un point. Et il faudra placer sur ce terrain sur la case [0][0] un caract?re o qui représentera notre personnage.
La methode qui permet en java d'afficher quelque chose dans la console est : 
``` java
System.out.print("o");
```

résultat voulue : 

``` 
o....    
.....    
.....
.....
.....
```
### Deuxieme étape :

Il faudra dans un deuxi?me temps pouvoir déplacer le personnage. Une fois la premi?re étape est que tu as ce résultat : 

``` 
o....    
.....    
.....
.....
.....
```

il faudra attendre que l'utilisateur tape sur une touche soit z ( le personnage monte si c'est possible) soit s (le personnage descend si c'est possible) soit q (le personnage va ? gauche si c'est possible) soit d (le personnage va ? droite si c'est possible).
Exemple: 


``` 
o....    
.....    
.....
.....
.....
```
l'utilisateur appui sur d

``` 
.o...    
.....    
.....
.....
.....
```
l'utilisateur appui sur s

``` 
.....    
.o...    
.....
.....
.....
```
l'utilisateur appui sur q

``` 
.....    
o....    
.....
.....
.....
```

l'utilisateur appui sur z

``` 
o....    
.....    
.....
.....
.....
```

Ce n'est pas grave si ça ne clear pas la console mais si je met dans ma console "exit" mon programme s'arrête.

### Deuxième exercice: 

- Ajouter une fonctionnalité qui efface le tableau précédent.

``` java
	System.out.print("\033[H\033[2J");  
        System.out.flush();

```

Cette méthode ne marchera pas pas sur la console d'eclipse mais si on build le jar et qu'on le lance via un console ça marchera bien.

- Ajouter un caractère 'm' sur le terrain aléatoirement si on le personnage touche le 'm' on créé une nouvelle map où l'on place un nombre aléatoire de monstre sur la partie droite (entre 1 et 4).


``` 
o.m..    
.....    
.....
.....
.....
```

``` 
.om..    
.....    
.....
.....
.....
```
``` 
..o..    
.....    
.....
.....
.....
```
``` 
.....    
...m.    
.o.m.
...m.
.....
```

- Ajouter un nombre de point de vie de 100 pour le héro et 5 point de dégat. Pour les monstres chacun a 20 hp et 2 points de dégat.

``` 
.....    
...m.    
.o.m.
...m.
.....
héro :
hp: 100/100 
dps: 5 
monstre 1 :     monstre 2 :    monstre 3 :
hp: 20/20       hp: 20/20      hp: 20/20
dps: 2          dps: 2         dps: 2 
```
- En combat vous attaquez un monstre en tapant "attack 1" pour attaquer le premier monstre ou "attack 2" pour le second etc .. et les monstres vous infligent également des dégats pendant cette action.
- Si tout monstres sont morts afficher "victory" et revenir sur la map en 0,0.
- Si le héro est mort afficher "Game over" et revenir sur la map en 0,0.

https://www.journaldunet.fr/web-tech/developpement/1202399-comment-generer-un-nombre-aleatoire-random-en-java-compris-entre-deux-chiffres/

<b>BON COURAGE!</b>
