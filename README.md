# Yam's 2019-2020

Kata d'utilisation des tests

Le yahtzee (aussi orthographié yatzee, yatzy) ou le yam's pour les puristes, est un jeu de société traditionnel de hasard raisonné.
Le but est d'enchaîner les combinaisons à l'aide de cinq dés pour remporter un maximum de points. 

Il appartient au domaine public.

# Validation
Le code donné ne permet pas de jouer complétement une partie. Il faut le valider en produisant les tests suivants en utilisant la notation
GIVEN_WHEN_THEN:

## Partie mineure
- Test 1  : ones, les joueurs doivent obtenir le plus grand nombre de dés avec la face 1
- Test 2  : twos, les joueurs doivent obtenir le plus grand nombre de dés avec la face 1
- Test 3  : threes, les joueurs doivent obtenir le plus grand nombre de dés avec la face 1
- Test 4  : fours, les joueurs doivent obtenir le plus grand nombre de dés avec la face 1
- Test 5  : fives, les joueurs doivent obtenir le plus grand nombre de dés avec la face 1
- Test 6  : sixes, les joueurs doivent obtenir le plus grand nombre de dés avec la face 1

## Partie majeure
- Test 7  : yahtzee, les joueurs doivent obtenir 5 dés de même valeur / ils marquent 50 points
- Test 8  : two_pair,  les joueurs doivent obtenir deux paires / ils marquent la somme de chaque paire
- Test 9  : three_of_a_kind, les joueurs doivent obtenir 3 dés de même valeur / ils marquent 3 fois la valeur des dés identiques
- Test 10 : fullHouse, les joueurs doivent obtenir 3 dés de même valeur et 2 dés de même valeur – (brelan + paire) / ils marquent 25 points
- Test 11 : four_of_a_kind, les joueurs doivent obtenir 4 dés de même valeur / ils marquent 4 fois la valeur des dés identiques
- Test 12 : chance, les joueurs doivent obtenir le plus grand nombre de points / ils marquent la somme de la valeur des dés
- Test 13 : smallStraight, les joueurs doivent obtenir 4 dés qui se suivent (1-2-3-4 / 2-3-4-5 / 3-4-5-6) / ils marquent 30 points
- Test 14 : largeStraight, les joueurs doivent obtenir 5 dés qui se suivent (1-2-3-4-5 / 2-3-4-5-6) / ils marquent 40 points
- Test 15 : score_pair, les joueurs doivent obtenir deux dés de même valeur / ils marquent la somme des deux dés

# Extension
Ajouter les fonctions suivantes et les tester :
- La "Rigole" : il s'agit d'un carré amélioré, c'est-à-dire 4 dés identiques + un cinquième dé ayant la valeur de la face 
opposée à celle des 4 dés (4x[1] et 1x[6], ou 4x[4] et 1x[3], ou encore 4x[2] et 1x[5]) / ils marquent 4 fois la valeur des dés identiques plus 25 points
- La "montage" : c'est une double paire améliorée, les paires se suivent et le dernier dés a une valeur suivante de la plus grande paire (2x[1] et 2x[2] et [3], 
ou encore 2x[4] et 2x[5] et [6]) / / ils marquent la somme de chaque paire plus 15 points

# Contributeurs
- Cyrille FRANCOIS
- Simon GAUTHERON
- Ian Gruson
