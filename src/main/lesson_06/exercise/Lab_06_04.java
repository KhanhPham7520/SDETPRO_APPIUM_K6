package main.lesson_06.exercise;

public class Lab_06_04 {
    public static void main(String[] args) {
        String url = "https://google.com";

        //Check http OR https
        if(url.contains("http")){
            System.out.println("Your url is using [http]");
        }else if(url.contains("https")){
            System.out.println("Your url is using [https]");
        }

        //Check domain name, .com OR .net
        if(url.contains(".com")){
            System.out.println("Your url is using domain name as [.com]");
        }else if(url.contains(".net")){
            System.out.println("Your url is using domain name as [.net]");
        }
    }
}
