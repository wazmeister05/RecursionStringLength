public class LengthOfString {

    public int run(String input){
        if (input.equals("")){
            return 0;
        }
        else{
            return run(input.substring(0, input.length() - 1)) + 1;
        }
    }

}
