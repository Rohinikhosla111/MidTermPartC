/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package midtermexam_versiona_extensioncode;

import java.util.*;  

/**
 *
 * @author ROHINI
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String userId;
        String genre;

        System.out.println("Enter the user id :");
        userId = sc.nextLine();

        System.out.println("Choose a genre from below");
        System.out.println("* Comedy");
        System.out.println("* Drama");
        System.out.println("* Action");
        System.out.println("* Mystery");
        System.out.println("Enter your selection below : ");
        genre = sc.nextLine();

        if(!genre.equals("Comedy") && !genre.equals("Drama") && !genre.equals("Action") && !genre.equals("Mystery")) {
            System.out.println("Acceptable genre not entered. User cannot be created");
        }
        else {
            UserProfile userProfile = new UserProfile(userId, genre);
            System.out.println("Created user is : " + userProfile.getUserID() + " with genre : " + userProfile.getGenre());
        }
    }
}
