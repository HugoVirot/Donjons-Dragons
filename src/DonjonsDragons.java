/**
 * Donjons & Dragons : création de personnages fantastiques
 *
 * @author Hugo Virot
 * @version 1.6
 * ce fichier DonjonsDragons.java est le programme principal
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DonjonsDragons {
    /**
     * classe principale du programme
     */

    public static void main(String[] args) {
        /**
         * Cette méthode main comprend le déroulement du programme
         */

        Scanner sc = new Scanner(System.in);       //activation du scanner
        int count = 0;
        //Personnage[] listePersos = new Personnage[10];        //création tableau personnages
        ArrayList<Personnage> listePersos = new ArrayList<>();
        System.out.println(" ______   _______  _       _________ _______  _        _______      __      ______   _______  _______  _______  _______  _        _______ \n" +
                "(  __  \\ (  ___  )( (    /|\\__    _/(  ___  )( (    /|(  ____ \\    /__\\    (  __  \\ (  ____ )(  ___  )(  ____ \\(  ___  )( (    /|(  ____ \\\n" +
                "| (  \\  )| (   ) ||  \\  ( |   )  (  | (   ) ||  \\  ( || (    \\/   ( \\/ )   | (  \\  )| (    )|| (   ) || (    \\/| (   ) ||  \\  ( || (    \\/\n" +
                "| |   ) || |   | ||   \\ | |   |  |  | |   | ||   \\ | || (_____     \\  /    | |   ) || (____)|| (___) || |      | |   | ||   \\ | || (_____ \n" +
                "| |   | || |   | || (\\ \\) |   |  |  | |   | || (\\ \\) |(_____  )    /  \\/\\  | |   | ||     __)|  ___  || | ____ | |   | || (\\ \\) |(_____  )\n" +
                "| |   ) || |   | || | \\   |   |  |  | |   | || | \\   |      ) |   / /\\  /  | |   ) || (\\ (   | (   ) || | \\_  )| |   | || | \\   |      ) |\n" +
                "| (__/  )| (___) || )  \\  ||\\_)  )  | (___) || )  \\  |/\\____) |  (  \\/  \\  | (__/  )| ) \\ \\__| )   ( || (___) || (___) || )  \\  |/\\____) |\n" +
                "(______/ (_______)|/    )_)(____/   (_______)|/    )_)\\_______)   \\___/\\/  (______/ |/   \\__/|/     \\|(_______)(_______)|/    )_)\\_______)\n" +
                "                                                                                                                                          ");
        while (count != 4) {
            System.out.println(".___  ___.  _______ .__   __.  __    __     .______   .______       __  .__   __.   ______  __  .______      ___       __      \n" +
                    "|   \\/   | |   ____||  \\ |  | |  |  |  |    |   _  \\  |   _  \\     |  | |  \\ |  |  /      ||  | |   _  \\    /   \\     |  |     \n" +
                    "|  \\  /  | |  |__   |   \\|  | |  |  |  |    |  |_)  | |  |_)  |    |  | |   \\|  | |  ,----'|  | |  |_)  |  /  ^  \\    |  |     \n" +
                    "|  |\\/|  | |   __|  |  . `  | |  |  |  |    |   ___/  |      /     |  | |  . `  | |  |     |  | |   ___/  /  /_\\  \\   |  |     \n" +
                    "|  |  |  | |  |____ |  |\\   | |  `--'  |    |  |      |  |\\  \\----.|  | |  |\\   | |  `----.|  | |  |     /  _____  \\  |  `----.\n" +
                    "|__|  |__| |_______||__| \\__|  \\______/     | _|      | _| `._____||__| |__| \\__|  \\______||__| | _|    /__/     \\__\\ |_______|\n" +
                    "                                                                                                                               ");
            System.out.println("Tapez 1 pour afficher la liste des personnages créés, 2 pour en créer un, 3 pour commencer la partie, 4 pour quitter");
            int saisie = 0;
            /*
             * @exception : ici, quand on saisit une lettre au lieu d'un chiffre, l'exception est prévue grâce au code ci-dessous : un message d'erreur s'affiche
             */
            while (saisie == 0) {
                try {
                    saisie = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                }
                sc.nextLine();
            }
            /*int logicalSize = 0;
            for (int i = 0; i < listePersos.length; i++) {
                Personnage p = listePersos[i];
                if (p != null) {
                    logicalSize++;
                }
            }*/

            /** si on tape 1, affichage liste personnages créés avec boucle
             * *la boucle parcourt listePersos sur toute sa longueur
             */
            if (saisie == 1) {
                /*
                for (int i = 0; i < listePersos.length; i++) {
                    Personnage p = listePersos[i];
                    if (p != null) {
                        String infos = p.toString();
                        String infos2 = p.getInfos();
                        System.out.println("[" + i + "]" + infos + " " + infos2);
                        p.getEquipement();
                    } else {
                    }
                }*/
                for (int i = 0; i < listePersos.size(); i++) {
                    Personnage persoAAfficher = listePersos.get(i);
                    System.out.println("[" + i + "] " + persoAAfficher.toString());
                    System.out.println(persoAAfficher.getInfos());
                    System.out.println(persoAAfficher.getMoyenAttaqueDefense());
                }

                /**
                 * Menu modification / suppression persos / retour
                 */
                System.out.println("Pour modifier un perso, tapez 1. Pour en supprimer un, tapez 2. Pour en sélectionner un, tapez 3. Pour revenir à l'accueil, tapez n'importe quel chiffre.");
                int saisie3 = 0;
                while (saisie3 == 0) {
                    try {
                        saisie3 = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                    }
                    sc.nextLine();
                }
                if (saisie3 == 1) {
                    System.out.println("Tapez l'indice du personnage à modifier");
                    int saisie4 = -1;
                    while (saisie4 == -1) {
                        try {
                            saisie4 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                        }
                        sc.nextLine();
                    }
                    if (saisie4 > listePersos.size()) {
                        System.out.println("Saisie incorrecte");
                    } else {
                        /**
                         * Menu modification caractéristiques personnage
                         */
                        System.out.println("Voici le personnage choisi :");
                        Personnage persoAAfficher = listePersos.get(saisie4);
                        System.out.println("[" + saisie4 + "] " + persoAAfficher.toString());
                        System.out.println(persoAAfficher.getInfos());
                        System.out.println(persoAAfficher.getMoyenAttaqueDefense());
                        System.out.println("Tapez 1 pour modifier le nom, 2 pour l'image, 3 pour la vie, 4 pour l'attaque, 5 pour quitter");
                        int saisie2 = sc.nextInt();
                        while (saisie2 == 0) {
                            try {
                                saisie2 = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                            }
                            sc.nextLine();
                        }
                        if (saisie2 == 1) {
                            sc.nextLine();
                            String nouveauNom = null;
                            while (nouveauNom == null) {
                                try {
                                    System.out.println("Entrez le nouveau nom");
                                    nouveauNom = sc.nextLine();
                                    Personnage persoAModifier = listePersos.get(saisie4);
                                    persoAModifier.setNom(nouveauNom);
                                } catch (NomImageTropLongsException e) {
                                    nouveauNom = null;
                                }
                            }
                            System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                        } else if (saisie2 == 2) {
                            sc.nextLine();
                            String nouvelleImage = null;
                            while (nouvelleImage == null) {
                                try {
                                    System.out.println("Entrez la nouvelle image");
                                    nouvelleImage = sc.nextLine();
                                    Personnage persoAModifier = listePersos.get(saisie4);
                                    persoAModifier.setImage(nouvelleImage);
                                    //listePersos[saisie4].setimage(nouvelleImage);
                                } catch (NomImageTropLongsException e) {
                                    nouvelleImage = null;
                                }
                            }
                            System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                        } else if (saisie2 == 3) {
                            System.out.println("Nouvelle attribution aléatoire des points de vie ");
                            Personnage persoAModifier = listePersos.get(saisie4);
                            persoAModifier.initVie();
                            //listePersos[saisie4].initVie();
                            System.out.println("Les points de vie ont bien été modifiés en : " + persoAModifier.getVie());
                        } else if (saisie2 == 4) {
                            System.out.println("Nouvelle attribution aléatoire du niveau d'attaque (entre 5 et 10)");
                            Personnage persoAModifier = listePersos.get(saisie4);
                            persoAModifier.initVie();
                            //listePersos[saisie4].initAttaque();
                            System.out.println("Le niveau d'attaque a bien été modifié en : " + persoAModifier.getAttaque());
                        } else if (saisie2 == 5) {

                        } else {
                            System.out.println("Saisie incorrecte !");
                        }
                    }
                } else if (saisie3 == 2) {
                    System.out.println("Tapez l'indice du personnage à supprimer");
                    int saisie4 = 0;
                    while (saisie4 == 0) {
                        try {
                            saisie4 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                        }
                        sc.nextLine();
                    }
                    if (saisie4 > listePersos.size() - 1) {
                        System.out.println("Saisie incorrecte");
                    } else {
                        listePersos.remove(saisie4);
                        System.out.println("Personnage supprimé !");
                    }
                } else if (saisie3 == 3) {
                    System.out.println("Tapez l'indice du personnage choisi");
                    int saisie4 = -1;
                    while (saisie4 == -1) {
                        try {
                            saisie4 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                        }
                        sc.nextLine();
                    }
                    if (saisie4 > listePersos.size()) {
                        System.out.println("Saisie incorrecte");
                    } else {
                        System.out.println("Voici le personnage choisi :");
                        Personnage persoAAfficher = listePersos.get(saisie4);
                        System.out.println("[" + saisie4 + "] " + persoAAfficher.toString());
                        System.out.println(persoAAfficher.getInfos());
                        System.out.println(persoAAfficher.getMoyenAttaqueDefense());
                        persoAAfficher.setSelected();
                    }
                }
            } else if (saisie == 2) {                                 //si on tape 2, lancement création personnage
                Personnage nouveauPerso = creerPerso();
                //listePersos[logicalSize] = nouveauPerso;
                listePersos.add(nouveauPerso);
                System.out.println("Le personnage a bien été créé !");
            } else if (saisie == 3) {
                System.out.println("Nouvelle partie");
                ArrayList<Case> plateauJeu = new ArrayList<>();             //création tableau

                for (int i = 0; i < listePersos.size(); i++) {      //récupération perso sélectionné
                    Personnage perso = listePersos.get(i);
                    Personnage persoSelectionne = null;
                    if (perso.getSelected() == true) {
                        persoSelectionne = perso;
                    }
                    System.out.println("Vous allez jouer avec le personnage suivant");  //affichage infos perso
                    System.out.println("[" + i + "] " + persoSelectionne.toString());
                    System.out.println(persoSelectionne.getInfos());
                    System.out.println(persoSelectionne.getMoyenAttaqueDefense());

                    Random random = new Random();               //début aventure
                    for (int j = 1; j < 20; j++) {
                        Case nouvelleCase = new Case();
                        plateauJeu.add(nouvelleCase);
                        System.out.println("**************************************************");
                        System.out.println("Vous êtes sur la case " + j);
                        int nombreAleatoire = random.nextInt(3);
                        nouvelleCase.setEvent(nombreAleatoire);
                        Event évènement = nouvelleCase.getEvent();
                        évènement.Action(persoSelectionne);
                    }
                }
            } else if (saisie == 4) {
                count = 4;
            } else {
                System.out.println("Saisie incorrecte !");
            }
        }
        System.out.println("Au revoir !");
    }

    /**
     * fonction création personnage (guerrier ou magicien à la fois)
     *
     * @return nouveauPerso
     */
    public static Personnage creerPerso() {
        Scanner sc = new Scanner(System.in);
        Personnage nouveauPerso = null;
        int type = 0;

        while (nouveauPerso == null) {

            System.out.println("Tapez 1 pour créer un guerrier, 2 pour un magicien, 3 pour revenir au menu");
            type = sc.nextInt();
            if (type == 1) {
                nouveauPerso = new Guerrier();
            } else if (type == 2) {
                nouveauPerso = new Magicien();
            } else if (type == 3) {
                break;
            } else {
            }
            String nomP = null;
            sc.nextLine();
            while (nomP == null) {
                try {
                    System.out.println("Entrez un nom");
                    nomP = sc.nextLine();
                    nouveauPerso.setNom(nomP);
                } catch (NomImageTropLongsException e) {
                    nomP = null;
                }
            }
            String imageP = null;
            while (imageP == null) {
                try {
                    System.out.println("Choisissez une image");
                    imageP = sc.nextLine();
                    nouveauPerso.setImage(imageP);
                } catch (NomImageTropLongsException e) {
                    imageP = null;
                }
            }
            System.out.println("Attribution aléatoire des points de vie pour " + nouveauPerso.getClass() + " (entre " + nouveauPerso.getMinVie() + " et " + nouveauPerso.getMaxVie() + ")");
            nouveauPerso.initVie();
            System.out.println("Vous avez obtenu : " + nouveauPerso.getVie() + " points de vie !");

            System.out.println("Attribution aléatoire du niveau d'attaque pour " + nouveauPerso.getClass() + " (entre " + nouveauPerso.getMinAttaque() + " et " + nouveauPerso.getMaxAttaque() + ")");
            nouveauPerso.initAttaque();
            System.out.println("Vous avez obtenu : " + nouveauPerso.getAttaque() + " points d'attaque !");

        }
        /**
         *  affichage / modification des infos
         */
        int count2 = 0;
        while (count2 != 3) {
            System.out.println("Tapez 1 pour afficher les infos, 2 pour les modifier, 3 pour continuer");
            int saisie = 0;
            while (saisie == 0) {
                try {
                    saisie = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                }
                sc.nextLine();
            }
            if (saisie == 1) {
                /**
                 * affichage infos avec la méthode getInfos()
                 */
                System.out.println(nouveauPerso.getInfos());
            } else if (saisie == 2) {
                int saisie2 = 0;
                /**
                 * menu de modification
                 */
                try {
                    System.out.println("Tapez 1 pour modifier le nom, 2 pour l'image, 3 pour la vie, 4 pour l'attaque, 5 pour quitter");
                    saisie2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                }
                if (saisie2 == 1) {
                    String nouveauNom = "";
                    try {
                        System.out.println("Entrez le nouveau nom");
                        sc.nextLine();
                        nouveauNom = sc.nextLine();
                        nouveauPerso.setNom(nouveauNom);
                    } catch (NomImageTropLongsException e) {
                    }
                    System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                } else if (saisie2 == 2) {
                    String nouvelleImage = "";
                    try {
                        System.out.println("Entrez la nouvelle image");
                        sc.nextLine();
                        nouvelleImage = sc.nextLine();
                        nouveauPerso.setImage(nouvelleImage);
                    } catch (NomImageTropLongsException e) {
                    }
                    System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                } else if (saisie2 == 3) {
                    System.out.println("Nouvelle attribution aléatoire des points de vie");
                    nouveauPerso.initVie();
                    System.out.println("Les points de vie ont bien été modifiés en : " + nouveauPerso.getVie());
                } else if (saisie2 == 4) {
                    System.out.println("Nouvelle attribution aléatoire du niveau d'attaque");
                    nouveauPerso.initAttaque();
                    System.out.println("Le niveau d'attaque a bien été modifié en : " + nouveauPerso.getAttaque());
                } else if (saisie2 == 5) {
                    break;
                } else {
                    System.out.println("Saisie incorrecte !");
                }
            } else if (saisie == 3) {
                count2 = 3;
                /**
                 * pour continuer, on tape 3 et on quitte la boucle while
                 */
            } else {
                System.out.println("Saisie incorrecte !");
            }
        }
        /**
         * Création moyen d'attaque du perso
         */
        MoyenAttaque nouveauMoyenAttaque = null;
        System.out.println("Création Arme/Sort : choississez un nom");
        String nomMA = sc.nextLine();
        System.out.println("Attribution aléatoire des points d'attaque, entre 5 et 10.");
        int niveauAttaqueMA = 5 + (int) (Math.random() * ((10 - 5) + 1));
        System.out.println("Votre Arme/Sort a obtenu une attaque de : " + niveauAttaqueMA);

        if (type == 1) {
            nouveauMoyenAttaque = new Arme(nomMA, niveauAttaqueMA);
        } else if (type == 2) {
            nouveauMoyenAttaque = new Sort(nomMA, niveauAttaqueMA);
        }
        nouveauPerso.setMoyenAttaque(nouveauMoyenAttaque);

        /**
         * Création moyen défense
         */
        MoyenDefense nouveauMoyenDefense = null;
        System.out.println("Création Bouclier/Philtre : choisissez un nom");
        String nomMD = sc.nextLine();

        if (type == 1) {
            nouveauMoyenDefense = new Bouclier(nomMD);
        } else if (type == 2) {
            nouveauMoyenDefense = new Philtre(nomMD);
        }
        nouveauPerso.setMoyenDefense(nouveauMoyenDefense);

        return nouveauPerso;
    }
}


