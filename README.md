# Java training

Ce dépôt git contient le code du tutorial Java.

Pour tout lancer:
```bash
mvn verify
```

Par défaut, certains projets ont leurs tests désactivés via la propriété
``<skipTests>false</skipTests>`` dans leur ``pom.xml``.

Pour forcer le lancement des tests, il faut passer la propriété à ``true``
ou il suffit de lancer en ligne de commande

```bash
mvn test -DskipTests=false
```

# Exercices

## Exercice 00: HelloWorld

__but__: écrire un ``HelloWorld``, le compiler et le lancer avec la console.

## Exercice 01: HelloWorld - bis

__but__: écrire un ``HelloWorld``, le compiler et le lancer avec une IDE comme
eclipse

## Exercice 02: basic java

__but__: Donner des exemples d'utilisation des types de base
- les types primitifs, les tableaux
- les chaînes de caractères ``String``
- les classes de base ``ArrayList`` et ``HashMap``

## Exercice 05: Le stock de café

__but__: Manipuler les tableaux, les boucles, les if/then/else

__steps__:
- Ouvrir la classe ``org.infozesk.coffee.CoffeeStock`` et remplir les ``TODO``
- Les tests JUnit doivent passer, pour les lancer en ligne de commande:
```bash
mvn test -DskipTests=false
```
depuis le dossier ``exercice_05``.

__bonus__: Utiliser la classe ``org.infozesk.coffee.CoffeeTools`` pour récupérer
les types/prix depuis un fichier ``stock.properties``.

## Exercice 10: classes basiques

__but__: Ecrire et tester une classe simple, avec méthode et attribut

__steps__:
- Ouvrir la classe ``org.infozesk.coffee.CoffeeMachine`` et remplir les ``TODO``
- Les tests JUnit doivent passer, pour les lancer en ligne de commande:
```bash
mvn test -DskipTests=false
```
depuis le dossier ``exercice_10``.