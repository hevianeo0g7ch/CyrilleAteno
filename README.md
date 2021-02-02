# Yam's 2019-2020

Kata d'utilisation des tests

Le yahtzee (aussi orthographi� yatzee, yatzy) ou le yam's pour les puristes, est un jeu de soci�t� traditionnel de hasard raisonn�.
Le but est d'encha�ner les combinaisons � l'aide de cinq d�s pour remporter un maximum de points. 

Il appartient au domaine public.

# Validation
Le code donn� ne permet pas de jouer compl�tement une partie. Il faut le valider en produisant les tests suivants en utilisant la notation
GIVEN_WHEN_THEN:

## Partie mineure
- Test 1  : ones, les joueurs doivent obtenir le plus grand nombre de d�s avec la face 1
- Test 2  : twos, les joueurs doivent obtenir le plus grand nombre de d�s avec la face 1
- Test 3  : threes, les joueurs doivent obtenir le plus grand nombre de d�s avec la face 1
- Test 4  : fours, les joueurs doivent obtenir le plus grand nombre de d�s avec la face 1
- Test 5  : fives, les joueurs doivent obtenir le plus grand nombre de d�s avec la face 1
- Test 6  : sixes, les joueurs doivent obtenir le plus grand nombre de d�s avec la face 1

## Partie majeure
- Test 7  : yahtzee, les joueurs doivent obtenir 5 d�s de m�me valeur / ils marquent 50 points
- Test 8  : two_pair,  les joueurs doivent obtenir deux paires / ils marquent la somme de chaque paire
- Test 9  : three_of_a_kind, les joueurs doivent obtenir 3 d�s de m�me valeur / ils marquent 3 fois la valeur des d�s identiques
- Test 10 : fullHouse, les joueurs doivent obtenir 3 d�s de m�me valeur et 2 d�s de m�me valeur � (brelan + paire) / ils marquent 25 points
- Test 11 : four_of_a_kind, les joueurs doivent obtenir 4 d�s de m�me valeur / ils marquent 4 fois la valeur des d�s identiques
- Test 12 : chance, les joueurs doivent obtenir le plus grand nombre de points / ils marquent la somme de la valeur des d�s
- Test 13 : smallStraight, les joueurs doivent obtenir 4 d�s qui se suivent (1-2-3-4 / 2-3-4-5 / 3-4-5-6) / ils marquent 30 points
- Test 14 : largeStraight, les joueurs doivent obtenir 5 d�s qui se suivent (1-2-3-4-5 / 2-3-4-5-6) / ils marquent 40 points
- Test 15 : score_pair, les joueurs doivent obtenir deux d�s de m�me valeur / ils marquent la somme des deux d�s

# Extension
Ajouter les fonctions suivantes et les tester :
- La "Rigole" : il s'agit d'un carr� am�lior�, c'est-�-dire 4 d�s identiques + un cinqui�me d� ayant la valeur de la face 
oppos�e � celle des 4 d�s (4x[1] et 1x[6], ou 4x[4] et 1x[3], ou encore 4x[2] et 1x[5]) / ils marquent 4 fois la valeur des d�s identiques plus 25 points
- La "montage" : c'est une double paire am�lior�e, les paires se suivent et le dernier d�s a une valeur suivante de la plus grande paire (2x[1] et 2x[2] et [3], 
ou encore 2x[4] et 2x[5] et [6]) / / ils marquent la somme de chaque paire plus 15 points

# Contributeurs
- Cyrille FRANCOIS
