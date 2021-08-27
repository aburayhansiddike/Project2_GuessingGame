import java.util.Random;

public class GetTheMovie {
    Random random = new Random();
    Movies movie = new Movies();

    public String nameOfMovie(){
        int lengthOfMovieList = movie.movies.length;
        int randomIndexOfMovie = random.nextInt(lengthOfMovieList);
        return movie.movies[randomIndexOfMovie];
    }

    public int lengthOfMovie(String nameOfMovie){
        return nameOfMovie.length();
    }

    public StringBuffer convertMovieNameWithUnderScore(StringBuffer underScoreString){
        int lengthOfMovie = underScoreString.length();
        StringBuffer underScore = new StringBuffer();
        for(int i = 0 ; i < lengthOfMovie; i++){
            if(underScoreString.charAt(i) != ' '){
                underScore.append('_');
            }else{
                underScore.append(' ');
            }
        }
        return  underScore;

    }

    public boolean checkMatching(String nameOfMovie , char letter ){
       int lengthOfMovie = nameOfMovie.length();
       for(int i = 0 ; i < lengthOfMovie; i++){
           if(nameOfMovie.charAt(i) == letter){
               return  true;
           }
       }
       return  false;
    }

    public StringBuffer replaceTheMatchingChar(String nameOfMovie , char letter){
        int lengthOfMovie = nameOfMovie.length();
        int index = nameOfMovie.lastIndexOf(letter);
        StringBuffer replacedString = new StringBuffer();
        for(int i = 0 ; i <= index; i++){
            replacedString.append(nameOfMovie.charAt(i));
        }
        for(int i = index + 1 ; i < lengthOfMovie; i++){
            if(nameOfMovie.charAt(i) != ' '){
                replacedString.append('_');
            }else{
                replacedString.append(' ');
            }
        }
        return replacedString;
    }

    public boolean checkAllCharacter(String nameOfMovie , StringBuffer newString){
        for(int i = 0 ; i < nameOfMovie.length(); i++){
            if(nameOfMovie.charAt(i) != newString.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
