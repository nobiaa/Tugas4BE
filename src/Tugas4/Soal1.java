package Tugas4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Soal1 {

        public static boolean isEmail(String str) {
            Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
            return pattern.matcher(str).matches();
        }

        public static boolean isDateDDMMYYYY(String str) {
            Pattern pattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
            return pattern.matcher(str).matches();
        }

        public static boolean isDateDDDDMMMMYY(String str) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+,\\s[a-zA-Z]+\\s\\d{2}$");
            return pattern.matcher(str).matches();
        }

        public static boolean isIPAddress(String str) {
            Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
            return pattern.matcher(str).matches();
        }

        public static void main(String[] args) {
            String email = "noviarhyuu1027@gmail.com";
            String tanggal1 = "27-10-2023";
            String tanggal2 = "Thursday, November 11";
            String ipAddress = "192.168.0.1";


            System.out.println(email + " Email : " + isEmail(email));
            System.out.println(tanggal1 + " Tanggal 1 : " + isDateDDMMYYYY(tanggal1));
            System.out.println(tanggal2 + " Tanggal 2 : " + isDateDDDDMMMMYY(tanggal2));
            System.out.println(ipAddress + " IP Address : " + isIPAddress(ipAddress));
        }

    }
