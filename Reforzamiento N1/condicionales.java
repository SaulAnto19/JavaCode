public class condicionales {
    public static void main(String[] args) {
        
        int matematicas = 6;
        int biologia = 6;
        int quimica = 6;
        int promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        if(promedio >= 6){
            System.out.println("El alumno aprobo " + promedio);
        }else{
            System.out.println("El alumno reprobo " + promedio);
        }
    }
}
