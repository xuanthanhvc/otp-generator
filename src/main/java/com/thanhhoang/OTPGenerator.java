package com.thanhhoang;

import com.j256.twofactorauth.TimeBasedOneTimePasswordUtil;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class OTPGenerator {
    private static String secret;
    public static void main(String... args) throws GeneralSecurityException {
        try {
            File myObj = new File("secret.txt");
            Scanner myReader = new Scanner(myObj);
            // Read the first line only
            if (myReader.hasNextLine()) {
                secret = myReader.nextLine();
                System.out.println(secret);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String otp = TimeBasedOneTimePasswordUtil.generateCurrentNumberString(args.length == 0 ? secret : args[0]);
        System.out.println("OTP Code generated: " + otp);
        StringSelection stringSelection = new StringSelection(otp);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}
