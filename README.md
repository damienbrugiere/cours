# Premier cours

## Pr�-requis
Pour faire du java on a besoin d'un IDE.
<ul>
<li>[Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2019-03/R/eclipse-inst-win64.exe)</li>
<li>[intellij](https://www.jetbrains.com/idea/download/#section=windows)</li>
</ul>

Tu auras aussi besoin de [git](https://git-scm.com/download/win) et d'une jdk on va prendre une [jdk8](https://adoptopenjdk.net/). 

## La base 

### les variables

En java pour d�finir une variable il suffit de faire : 

``` java
	int test = 0;
```

Avec ce code on d�finie une variable <b>test</b> qui aura une valeur <b>0</b> de type primitif <b>int</b>.
#### type de variable
Il y a deux types de variable, soit on donne � la variable un type primitif:

#### type primitive

<ul>
<li><b>byte</b> : (1 octet ) entiers compris entre -128 et +127 (-27 et 27-1)</li>
<li><b>short</b> : (2 octets ) entiers compris entre -32768 et +32767 (-215 et 215-1)</li>
<li><b>long</b>  : (8 octets ) entiers compris entre -9223372036854775808 et +9223372036854775807 (-263 et 263-1)</li>
<li><b>int</b> : (4 octets ) entiers compris entre -2147483648 et +2147483647 (-231 et 231-1)</li>
<li><b>float</b> : ( 4 octets )  dans ce cas max vaut 255 : ensemble des nombres [-3.40282347E38 .. -1.40239846E-45], 0, [1.40239846E-45 .. 3.40282347E38]</li>
<li><b>double</b> : ( 8 octets ) dans ce cas max vaut 2047 : ensemble des nombres [-1.79769313486231570E308 .. -4.94065645841246544E-324], 0, [4.94065645841246544E-324 .. 1.79769313486231570E308]</li>
<li><b>char</b> : Ensemble des valeurs unicode ( valeurs de �\u0000� � �\uffff� avec 4 chiffres obligatoires apr�s �\u�) Les 128 premiers caract�res sont les codes ASCII et se notent entre apostrophes : �a�, �1�, �\��, �\n�.
Compl�ments d�information sur Unicode, et aussi ici.
Un caract�re est repr�sent� sur 2 octets.</li>
</ul>

#### type d'objet

Le type peut �tre un Objet soit qu'on r�cup�re dans une librairie soit une classe qu'on a cr��. Par exemple : 

``` java
	String test = "coucou";
```


Avec ce code on d�finie une variable <b>test</b> qui aura une valeur <b>coucou</b> de type primitif <b>String</b> qui est une classe de la librairie <b>java.lang</b>.

### les conditions 

Les conditions en java sont g�r�s de cette mani�re :

``` java
if(test!=0){
 // do something
}
```

on peut �galement faire un si la condition est respect� et si la condition n'est pas respect� de cette mani�re :

``` java
if(test!=0){
 // do something
}else{
 // do something
}
```

on peut aussi faire une m�canique de si cette condition est respect� si une autre conditon est respect� ou sinon de cette mani�re :

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

on peut �galement faire des switch en java : 


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



#### les diff�rents op�rateurs 

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
  //Instructions � r�p�ter
}
```


## Lancer l'application 

pour builder et avoir un jar executable sur eclipse click droit sur le projet <b>Run as > maven install</b>.

Ouvrir une invite de commande dans target et taper

``` java 
java -jar RPGFight-0.0.1-SNAPSHOT.jar
```

un "yo" devrait apparaitre.

le code derri�re �a est assez simple il est dans ma classe Main.java 


``` java 
public class Main {
	
	public static void main(String[] args) {
		System.out.println("yo");
	}
}
```

Cette classe Main sera la classe qui va permettre de lancer notre projet.