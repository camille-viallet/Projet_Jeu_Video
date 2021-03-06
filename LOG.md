# JOURNAL du Dimanche 27 juin

#### *Julian* : Hitbox ( branche `dev.hitbox` )
- Resolution de beugs sur les tirs et les balles fantomes

#### *Joan + Samuel* : Réalisation de la vidéo de rendu final

#### *Julian* : Map infinie
- Bouclage de la map
- Fixations de beugs divers

#### *Camille + Cyprien* : Changement dans les fonctions POP et WIZZ

#### *Camille + Julian* : Adaptation de la minimap à la map infinie

#### *Camille* : Amélioration monde Hiver
- Degats infligés au joueur quand il reste immobile

#### *Cyprien + Camille* : Page de fin

#### *Gergely + Théo* : Pathfinding

#### *Gergely + Camille + Cyprien* : Merge de branches sur le master
---

# JOURNAL du Samedi 26 juin
#### *Théo* : Génération de la map ( branche `dev.map` )
- nouvelle façon de générer les murs, changements dans les sprites utilisés
- Debeug collisions
- Améliorations du gameplay

#### *Joan* : Cache d'armes ( branche `dev.generation_monster` )
- Developpement des caches d'armes

#### *Camille* : Amélioration d'armes ( branche `dev.bullet` )
- Ajout de nouveaux type de balles aux armes (en  zigzag et multiple)

#### *Camille* : Amélioration de la minimap ( branche `improve.minimap` )
- Changement de l'apercu du joueur dans la minimap
- Ajout de cercles représentant les caches d'armes

#### *Camille* : Fonctions Pop et Wizz ( branche `dev.PopWizz` )
- Changement d'automates et modification de fonctions pop et wizz

#### *Julian* : Hitbox ( branche `dev.hitbox` )
- Optimisations des collisions

#### *Gergely* : Pathfinding ( branche `dev.truePathfinding` )
- L'algorithme A* ne fonctionne pas
---

# JOURNAL du Vendredi 25 juin
#### *Cyprien* : Ajout de nouvelles armes ( branche `dev.armory` )
- Implémentation de nouvelles armes

#### *Camille* : Gestion des erreurs ( branche `improve.beugs` )
- Création de méthode toString par défaut pour les entité
- Gestion des caractéres en trop dans les fichiers loader ( espaces, etc...)
- [x] `DONE` : *Merge avec le master*

#### *Camille* : Création d'une barre de vie sur les entités ( branche `dev.life` )
- Ajout d'une barre de vie sur les ennemis et les joueurs
- [x] `DONE` : *Merge avec le master*

#### *Samuel + Gergely* : Mise à jour des sprites ( branche `dev.truePathfinding` )
- Mise à jour du tour des cellules ennemies et des entités

#### *Joan + Cyprien* : Génération de cache d'armes ( branche `dev.generation_monster` )
- Ajout d'une arme aléatoire lorsqu'une box spawn
- Placement des caches d'armes dans la map

---
# JOURNAL du Jeudi 24 juin

#### *Théo + Julian* : HitBox ( branche `dev.map` )
- Probléme sur les collisions fixées
- Ajout d'arbre génération de la map
- Résolution de beugs divers
- [x] `DONE` : *Merge avec le master*

#### *Joan* : Réalisation des Sprites 
- Sprite des explosions
- Sprite des ennemis

#### *Cyprien* : Armes de corps à corps ( branche `dev.cac` )
- Cac implémentée 
- Amélioration des feuilles de sprite

#### *Camille* : Changement de saisons ( branche `dev.saison` )
- Ajout des fichiers d'animation et changement du loader en conséquence 
- Changement du loader pour prendre en compte les saisons quand necessaire
- Suppression de la classe Ground l'affichage se fait maintenant directement dans la classe saison
- Ajout de constructeurs dans Template pour prendre en compte les saisons
- Animation de la neige pour la transition entre l'été et l'hiver
- Changement de la physique dans le monde hiver
- [x] `DONE` : *Merge avec le master*

#### *Samuel + Gergely* : Mise à jour des sprites ( branche `dev.spritesheet` )
- Finition des animations
- [x] `DONE` : *Merge avec le master*

---

# JOURNAL du Mercredi 23 juin

#### *Théo* : HitBox ( branche `dev.map` )
- Affichage en temps réel de la génération de la map
- Le player apparait à la fin de la génération de la map

#### *Julian* : Hitbox ( branche `dev.map` )
- Amélioration
- Résolution beugs GJK

#### *Samuel + Gergely* : Mise à jour des sprites ( branche `dev.spritesheet` )
- Correction du spritesheet de l'ennemi et de la fréquence des balles du joueur
- Animation à la mort d'une entité
- Animation de degats

#### *Camille* : Attribution d'un automate à une entité ( branche `dev.changeAutomata` )
- Attribution d'un automate à une entité via le fichier entityAutomata.txt
- [x] `DONE` : *Merge avec le master*

#### *Cyprien* : Armes de corps à corps ( branche `dev.cac` )
- Attribution d'un automate à une entité via le fichier entityAutomata.txt
- Cac implémentée et testée

#### *Joan* : Réalisation des Sprites + générateur d'ennemis
- Sprite des ennemis
- Gnération des ennemis
---

# JOURNAL du mardi 22 juin

#### *Camille* : Menu de demarrage ( branche `dev.menu`)
- Implémentation du meneu de démarrage avec uniquement un bouton play pour le moment (à voir si on implémente les settings)
- (avec *Cyprien* ) résolution du bug d'affichage ( lié au .PNG qui était en majuscule)

- [x] `DONE` : *Merge avec le master*

#### *Camille* : Simplification de la minimap ( branche `improve.minimap`)
- Remplacement des sprite dans la minimap par un rond de couleur
    - vert : pour le joueur
    - rouge : pour les ennemis
    - gris : pour les eléments de décor

- [x] `DONE` : *Merge avec la branche `dev.spritesheet`*

#### *Julian + Théo* : Background ( branche `background`)
- Ajout d'un fond à la map


#### *Gergely + Samuel + Joan* : Résolutions diverses de beugs ( branche `dev.spritesheet`)

---
# JOURNAL du lundi 21 juin 

#### *Théo* : HitBox ( branche `hitbox` )
- Fixation de Bugs

#### *Théo + Cyprien* : Génération du sol ( branche `dev.ground` )
- Génération aléatoire d'éléments sur la carte
- Ajout du champs `Entite` pour les corps physiques. 
- Ajout d'une méthode abstraite `colisionHappened()` dans entité pour detecter si il y a des collisions
- Centrage de la map

- [ ] `TODO (for Julian)` : *énumeration pour cette méthode *

#### *Joan* : Réalisation des Sprites

#### *Gergely + Samuel* : Entité suivant un joueur ( branche `dev.tank`)
- Ne fait plus apparaitre le tank par défaut
- Créer un tank qui bouge vers l'Est
- Correction de beugs
- Création de chars suiveurs

- [x] `DONE` : *Merge avec le master*

#### *Camille* : MiniMap ( branche `dev.MiniMap` )
- Amélioration de la miniMap à l'affichage empéchant les clignotements  (remplacement du `getGraphics()` par une implémentation dans `paintComponents()` puis appel à la fonction `repaint()`)


#### *Gergely + Samuel* : Mise à jour des sprites ( branche `dev.spritesheet`)
- Mise à jour des spritesheet correspondants (char, ennemis, etc ...)
- Rotation des entitées

#### *Cyprien* : Gestion des armes ( branche `shot.try`)
- Vies et collisions associées semblent être correctes, les balles sont détruites lorsqu'elles rencontrent un mur, les ennemis peuvent subir des dommages.
- Ajout de fréquence de tir et gestion de la rapidité de tir / attaque.

#### *Cyprien* : Background ( branche `background`)
- Ajout d'un fond à la map

#### *Camille* : Menu de demarrage ( branche `dev.menu`)
- Implémentation du meneu de démarrage avec uniquement un bouton play pour le moment (à voir si on implémente les settings)


---

# JOURNAL du week end 19 & 20 juin
#### *Gergely + Samuel* : Entité suivant un joueur ( branche `dev.tank`)
- [x] `DONE` : *L'entité suit le joueur*

#### *Camille* : MiniMap ( branche `dev.MiniMap` )
- Minimap représantant la carte dans la globalité avec les entités.
- [x] `DONE` : *Minimap fonctionnelle et merge avec le master*
- [ ] `TODO` : *Voir si on affiche toute les entitées*
- [ ] `TODO` : *Verifier scintillement*

#### *Théo + Julian + Cyprien* : Génération du sol ( branche `dev.ground` )
- [x] `DONE` : *Génération aléatoire d'éléments sur la carte*

#### *Cyprien* : Gestion des armes ( branche `shot.try`)
- [x] `DONE` : *Changement d'armes fonctionnel*
- [x] `DONE` : *Amélioration des dommages*

#### *Joan* : Réalisation des Sprites

---

# JOURNAL du Vendredi 18 juin

## Répartition des tâches

#### *Théo + Julian* : HitBox ( branche `hitbox` )
- [x] `DONE` : *HitBox fonctionnel*
- [x] `DONE` : *Merge avec la branche master*

#### *Théo + Julian* : Loader des SpriteSheet ( branche `dev.loader` )
- [x] `DONE` : *Loader fonctionnel*
- [x] `DONE` : *Merge avec la branche master*

#### *Julian* : Moteur physique 

#### *Théo* : Génération d'éléments sur la Map ( branche `dev.ground` )

#### *Gergely + Samuel* : Animation des avatars ( branche `dev.avatar`)
- Correctifs divers
- [x] `DONE` : *Avatar fonctionnel*
- [x] `DONE` : *Merge et documenté avec la branche master*

#### *Joan + Cyprien* : Gestion des armes ( branche `shot.try`)
- Avancement sur la classe `Bullet`

#### *Camille* : MiniMap ( branche `dev.MiniMap` )
- Génération d'une miniMap avec l'avatar qui bouge.
- [x] `DONE` : *Affichage de la miniMap avec l'avatar qui bouge*
- [ ] `TODO` : *Ajuster la map affichée*

#### *Joan* : Réalisation des Sprites
--- 
# JOURNAL du Jeudi 17 juin

## Répartition des tâches

#### *Cyprien + Julian* : AST ( branche `proto.ast` )
- [x] `DONE` : *AST fonctionnel*
- [x] `DONE` : *Merge avec la branche master*

#### *Joan + Camille + Cyprien* : Gestion des armes ( branche `shot.try`)
- Création des classes `Bullet`, `Weapon`,`Dagger` et `Gun`
- Modification de la classe `DirectionExtension` pour obtenir la direction relative
- Génération des balles

- [ ]  `TODO` :  *Générer des balles dans la bonne direction lors du clic souris*

#### *Théo + Julian* : Loader des SpriteSheet ( branche `dev.loader` )
- Modification de la classe `AutomataLoader` et `Automaton`

- [x] `DONE` : *`AutomataLoader` terminé et testé*
- [ ] `TODO` : *`TemplatesLoader`*

#### *Julian* : GameView
- Modification de la classe `GameView`
- Camera suivant le joueur
- Affichage d'une grille en fond

- [x] `DONE` : *Fonctionnel et merge avec le master*


#### *Gergely + Samuel* : Animation des avatars ( branche `dev.avatar`)
- Refonte des fichiers .ani :modification de `AnimNode` pour Parser le fichier.

- [x] `DONE` : *Fonctionnel, documenté et merge avec le master*

**Format des fichiers d'animation .ani** :

```
<Action> <Temps> <Interrompable> <SEQUENCE D'ANIM>
```

- `Action` est une action de l'automate de type MOVE, HIT,... définie dans `EnumAction`
- `Temps` est le temps en millisecondes que prendra la séquence d'animation
- `Interrompable` définie si la séquence d'animation doit être interompue lorque l'entité ne fait rien
- `SEQUENCE D'ANIM` est la suite des index des sprites représentant la séquence d'animation

```
HIT 500 NON_INTERRUPT 12 13 14 13 12
MOVE 1000 INTERRUPT 0 1 2 1 0
```

Ci-dessus, un exemple de `.ani`. Les séquences sont dans **L'ordre décroissant de priorité** ce qui veut dire que 
l'animation du HIT intérrompra l'animation du MOVE. 

#### *Théo + Julian* : HitBox ( branche `hitbox` )
-  Création des classes `HitBox`, `Newton`,`PhysicsObject`,`Primitive` et `CirclePrimitive`
- Ajout de méthodes dans `Vector2`



---

# JOURNAL du Mercredi 16 juin

## Répartition des tâches


#### *Théo* : Loader des SpriteSheet ( branche `dev.loader` )

#### *Cyprien + Julian* : AST ( branche `proto.ast` )
- Test de la classe `AstToObject`
- Résolution d'erreurs et modification de `ActionList`

#### *Gergely + Camille + Samuel* : Animation des avatars ( branche `dev.avatar`)
- Test de l'animation d'un avatar avec les mouvements
- Modification des classes `Avatar`, `Enum_Action` et `GameView`
- Test de l'automate d'animation : langage pas optimal car ne permet pas de boucler. 

- [ ]  `TODO` :  *Changer le contenu et l'interprétation du fichier .ani : nouveau langage d'automate*
- [ ]  `TODO` :  *Hiérarchie des animations*

#### *Joan* : Réalisation des Sprites

---

# JOURNAL du Mardi 15 juin

## Répartition des tâches

#### Pour l'ensemble du groupe : 
- Réunion avec Emmanuel DUFOUR à propos de la gestion d'équipe
- Revue de code, questions / réponses, mise en commun de l'avancement, explicitation de l'architecture
- Avancement selon la même répartition de la veille

---

# JOURNAL du Lundi 14 juin

## Répartition des tâches

#### *Théo + Julian* : architecture MVC et entrées clavier


#### *Cyprien + Samuel* : représentation exécutable des automates à partir de l'AST ( branche `prototype.controller` et  `proto.ast` )
- Refactorisation des differentes classes, modification des packages pour plus de lisibilité et de compréhension du code. Avancement sur la classe `AstToObject`
- Test du Parseur

#### *Gergely + Camille* : Animation des avatars ( branche `dev.avatar`)
- Création des classes `Avatar`, `SpriteSheet` et `AutoAnim`

#### *Joan* : Réalisation des Sprites

---
# JOURNAL du Vendredi 11 juin

## Répartition des tâches

#### Pour l'ensemble du groupe : 
- Répartition des taches

#### *Théo + Julian* : architecture MVC et entrées clavier
- Travail sur les entrées du clavier
- Implémentation de l'architecture MVC

#### *Cyprien + Samuel* : représentation exécutable des automates à partir de l'AST
- Compréhension globale

#### *Gergely* : Rédaction du contrat

#### *Joan* : Recherche de Sprite

---
# JOURNAL du Jeudi 10 juin

## Répartition des tâches

#### Pour l'ensemble du groupe : 
- Mise en place de l'environnement de developpement.
- Réalisation de prototype en sous-groupes.

- [ ]  `TODO` :  *Implémentation des classes du Model*

#### *Cyprien + Julian* : implémentation du moteur d'automates
- Création des automates, ajout de transitions, lancement des actions avec la fonction step.
- Les transitions contiennent des conditions avec leur fonction `eval()` et une action effectuée avec la fonction `apply()`. 
- Implémentation des classes `Action` et `Transition`


- [x] `DONE` : *Prototype fonctionnel*

#### *Théo + Samuel + Camille* : mouvement d'un joueur 
- Mise en place de la MVC.
- Récupération des évenements souris et clavier.
- Mouvement du joueur à l'écran avec les touches du clavier.

- [x] `DONE` : *Prototype fonctionnel*

- [ ] `TODO` :  *Gestion du mouvement lors d'un appui long et gestion de plusieurs entitées*

#### *Gergely* : Rédaction du contrat

`ON GOING` 

---

# JOURNAL du Mercredi 9 juin

## Répartition des tâches

#### Pour l'ensemble du groupe :
- Reflexion autour du systéme de coordonnées.
- Elaboration de la hiérarchie de classe.
- Explicitation du flot d'execution et des mécaniques de la MVC.
- Discussions diverses afin de se mettre d'accord sur différents aspects du jeu

---

# JOURNAL du Mardi 8 juin

## Répartition des tâches

#### Pour l'ensemble du groupe :
- Réflexion et approfondissement des sujets abordés la veille.
- Prise en compte des remarques sur des éléments du jeu non pertinent
 - Réflexion sur la proposition de jeu et discussion avec le tuteur sur les idées évoquées.

#### Gergely :
- Rédaction du fichier `PROPOSAL.md`

---

# JOURNAL du Lundi 7 juin

## Répartition des tâches 

#### Pour l'ensemble du groupe : 
- Prise de connaissances des consignes et contraintes du projet.
- Réflexion sur la conception du jeu.

---



