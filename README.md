le programme consiste à générer un nombre aléatoire enntre 0 et 100 afin que l'utilisateur puisse le déviné en 10 tentatives




ouvre la saisi de l'utilisateur grâce à la classe Scanner deja inclu dans le langage java,
génère le nombre aléatoire entre 0 et 100,
creation d'une variable booleenne win initialiser a false

à partir de la ligne 10 le programme parcours la boucle for 10 fois et demande a l'utilisateur de saisi un nombre,
nombre que l'utilisateur lit et la place dans une variable grade de type int. si grade est superieur au nombre aléatoire le programme
affiche plus grand(pour dire que l'utilisateur a saisi nombre plus grand que le nombre aléatoire donc qu'il saisisse un plus petit nombre) ou
si grade est inferieur il affiche plus petit (qui est le contraire de plus grand) ou sinon vous avez gagné dans le cas ou il devine le vrai numero(dans ce cas le programme
initialise la variable win a true quitte la boucle

si après le parcours de la boucle for lutilisateur ne trouve pas le nombre aleatoire le programme affiche vous avez perdu.
