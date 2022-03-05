package com.company;

public class Names {
    public static void main(String[] args) {
     String firstName = "Lola"; // gotta write what type of data it is
     String lastName = "Lolita"; //here too
        System.out.println(fullName(firstName,lastName)); // gotta write the name of the method and the variables between brackets
    }
        public static String fullName (String firstName,String lastName ) { //gotta write type of data outside and inside
        return "the name is" + " " +  firstName + " " + lastName;
    }
}
