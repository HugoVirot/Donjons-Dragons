class NomImageTropLongsException extends Exception {
    public NomImageTropLongsException(){
        super("Vous essayez de donner un nom ou un nom d'image trop long au personnage !");
        System.out.println("Vous essayez de donner un nom ou un nom d'image trop long au personnage !");
    }
}
