
import javax.xml.bind.SchemaOutputResolver;
import java.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetTheMovie getTheMovie = new GetTheMovie();
        String nameOfMovie = getTheMovie.nameOfMovie();
        int lengthOfMovie = getTheMovie.lengthOfMovie(nameOfMovie);
        System.out.println(nameOfMovie);
        StringBuffer nameOfMovieWithUnderScore = new StringBuffer(nameOfMovie);
        nameOfMovieWithUnderScore = getTheMovie.convertMovieNameWithUnderScore(nameOfMovieWithUnderScore);
        System.out.println(nameOfMovieWithUnderScore);

        StringBuffer wrongInputCharacter = new StringBuffer();
        int life = 10 , wrongInputNumber = 0;
        while(life > 0){
            System.out.println("You have gussed (" + wrongInputNumber + ") wrong letters : " + wrongInputCharacter +"\n");
            System.out.println("You are guessing : " + nameOfMovieWithUnderScore + "\n");
            System.out.println("Guss a letter : ");
            char inputCharacter = input.next().charAt(0);

            //CheckMaching
            boolean isContingInputCharacter = getTheMovie.checkMatching(nameOfMovie , inputCharacter );
            if(isContingInputCharacter == true){
                nameOfMovieWithUnderScore = getTheMovie.replaceTheMatchingChar(nameOfMovie ,inputCharacter);

            }else{
                wrongInputCharacter.append(inputCharacter);
                wrongInputCharacter.append(' ');
                wrongInputNumber = wrongInputNumber + 1;
                life = life - 1;
            }

            //Allcheck
            boolean isAllCharacterEqual = getTheMovie.checkAllCharacter(nameOfMovie , nameOfMovieWithUnderScore);
            if(isAllCharacterEqual == true){
                System.out.println("Your are Win \n");
                return;
            }
        }
        System.out.println("Your are lost\n");
    }
}
