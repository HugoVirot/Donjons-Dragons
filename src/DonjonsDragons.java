//import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;                         //import de la fonction scanner, pour récupérer les saisies

public class DonjonsDragons {                     //classe principale du programme

    public static void main(String[] args) {      //fonction principale
        Scanner sc = new Scanner(System.in);       //activation du scanner
        int count = 0;
        Personnage[] listePersos = new Personnage[10];        //création tableau personnages
        //ArrayList listePersos = new ArrayList();
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
            System.out.println("Tapez 1 pour afficher la liste des personnages créés, 2 pour créer un Guerrier, 3 pour créer un Magicien, 4 pour quitter");
            int saisie = 0;
            while (saisie == 0) {
                try {
                    saisie = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                }
                sc.nextLine();
            }
            int logicalSize = 0;
            for (int i = 0; i < listePersos.length; i++) {
                Personnage p = listePersos[i];
                if (p != null) {
                    logicalSize++;
                }
            }
            System.out.println(logicalSize);
            if (saisie == 1) {                                  //si on tape 1, affichage liste personnages créés avec boucle
                for (int i = 0; i < listePersos.length; i++) {      //la boucle parcourt listePersos sur toute sa longueur
                    Personnage p = listePersos[i];
                    if (p != null) {
                        String infos = p.toString();
                        String infos2 = p.getInfos();
                        System.out.println("[" + i + "]" + infos + " " + infos2);
                        p.getEquipement();
                    } else {
                    }
                }
                System.out.println("Pour modifier un perso, tapez 1. Pour en supprimer un, tapez 2. Pour revenir à l'accueil, tapez n'importe quel chiffre.");
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
                    int saisie4 = 0;
                    while (saisie4 == 0) {
                        try {
                            saisie4 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Erreur ! Vous avez saisi une lettre au lieu d'un chiffre !");
                        }
                        sc.nextLine();
                    }
                    if (saisie4 > listePersos.length - 1) {
                        System.out.println("Saisie incorrecte");
                    } else {
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
                            System.out.println("Entrez le nouveau nom");
                            sc.nextLine();
                            String nouveauNom = sc.nextLine();
                            listePersos[saisie4].setNom(nouveauNom);
                            System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                        } else if (saisie2 == 2) {
                            System.out.println("Entrez la nouvelle image");
                            sc.nextLine();
                            String nouvelleImage = sc.nextLine();
                            listePersos[saisie4].setImage(nouvelleImage);
                            System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                        } else if (saisie2 == 3) {
                            System.out.println("Nouvelle attribution aléatoire des points de vie (entre 5 et 10)");
                            int nouvelleVie = 5 + (int) (Math.random() * ((10 - 5) + 1));
                            System.out.println("Les points de vie ont bien été modifiés en : " + nouvelleVie);
                        } else if (saisie2 == 4) {
                            System.out.println("Nouvelle attribution aléatoire du niveau d'attaque (entre 5 et 10)");
                            int nouvelleAttaque = 5 + (int) (Math.random() * ((10 - 5) + 1));
                            System.out.println("Le niveau d'attaque a bien été modifié en : " + nouvelleAttaque);
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
                    if (saisie4 > listePersos.length - 1) {
                        System.out.println("Saisie incorrecte");
                    } else {
                        listePersos[saisie4] = null;
                        System.out.println("Personnage supprimé !");
                    }
                } else {
                }
            } else if (saisie == 2) {                 //si on tape 2, lancement création guerrier et ses accessoires
                Guerrier g = creerGuerrier();
                Arme a = creerArme();
                Bouclier b = creerBouclier();
                g.setArme(a);
                g.setBouclier(b);
                listePersos[logicalSize] = (g);
                //listePersos.add(g);
                System.out.println("Le personnage a bien été créé !");
            } else if (saisie == 3) {                 //si on tape 3, lancement création magicien et ses accessoires
                Magicien m = creerMagicien();
                Sort s = creerSort();
                Philtre p = creerPhiltre();
                m.setSort(s);
                m.setPhiltre(p);
                listePersos[logicalSize] = (m);
                //listePersos.add(m);
                System.out.println("Le personnage a bien été créé !");
            } else if (saisie == 4) {                   //si on tape 4, fin du programme
                count = 4;
            } else {
                System.out.println("Saisie incorrecte !");
            }
        }
        System.out.println("Au revoir !");
    }

    public static Guerrier creerGuerrier() {                //méthode création guerrier
            Scanner sc = new Scanner(System.in);
            Guerrier nouveauGuerrier = null;

            while (nouveauGuerrier == null) {

            System.out.println("Création nouveau Guerrier");

            System.out.println("Entrez un nom");
            String nomG = sc.nextLine();

            System.out.println("Choisissez une image");
            String imageG = sc.nextLine();

            System.out.println("Attribution aléatoire des points de vie (entre 5 et 10)");
            int nivVie = 5 + (int) (Math.random() * ((10 - 5) + 1));
            System.out.println("Vous avez obtenu : " + nivVie + " points de vie !");

            System.out.println("Attribution aléatoire du niveau d'attaque (entre 5 et 10)");
            int nivAttaque = 5 + (int) (Math.random() * ((10 - 5) + 1));
            System.out.println("Vous avez obtenu : " + nivAttaque + " points d'attaque !");

            try {
                nouveauGuerrier = new Guerrier(nomG, imageG, nivVie, nivAttaque);
            } catch (NomImageTropLongsException e) {
                System.out.println(e.getMessage());
            }
        }
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
            if (saisie == 1) {                                 //affichage infos avec la méthode getInfos()
                System.out.println(nouveauGuerrier.getInfos());
            } else if (saisie == 2) {                          //menu de modification
                System.out.println("Tapez 1 pour modifier le nom, 2 pour l'image, 3 pour la vie, 4 pour l'attaque, 5 pour quitter");
                int saisie2 = sc.nextInt();
                if (saisie2 == 1) {
                    System.out.println("Entrez le nouveau nom");
                    sc.nextLine();
                    String nouveauNom = sc.nextLine();
                    nouveauGuerrier.setNom(nouveauNom);
                    System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                } else if (saisie2 == 2) {
                    System.out.println("Entrez la nouvelle image");
                    sc.nextLine();
                    String nouvelleImage = sc.nextLine();
                    nouveauGuerrier.setImage(nouvelleImage);
                    System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                } else if (saisie2 == 3) {
                    System.out.println("Nouvelle attribution aléatoire des points de vie (entre 5 et 10)");
                    int nouvelleVie = 5 + (int) (Math.random() * ((10 - 5) + 1));
                    System.out.println("Les points de vie ont bien été modifiés en : " + nouvelleVie);
                } else if (saisie2 == 4) {
                    System.out.println("Nouvelle attribution aléatoire du niveau d'attaque (entre 5 et 10)");
                    int nouvelleAttaque = 5 + (int) (Math.random() * ((10 - 5) + 1));
                    System.out.println("Le niveau d'attaque a bien été modifié en : " + nouvelleAttaque);
                } else if (saisie2 == 5) {
                    break;
                } else {
                    System.out.println("Saisie incorrecte !");
                }
            } else if (saisie == 3) {                 //pour continuer, on tape 3 et on quitte la boucle while
                count2 = 3;
            } else {
                System.out.println("Saisie incorrecte !");
            }
        }
        return nouveauGuerrier;                     //on renvoie le nouveau guerrier créé
    }

    public static Arme creerArme() {               //fonction de création de l'arme
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouvelle Arme");

        System.out.println("Entrez un nom");
        String nomA = sc.nextLine();

        System.out.println("Attribution aléatoire du niveau d'attaque (entre 3 et 7)");
        int nivAttaqueA = 3 + (int) (Math.random() * ((7 - 3) + 1));
        System.out.println("Votre arme a une force d'attaque de : " + nivAttaqueA + " !");

        Arme nouvelleArme = new Arme(nomA, nivAttaqueA);
        return nouvelleArme;
    }

    public static Bouclier creerBouclier() {          //idem pour le bouclier
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Bouclier");

        System.out.println("Entrez un nom");
        String nomB = sc.nextLine();

        Bouclier nouveauBouclier = new Bouclier(nomB);
        return nouveauBouclier;
    }


    public static Magicien creerMagicien() {        //fonction création magicien (idem guerrier sur le principe)
        Scanner sc = new Scanner(System.in);
        Magicien nouveauMagicien = null;

        while (nouveauMagicien == null) {

            System.out.println("Création nouveau Magicien");

            System.out.println("Entrez un nom");
            String nomM = sc.nextLine();

            System.out.println("Choisissez une image");
            String imageM = sc.nextLine();

            System.out.println("Attribution aléatoire des points de vie (entre 3 et 6)");
            int nivVie = 3 + (int) (Math.random() * ((6 - 3) + 1));
            System.out.println("Vous avez obtenu : " + nivVie + " points de vie !");

            System.out.println("Attribution aléatoire du niveau d'attaque (entre 8 et 15)");
            int nivAttaque = 8 + (int) (Math.random() * ((15 - 8) + 1));
            System.out.println("Vous avez obtenu : " + nivAttaque + " points d'attaque !");

            try {
                nouveauMagicien = new Magicien(nomM, imageM, nivVie, nivAttaque);
            } catch (NomImageTropLongsException e) {
                System.out.println(e.getMessage());
            }
        }
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
                System.out.println(nouveauMagicien.getInfos());
            } else if (saisie == 2) {
                int count3 = 0;
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
                    System.out.println("Entrez le nouveau nom");
                    sc.nextLine();
                    String nouveauNom = sc.nextLine();
                    nouveauMagicien.setNom(nouveauNom);
                    System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                } else if (saisie2 == 2) {
                    System.out.println("Entrez la nouvelle image");
                    sc.nextLine();
                    String nouvelleImage = sc.nextLine();
                    nouveauMagicien.setImage(nouvelleImage);
                    System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                } else if (saisie2 == 3) {
                    System.out.println("Nouvelle attribution aléatoire des points de vie (entre 5 et 10)");
                    int nouvelleVie = 3 + (int) (Math.random() * ((6 - 3) + 1));
                    System.out.println("Les points de vie ont bien été modifiés en : " + nouvelleVie);
                } else if (saisie2 == 4) {
                    System.out.println("Nouvelle attribution aléatoire du niveau d'attaque (entre 8 et 15)");
                    int nouvelleAttaque = 8 + (int) (Math.random() * ((15 - 8) + 1));
                    System.out.println("Le niveau d'attaque a bien été modifié en : " + nouvelleAttaque);
                } else if (saisie2 == 5) {
                    break;
                } else {
                    System.out.println("Saisie incorrecte !");
                }
            } else if (saisie == 3) {
                count2 = 3;
            } else {
                System.out.println("Saisie incorrecte !");
            }
        }
        return nouveauMagicien;
    }

    public static Sort creerSort() {       //fonction création sort
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Sort");

        System.out.println("Entrez un nom");
        String nomS = sc.nextLine();

        System.out.println("Attribution aléatoire du niveau d'attaque (entre 2 et 9)");
        int nivAttaqueS = 2 + (int) (Math.random() * ((9 - 2) + 1));
        System.out.println("Votre sort a une force d'attaque de : " + nivAttaqueS + " !");

        Sort nouveauSort = new Sort(nomS, nivAttaqueS);
        return nouveauSort;
    }

    public static Philtre creerPhiltre() {   //idem philtre
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Philtre");

        System.out.println("Entrez un nom");
        String nomP = sc.nextLine();

        Philtre nouveauPhiltre = new Philtre(nomP);
        return nouveauPhiltre;
    }
}


