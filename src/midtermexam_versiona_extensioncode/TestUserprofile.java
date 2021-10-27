/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package midtermexam_versiona_extensioncode;

/**
 *
 * @author ROHINI
 */
public class TestUserprofile {
    public static void main(String[] args) {
        String userId = "ULTAN029";
        String genre = "Drama";
        UserProfile userProfile = new UserProfile(userId, genre);
        System.out.println("Created user is : " + userProfile.getUserID() + " with genre : " + userProfile.getGenre());
    }
}
