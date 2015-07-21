/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1655647
 */
public class Pratica91 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().totalMemory() / (1000 * 1024));
        System.out.println(Runtime.getRuntime().freeMemory() / (1000 * 1024));
        System.out.println(Runtime.getRuntime().maxMemory() / (1000 * 1024));
    }
}
