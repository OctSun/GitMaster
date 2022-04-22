package kr.co.khs.gitmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;

import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 0;
//        try {
//
//            //FileInputStream is = new FileInputStream("/Users/hosang/GitMaster.jks");
//            FileInputStream is = new FileInputStream("/Users/hosang/a.txt");
//            KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
//            String password = "123456";
//            char[] passwd = password.toCharArray();
//            keystore.load(is, passwd);
//            String alias = "key0";
//            Key key = keystore.getKey(alias, passwd);
//            if (key instanceof PrivateKey) {
//                // Get certificate of public key
//                Certificate cert = keystore.getCertificate(alias);
//                // Get public key
//                PublicKey publicKey = cert.getPublicKey();
//
////                String publicKeyString = Base64.encodeBase64String(publicKey
////                        .getEncoded());
//                String publicKeyString  = Base64.encodeToString(publicKey.getEncoded(),0);
//                System.out.println("Key = "+publicKeyString);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }


}