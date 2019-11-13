public class FirstUpper {

    public char run(String input){
        if(input.equals("")){
            return 0;
        }
        else{
            for(int i = 0; i < input.length(); i++){
                char character = input.charAt(i);
                if(Character.isUpperCase(character)){
                    return character;
                }
                else{
                    run(input.substring(i, input.length() - 1));
                }
            }
        }
        return 0;
    }

}
