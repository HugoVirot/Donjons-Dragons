import java.util.ArrayList;
import java.util.Scanner;

public class DonjonsDragons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        //int[] listePersos = new int[30];
        ArrayList listePersos = new ArrayList();

        while (count != 4) {
            System.out.println("Quel Personnage voulez-vous créer ?");
            System.out.println("Tapez 1 pour afficher la liste des personnages créés, 2 pour un Guerrier, 3 pour un Magicien, 4 pour quitter");
            int saisie = sc.nextInt();
            if (saisie == 1) {
                for (Object p : listePersos) {
                    String infos = p.toString();
                    System.out.println(infos);
                }
            }
            else if (saisie == 2) {
                Guerrier g = creerGuerrier();
                Arme a = creerArme();
                Bouclier b = creerBouclier();
                g.setArme(a);
                g.setBouclier(b);
                listePersos.add(g);
            } else if (saisie == 3) {
                Magicien m = creerMagicien();
                Sort s = creerSort();
                Philtre p = creerPhiltre();
                m.setSort(s);
                m.setPhiltre(p);
                listePersos.add(m);
            } else if (saisie == 4) {
                count = 4;
            } else {
                System.out.println("Saisie incorrecte !");
            }
        }
        System.out.println("Au revoir !");
    }

    public static Guerrier creerGuerrier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Guerrier");

        System.out.println("Entrez un nom");
        String nomG = sc.nextLine();

        System.out.println("Choisissez une image");
        String imageG = sc.nextLine();

        System.out.println("Choisissez les points de vie (entre 5 et 10)");
        int nivVie = sc.nextInt();
        /*if ((5 <= saisie) &&  (saisie<= 10)) {
            int nivVie = saisie;
            return nivVie;
        } else {
            System.out.println("Valeur saisie incorrecte");
        }*/

        System.out.println("Choisissez le niveau d'attaque (entre 5 et 10)");
        int nivAttaque = sc.nextInt();
        /*if ((5 <= saisie2) && (saisie2 <= 10)) {
            int nivAttaque = saisie2;
            return nivAttaque;
        } else {
            System.out.println("Valeur saisie incorrecte");
        }*/
        Guerrier nouveauGuerrier = new Guerrier(nomG, imageG, nivVie, nivAttaque);
        System.out.println("Tapez 1 pour afficher les infos, 2 pour les modifier, 3 pour revenir au menu");
        int saisie = sc.nextInt();
        int count2 = 0;
        while (count2 != 3) {
            if (saisie == 1) {
                System.out.println(nouveauGuerrier.getInfos());
                count2 = 3;
            } else if (saisie == 2) {
                System.out.println("Tapez 1 pour modifier le nom, 2 pour l'image, 3 pour la vie, 4 pour l'attaque, 5 pour quitter");
                int saisie2 = sc.nextInt();
                if (saisie2 == 1) {
                    System.out.println("Entrez le nouveau nom");
                    String nouveauNom = sc.nextLine();
                    nouveauGuerrier.setNom(nouveauNom);
                    System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                } else if (saisie2 == 2) {
                    System.out.println("Entrez la nouvelle image");
                    String nouvelleImage = sc.nextLine();
                    nouveauGuerrier.setImage(nouvelleImage);
                    System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                } else if (saisie2 == 3) {
                    System.out.println("Entrez les nouveaux points de vie");
                    int nouvelleVie = sc.nextInt();
                    nouveauGuerrier.setVie(nouvelleVie);
                    System.out.println("Les points de vie ont bien été modifiés en : " + nouvelleVie);
                } else if (saisie2 == 4) {
                    System.out.println("Entrez le nouveau niveau d'attaque");
                    int nouvelleAttaque = sc.nextInt();
                    nouveauGuerrier.setAttaque(nouvelleAttaque);
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
        return nouveauGuerrier;
    }

    public static Arme creerArme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouvelle Arme");

        System.out.println("Entrez un nom");
        String nomA = sc.nextLine();

        System.out.println("Choisissez le niveau d'attaque");
        int nivAttaqueA = sc.nextInt();

        Arme nouvelleArme = new Arme(nomA, nivAttaqueA);
        return nouvelleArme;
    }

    public static Bouclier creerBouclier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Bouclier");

        System.out.println("Entrez un nom");
        String nomB = sc.nextLine();

        Bouclier nouveauBouclier = new Bouclier(nomB);
        return nouveauBouclier;
    }


    public static Magicien creerMagicien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Magicien");

        System.out.println("Entrez un nom");
        String nomM = sc.nextLine();

        System.out.println("Choisissez une image");
        String imageM = sc.nextLine();

        System.out.println("Choisissez les points de vie (entre 3 et 6)");
        int nivVie = sc.nextInt();
        /*if ((3 <= saisie) && (saisie <= 6)) {
            int nivVie = saisie;
            return nivVie;
        } else {
            System.out.println("Valeur saisie incorrecte");
        }*/

        System.out.println("Choisissez le niveau d'attaque (entre 8 et 15)");
        int nivAttaque = sc.nextInt();
        /*int saisie2 = Integer.parseInt(valeurSaisie);
        if ((8 <= saisie2) && (saisie2 <= 15)) {
            int nivAttaque = saisie2;
            return nivAttaque;
        } else {
            System.out.println("Valeur saisie incorrecte");
        }*/

        Magicien nouveauMagicien = new Magicien(nomM, imageM, nivVie, nivAttaque);
        System.out.println("Tapez 1 pour afficher les infos, 2 pour les modifier, 3 pour revenir au menu");
        int saisie = sc.nextInt();
        int count2 = 0;
        while (count2 != 3) {
            if (saisie == 1) {
                System.out.println(nouveauMagicien.getInfos());
                count2 = 3;
            } else if (saisie == 2) {
                int count3 = 0;
                    System.out.println("Tapez 1 pour modifier le nom, 2 pour l'image, 3 pour la vie, 4 pour l'attaque, 5 pour quitter");
                    int saisie2 = sc.nextInt();
                    if (saisie2 == 1) {
                        System.out.println("Entrez le nouveau nom");
                        String nouveauNom = sc.nextLine();
                        nouveauMagicien.setNom(nouveauNom);
                        System.out.println("Le nom a bien été modifié en : " + nouveauNom);
                    } else if (saisie2 == 2) {
                        System.out.println("Entrez la nouvelle image");
                        String nouvelleImage = sc.nextLine();
                        nouveauMagicien.setImage(nouvelleImage);
                        System.out.println("L'image a bien été modifiée en : " + nouvelleImage);
                    } else if (saisie2 == 3) {
                        System.out.println("Entrez les nouveaux points de vie");
                        int nouvelleVie = sc.nextInt();
                        nouveauMagicien.setVie(nouvelleVie);
                        System.out.println("Les points de vie ont bien été modifiés en : " + nouvelleVie);
                    } else if (saisie2 == 4) {
                        System.out.println("Entrez le nouveau niveau d'attaque");
                        int nouvelleAttaque = sc.nextInt();
                        nouveauMagicien.setAttaque(nouvelleAttaque);
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

    public static Sort creerSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Sort");

        System.out.println("Entrez un nom");
        String nomS = sc.nextLine();

        System.out.println("Choisissez le niveau d'attaque");
        int nivAttaqueS = sc.nextInt();

        Sort nouveauSort = new Sort(nomS, nivAttaqueS);
        return nouveauSort;
    }

    public static Philtre creerPhiltre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Création nouveau Philtre");

        System.out.println("Entrez un nom");
        String nomP = sc.nextLine();

        Philtre nouveauPhiltre = new Philtre(nomP);
        return nouveauPhiltre;
    }
}


