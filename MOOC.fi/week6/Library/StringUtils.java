public class StringUtils{
  public static boolean included(String word, String searched){
    word = word.trim().toUpperCase();
    searched = searched.trim().toUpperCase();

    if (word == null || searched == null){
      return false;
    }

    return word.contains(searched);
  }
}
