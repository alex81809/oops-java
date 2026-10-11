class string_methods {
    public static void main(String[] args) {
        //user input process can also be used rather than giving manual inputs
        String first="Cod";
        String second="ingal";
        String codingal=first+second;
        String codingalTrick="Welcome" + "to" + "Codingal";
        String codingalCapital=codingal.toUpperCase();
        String codingalSmall = codingalCapital.toLowerCase();

        //correct selling is length not lenght
        int lengthOfCodingal=codingal.length();
        int lengthOfCodingalTrick=codingalTrick.length();
        int sum=lengthOfCodingal+lengthOfCodingalTrick;

        // Guess the answer before running
        // a message can also be added for the ouput screen if required
        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }   
}
