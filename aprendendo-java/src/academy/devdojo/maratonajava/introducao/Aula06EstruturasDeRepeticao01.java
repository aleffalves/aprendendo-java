package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args){
        // while, do while, for
        int count = 0;
        while(count <=10){
            System.out.println(count);
            // count = count + ;
            count += 5;

            // count ++
        }
        count = 6;
        do {
            System.out.println("Do-while " + ++ count);
        } while (count < 5);

        for(int i=0; i < 10; i ++){
            System.out.println("For " + i);

        }


    }
}
